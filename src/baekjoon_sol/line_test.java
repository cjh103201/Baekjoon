package baekjoon_sol;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author jeehyun
 * @date 20. 4. 5
 * @desc 라인 코딩테스트 
 */
public class line_test {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		// 1번
//		String inputString = "if (Count of eggs is 4.) {Buy milk.}	";
//		int answer = -1;
//		
//		String[] openCh = new String[] {"(", "{", "[", "<"};
//		String[] endCh = new String[] {")", "}", "]", ">"};
//		
//		boolean chk = false;
//		for(int i = 0; i<openCh.length; i++) {
//			
//			int stIdx = inputString.indexOf(openCh[i]);
//			int enIdx = inputString.indexOf(endCh[i]);
//			
//			if(stIdx < enIdx) {
//				if(answer == -1) {
//					answer = 1;
//				} else {
//					answer++;
//				}
//				chk = true;
//			} else if(stIdx > enIdx) {
//				chk = true;
//			}
//		}
//		
//		if(!chk) {
//			answer = 0;
//		}
//		
//		System.out.println(answer);
		
		// 2번
//		String answer_sheet = "4132315142";
//		String[] sheets = new String[] {"3241523133","4121314445","3243523133","4433325251","2412313253"};
//		int answer = -1;
		
		
		
		
		// 3번
//		String road =  "111011110011111011111100011111";
//		int n = 3;
//		int answer = -1;
//		
//		ArrayList<Integer> idxList = new ArrayList<>();
//		for(int i = 0; i<road.length(); i++) {
//			
//			String idx = String.valueOf(road.charAt(i));
//			if(idx.equals("0")) {
//				idxList.add(i);
//			}
//		}
//		
//        boolean[] visited = new boolean[idxList.size()];
//        combination(idxList, visited, 0, idxList.size(), n);
//        
		
		// 6번
//		String[] directory = new String[] {"/",
//				"/hello",
//				"/hello/tmp",
//				"/root",
//				"/root/abcd",
//				"/root/abcd/etc",
//				"/root/abcd/hello"};
//		String[] command = new String[] {"mkdir /root/tmp",
//				"cp /hello /root/tmp", 
//				"rm /hello"};
		
		String[] directory = new String[] {"/"};
		String[] command = new String[] {"mkdir /a",
				"mkdir /a/b",
				"mkdir /a/b/c",
				"cp /a/b /",
				"rm /a/b/c"};
		
		ArrayList<String> dList = new ArrayList<>(Arrays.asList(directory));
		for(String c : command) {
			
			String ord = c.split(" ")[0];
			String dir = c.split(" ")[1];
			
			switch(ord) {
				case "mkdir" :
					String[] dirs = dir.split("/");
					int index = 1;

					for(int i = 0; i<dirs.length; i++) {
						String d = "";
						for(int j = 0; j<=i; j++) {
							if(dirs[j].length() > 0) {
								d += "/" + dirs[j];
							}
						}
						
						if(d != "") {
							for(int j = 0; j<dList.size(); j++) {
								if(dList.get(j).startsWith(d)) {
									index = j;
								}
							}
						}
 					}
					
					if(index + 1 > dList.size()) {
						dList.add(dir);
					} else {
						dList.add(index + 1, dir);
					}
					break;
				case "cp" :
					String dest = c.split(" ")[2];
					int idx = -1;
					for(int i = 0; i<dList.size(); i++) {
						if(dList.get(i).startsWith(dest)) {
							idx = i;
						}
					}
					
					ArrayList<String> adds = new ArrayList<>(); 
					if(idx > -1) {
						for(int i = 0; i<dList.size(); i++) {
							if(dList.get(i).startsWith(dir)) {
								if(dest.equals("/")) 
									dest = "";
								adds.add(dest + dList.get(i));
							}
						}
					}
					
					for(int k = adds.size()-1; k >= 0; k--) {
						dList.add(idx + 1, adds.get(k));
					}
					
					break;
				case "rm" :
					ArrayList<Integer> is = new ArrayList<>();
					for(int i = 0; i<dList.size(); i++) {
						if(dList.get(i).startsWith(dir)) {
							is.add(i);
						}
					}

					for(int i = is.size()-1; i >= 0; i--) {
						dList.remove(dList.get(is.get(i)));
					}
					
					break;
			}
		}
		
		String[] answer = dList.toArray(new String[dList.size()]);
		for(String a : answer) {
			System.out.println(a);
		}
        
		
//		
//		
//		
//		
//		
//		System.out.println(road.matches("0"));
		
//		String[] norm = road.split("0");
//		
//		
//		for(String s : norm) {
//			System.out.println(s);
//		}
//		
//		
//		System.out.println(answer);
	}
	
//	static void combination(ArrayList<Integer> arr, boolean[] visited, int start, int n, int r) {
//	    if(r == 0) {
//	        result(arr, visited, n);
//	        return;
//	    } 
//
//	    for(int i=start; i<n; i++) {
//	        visited[i] = true;
//	        combination(arr, visited, i + 1, n, r - 1);
//	        visited[i] = false;
//	    }
//	}
//	
//	// 배열 출력
//    static void result(ArrayList<Integer> arr, boolean[] visited, int n) {
//        for (int i = 0; i < n; i++) {
//            if (visited[i] == true)
//                System.out.print(arr.get(i) + " ");
//        }
//        System.out.println();
//    }

}

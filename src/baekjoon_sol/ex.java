package baekjoon_sol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ex {
	
	public static int calcFactorial(int n) {
		
		int result = 1;
		
		if(n > 1) {
			for(int i = 1; i<=n; i++) {
				result *= i;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int totalCnt = sc.nextInt();
		int toiletCnt = totalCnt;
		
		ArrayList<Integer> startTimeList = new ArrayList<>();
		HashMap<Integer, Integer> startIdx = new HashMap<>(); 
		ArrayList<Integer> endTimeList = new ArrayList<>();
		for(int i = 0; i<totalCnt; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			startTimeList.add(start);
			startIdx.put(start, i);
			endTimeList.add(end);
		}
		
		Collections.sort(startTimeList);
		
		HashSet<HashSet<Integer>> exceptSets = new HashSet<>();
		HashSet<Integer> alreadyDone = new HashSet<>();
		for(int i = 0; i<totalCnt; i++) {
			int compareEnd = endTimeList.get(startIdx.get(startTimeList.get(i)));
			
			if(!alreadyDone.contains(startIdx.get(startTimeList.get(i)))) {
				HashSet<Integer> except = new HashSet<>();
				except.add(startIdx.get(startTimeList.get(i)));
				alreadyDone.add(startIdx.get(startTimeList.get(i)));
				for(int j = 0; j<totalCnt; j++) {
					int compareStart = startTimeList.get(j);
					
					if(compareStart >= compareEnd) {
						compareEnd = endTimeList.get(startIdx.get(startTimeList.get(j)));
						except.add(startIdx.get(compareStart));
						alreadyDone.add(startIdx.get(compareStart));
					}
				}
				if(except.size() > 1) {
					exceptSets.add(except);
				}
			}
		}
		

		for(HashSet<Integer> e : exceptSets) {
			for(int a : e) {
				System.out.println(a);
			}
			System.out.println("-");
	}
//		for(int i = 0; i<totalCnt-1; i++) {
//			
//			int preEnd = endTimeList.get(startIdx.get(startTimeList.get(i)));
//			int nextStart = startTimeList.get(i+1);
//			
//			if(preEnd > nextStart) {
//				toiletCnt++;
//			}
//		}
//		
//		System.out.println(toiletCnt);
		
//		Scanner sc = new Scanner(System.in);
//		String[] in = sc.nextLine().split(" ");
//		int targetIdx = sc.nextInt();
//		ArrayList<Integer> inputs = new ArrayList<>();
//		
//		for(String i : in) {
//			inputs.add(Integer.valueOf(i));
//		}
//		
//		Collections.sort(inputs);
//		
//		int size = inputs.size();
//		int totalCnt = 0;
//		String tmp_result = "";
//		String result = "";
//		for(int i = 0; i<size; i++) {
//			for(int j = 0; j<size; j++) {
//				
//				if(!tmp_result.contains(String.valueOf(j))) {
//					int startWithCnt = calcFactorial(size - result.length()-1);
//					int tmp = totalCnt + startWithCnt;
//					
//					if(tmp >= targetIdx) {
//						tmp_result += String.valueOf(j);
//						result += String.valueOf(inputs.get(j));
//						break;
//					} else {
//						totalCnt += startWithCnt;
//					}
//				}
//			}
//		}
//		
//		System.out.println(result);
		
//		Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//		
//        ArrayList<Integer> seated  = new ArrayList<>();
//        ArrayList<Integer> minDistance = new ArrayList<>();
//        
//        for(int i = 0; i<cnt; i++) {
//        	seated.add(sc.nextInt());
//        }
//        
//        for(int i = 0; i < cnt; i++) {
//        	ArrayList<Integer> dist = new ArrayList<>();
//        	
//        	int now = seated.get(i);
//        	if(now == 0) {
//            	for(int j = 0; j < cnt; j++) {
//            		
//            		int adj = seated.get(j);
//            		if(adj == 1) {
//            			int distance = Math.abs(i - j);
//            			dist.add(distance);
//            		}
//            	}
//            	
//            	minDistance.add(Collections.min(dist));
//            	
//        	} else {
//        		minDistance.add(0);
//        	}
//        }
//        
//        System.out.println(minDistance.indexOf(Collections.max(minDistance)) + 1);
//		sc.close();
		
//		int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        ArrayList<Integer> inputs = new ArrayList<>();
//        ArrayList<Integer> consumers = new ArrayList<>();
//        
//        for(int i = 0; i<a; i++) {
//        	inputs.add(sc.nextInt());
//        }
//        
//        for(int i = 0; i<b; i++) {
//        	consumers.add(inputs.get(i));
//        }
//        
//        for(int i = b; i<inputs.size(); i++) {
//        	int min_idx = consumers.indexOf(Collections.min(consumers));
//        	
//        	consumers.set(min_idx, consumers.get(min_idx) + inputs.get(i));
//        }
//
//        int total_time = Collections.max(consumers);
//        System.out.println(total_time);
        
//		String s = "(())()())(";
//		
//		while(s.length() > 2) {
//			s = s.replace("()", "");
//		}
//		
//		if(s.equals("()")) {
//			
//		}
//		System.out.println(s);

//		String answer = "";	
//		String s = "1 23 4 23 va sdf asdfasdfasdfasdsfasdfas";
//		s = s.toLowerCase().trim();
//		
//		answer = s.substring(0, 1).toUpperCase() + s.substring(1);
//
//		int size = s.length();
//		for(int i = 0; i<size; i++) {
//			if(s.charAt(i) == ' ') {
//				answer = answer.substring(0, i+1) + answer.substring(i+1, i+2).toUpperCase() + answer.substring(i+2);
//			}
//		}
//
//		System.out.println(answer);
		
		
		
	}
	
}

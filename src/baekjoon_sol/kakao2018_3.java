package baekjoon_sol;

import java.util.ArrayList;
import java.util.HashSet;

public class kakao2018_3 {

	public static void main(String[] args) {

		String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},
				{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		
		int cnt = 0;
		
		// 1. 개별 1 항목씩 중복 여부 확인!
		ArrayList<Integer> exceptIdx = new ArrayList<>();
		for(int i = 0; i<relation[0].length; i++) {
			HashSet<String> single_set = new HashSet<>();			
			boolean able = true;
			for(int j = 0; j<relation.length; j++) {
				if(single_set.contains(relation[j][i])) {
					able = false;
				}
				single_set.add(relation[j][i]);
			}
			
			if(able) {
				cnt++;
				exceptIdx.add(i);
			}
		}
		
		// 2. 위에서 후보키 가능한 것들을 제외하고 나머지에서 2개씩 선택해서 중복 여부 확인 - 1씩 차이나는 것끼리 먼저, 2끼리 차이나는 것끼리
		// 1 차이나는 것끼리
		for(int i = 0; i < relation[0].length; i++ ) {
			for(int ex : exceptIdx) {
				if(i != ex) { // 이미 후보키인 것이 아닐때만
					System.out.println(i);
					for(int j = 0; j<relation.length; j++) {
						
						System.out.println(j + "/" + i);
						System.out.println(j + "/" +(i+1));
					}
				}
			}
			
			System.out.println("==");
		}
		
		
		
		for(int gap = 1; gap<relation[0].length-1; gap++) {
			
			
			
		}
		
		
//		for(int a : exceptIdx) {
//			System.out.println(a);
//		}
//		
//		System.out.println(cnt);
//		
		


	}

}

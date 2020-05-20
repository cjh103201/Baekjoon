package baekjoon_sol;

import java.util.ArrayList;
import java.util.Collections;

public class kakao2018_2 {

	public static void main(String[] args) {
		
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] answer = {};
		
		ArrayList<Float> prob = new ArrayList<>();
		ArrayList<Integer> order = new ArrayList<>();
		ArrayList<String> p_o = new ArrayList<>();
		
		// 확률 리스트 생성
		for(int i = 1; i<=N; i++) {
			
			float totalCome = 0;
			float fail = 0;
			
			for(int s : stages) {
				
				if( s >= i ) {
					totalCome++;
					if(s == i) {
						fail++;
					}
				}
			}
			
			float p = fail / totalCome;
			prob.add(p);
			order.add(i);
			
			p_o.add(p + "=" + i);
		}
		
		Collections.sort(p_o);
		Collections.reverse(p_o);
		for(int i = 1; i<p_o.size(); i++) {
//			String[] val1 = p_o.get(i-1).split("=");
//			String[] val2 = p_o.get(i).split("=");
//			
//			System.out.println(val1[0]);
//			System.out.println(val2[0]);
			
		}
		for(String a : p_o) {  //앞부분 값이 같을 경우만 순서 변경해주기!
			System.out.println(a.split("=")[1]);
		}
		
		
		
		//정렬하기
		
		
//		System.out.println("===");
//		for(int o : order) {
//			System.out.println(o);
//		}
		
		
//		Collections.sort(sorted_prob);
//		Collections.reverse(sorted_prob);
//		for(int i = 0; i<prob.size(); i++) {
//			
//			float a = sorted_prob.get(i);
//			
//			for(int j = 0; j<prob.size(); j++) {
//				float b = prob.get(j);
//				
//				if(a == b) {
//					order.add(i, j+1); break;
//				}
//			}
//		}
//		
//		

	}
}

package baekjoon_sol.done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sol_2750 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		ArrayList<Integer> inputNum = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 0; i<cnt; i++) {
			int in = sc.nextInt();
			inputNum.add(in);
			result.add(in);
		}
		
		// 1. 내장 메소드 이용
//		Collections.sort(inputNum);
		
		// 2. 삽입 정렬 이용 2-1번째 비교 / 3번째 - 2,1번째 비교...쭉~~
		for(int i = 1; i<inputNum.size(); i++) {
			int key = inputNum.get(i);
			
			for(int j = i-1; j>=0; j--) {
				int cmp = inputNum.get(j);
				
				if(key < cmp) {
					result.set(i, cmp);
					result.set(j, key);
				}
			}
		}
		
		for(int i : result) System.out.println(i);
		
		sc.close();
	}

}

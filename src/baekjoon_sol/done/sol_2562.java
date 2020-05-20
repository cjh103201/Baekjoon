package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @since 190713
 * @desc
 * 9개의 자연수가 주어질 때 최댓값을 찾고
 * 최대값이 몇 번째 수인지 구하는 프로그
 */
public class sol_2562 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idx = 1;
		int maxVal = -1;
		
		for(int i = 0; i < 9; i++) {
			int newInput = sc.nextInt();
			
			if( newInput > maxVal ) {
				maxVal = newInput;
				idx = i+1;
			}
		}
		sc.close();
		
		System.out.println(maxVal);
		System.out.println(idx);
	}
}

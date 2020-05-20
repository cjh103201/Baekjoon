package baekjoon_sol;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Jul 15, 2019
 * @desc	: 주어진 숫자가 소수인지 아닌지 판별하기
 *
 */
public class sol_9091_prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for(int i = 0; i<cnt; i++) {
			int input = sc.nextInt();
			boolean flag = true;
			
			if(input == 1) flag = false;
			
			// 소수 판별
			for(int j = 2; j<Math.sqrt(input); j++) {
				if(input % j == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag) System.out.println("YES");
			if(!flag) System.out.println("NO");
			
		}
		sc.close();

	}

}

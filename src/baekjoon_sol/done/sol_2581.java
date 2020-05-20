package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Aug 22, 2019
 * @desc	: 소수
 * 		M이상 N이하의 자연수 중 소수인 것의 합과 최소값을 찾
 *
 */
public class sol_2581 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int min = -1;
		int sum = 0;
		
		//소수 판별!
		for(int i = m; i<=n; i++) {
			boolean flag = false;
			if( i != 1) {
				for(int j = 2; j<=Math.sqrt(i); j++) {
					if(i%j == 0) {
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					sum += i;
					if(min == -1) {
						min = i;
					}
				}
			}
		}

		if(sum != 0) System.out.println(sum);
		System.out.println(min);
		sc.close();
	}

}

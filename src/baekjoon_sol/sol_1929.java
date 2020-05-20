package baekjoon_sol;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Aug 23, 2019
 * @desc	:	M이상 N이하의 소수를 모두 출력하는 프로그
 *
 */
public class sol_1929 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int M = Integer.valueOf(input.split(" ")[0]);
		int N = Integer.valueOf(input.split(" ")[1]);
		
		for(int i = M; i <=N; i++) {
			boolean flag = false;
			
			if((i == 1 || i%2 == 0) && i != 2) {
				flag = true;
			}
			
			// i가 소수인지 판별
			for(int j = 3; j<=Math.sqrt(i); j+=2) {
				if(i%j == 0) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}

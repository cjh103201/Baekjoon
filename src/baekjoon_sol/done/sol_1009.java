package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Jul 14, 2019
 * @desc	: 1번 데이터는 1번 컴퓨터, 2번 데이터는 2번 컴퓨터, 3번 데이터는 3번 컴퓨터, ... , 
 * 			10번 데이터는 10번 컴퓨터, 11번 데이터는 1번 컴퓨터, 12번 데이터는 2번 컴퓨터, ...
 * 			총 데이터의 개수는 항상 a^b개의 형태로 주어진다. 
 * 			재용이는 문득 마지막 데이터가 처리될 컴퓨터의 번호가 궁금해졌다. 
 * 			이를 수행해주는 프로그램을 작성하라.
 * 
 *         (1 ≤ a < 100, 1 ≤ b < 1,000,000)
 */
public class sol_1009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for(int i = 0; i<cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int[] rep = new int[4];
			a = a % 10;
			b = b % 4;
			if(b == 0) b = 4;
			for(int j = 1; j<= 4; j++) {
				int tmp = 1;
				for(int k = 1; k<= j; k++) {
					tmp *= a;
					tmp %= 10;
					
					if(tmp == 0) tmp = 10;
				}
				rep[(j-1)] = tmp;
			}
			System.out.println(rep[b-1]);
		}
		sc.close();
	}
}



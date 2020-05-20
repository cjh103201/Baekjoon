package baekjoon_sol.done;

import java.util.Scanner;

public class sol_10996 {

	public static void main(String[] args) {
		// 별 찍기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i< 2 * n; i++ ) {
			if(i % 2 == 1) {  // 홀수이면 별 먼
				for(int j = 0; j < n; j++) {
					if(j % 2 == 1) {
						System.out.print('*');
					} else {
						System.out.print(' ');
					}
				}
			} else { // 짝수이면 공백 먼
				for(int j = 0; j < n; j++) {
					if(j % 2 == 1) {
						System.out.print(' ');
					} else {
						System.out.print('*');
					}
				}
			}
			System.out.println();
		}

	}

}

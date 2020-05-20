package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 2020. 5. 4.
 * @desc
 *		별 찍기 - 15
 *		*        *        *
 *				* *      * *
 *                      *   *     ....
 */
public class sol_10990 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n-1; i>=0; i--) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 1; j < 2*(n - i)-1; j++ ) {
				if(j == 2*(n - i)-2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

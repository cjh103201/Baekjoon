package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @desc
 * 두 수 비교하기
 * 정수 A와 B가 입력될 때 비
 */
public class sol_1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.println(">");
		} else if ( A == B ) {
			System.out.println("==");
		} else {
			System.out.println("<");
		}

		sc.close();
	}

}

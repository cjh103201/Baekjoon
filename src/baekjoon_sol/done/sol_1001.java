package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @desc
 * 		두 수 A와 B를 입력받은 다음, A-B를 출
 */
public class sol_1001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A-B);
		sc.close();
	}

}

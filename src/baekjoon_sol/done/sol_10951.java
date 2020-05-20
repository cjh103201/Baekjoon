package baekjoon_sol.done;

import java.util.Scanner;

public class sol_10951 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 입력 케이스의 개수를 안 알려주는 경우
		while(sc.hasNextInt()) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
			
		}
		sc.close();
	}

}

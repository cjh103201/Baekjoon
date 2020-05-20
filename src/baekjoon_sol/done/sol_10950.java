package baekjoon_sol.done;

import java.util.Scanner;

public class sol_10950 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int totalCnt = sc.nextInt();
		
		for(int i = 0; i<totalCnt; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
		
		sc.close();
	}

}

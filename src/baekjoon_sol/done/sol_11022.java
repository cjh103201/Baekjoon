package baekjoon_sol.done;

import java.util.Scanner;

public class sol_11022 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int totalNum = sc.nextInt();
		
		for(int i = 0; i < totalNum; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.printf("Case #%d: %d + %d = %d", i+1, A, B, A+B);
			System.out.println();
		}
		
		sc.close();
		
	}
}

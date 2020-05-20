package baekjoon_sol.done;

import java.util.Scanner;

public class sol_2523 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 1; i<=(2 * n -1); i++) {
			int rep = i;
			if( rep > n ) {
				rep = 2 * n - i;
			}
			
			for(int j = 1; j<=rep; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}

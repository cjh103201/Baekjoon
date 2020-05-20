package baekjoon_sol;

import java.util.Scanner;

public class sol_1004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
			int start_x = sc.nextInt();
			int start_y = sc.nextInt();
			int end_x = sc.nextInt();
			int end_y = sc.nextInt();
			
			int planetCnt = sc.nextInt();
			int[] planet_x = new int[planetCnt];
			int[] planet_y = new int[planetCnt];
			int[] planet_r = new int[planetCnt];
			for(int j = 0; j<planetCnt; j++) {
				planet_x[j] = sc.nextInt();
				planet_y[j] = sc.nextInt();
				planet_r[j] = sc.nextInt();
			}
			
			for(int j = 0; j<planetCnt; j++) {
				System.out.println(planet_x[j] + " / " + planet_y[j] + " / " + planet_r[j]);
			}
			System.out.println("====================");
		}
		
		sc.close();
	}

}

package baekjoon_sol.done;

import java.util.Scanner;

public class sol_2446 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int tot = cnt * 2 -1;
		for(int i = 1; i<=tot; i++) {
			int tmp = i-cnt;
			if(tmp < 0) tmp = -tmp;
			tmp = tmp * 2 + 1;
			
			for(int j = 0; j<(tot-tmp)/ 2; j++) {
				System.out.print(' ');
			}
			for(int j = 0; j<tmp; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		sc.close();
	}
}

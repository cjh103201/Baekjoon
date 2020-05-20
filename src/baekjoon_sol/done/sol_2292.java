package baekjoon_sol.done;

import java.util.Scanner;

public class sol_2292 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int sum = 1;
		int i = 1;
		
		while(input > sum) {			
			int tmp_val = 6 * i;
			sum += tmp_val;
			i++;
		}
		
		System.out.println(i);
		sc.close();
	}

}

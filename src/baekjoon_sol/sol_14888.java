package baekjoon_sol;

import java.util.Scanner;

public class sol_14888 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int[] nums = new int[cnt];
		for(int i = 0; i<cnt; i++) {
			nums[i] = sc.nextInt();
		}
		
		String[] op = new String[cnt - 1];
		
		int plus = sc.nextInt();
		for(int i = 0; i<plus; i++) {
			op[i] = "+";
		}
		
		int minus = sc.nextInt();
		for(int i = plus; i<plus + minus; i++) {
			op[i] = "-";
		}
		
		int multi = sc.nextInt();
		for(int i = plus + minus; i<plus + minus + multi; i++) {
			op[i] = "*";
		}
		
		int div = sc.nextInt();
		for(int i = plus + minus + multi; i<plus + minus + multi + div; i++) {
			op[i] = "*";
		}
		
		// 숫자를 순열 0-1-2 / 0-2-1 / 1-2-0 / 1-0-2 / 2-0-1 / 2-1-0
		for(int i = 0; i<op.length; i++) {
			
		}
				
		sc.close();
	}

}

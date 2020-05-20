package baekjoon_sol;

import java.util.Scanner;

public class sol_10039 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		
		for(int i = 0; i<5; i++) {
			int tmp = sc.nextInt();
			if(tmp < 40) {
				tmp = 40;
			}
			
			score[i] = tmp;
		}
		
		int sum = 0;
		for(int i : score) {
			sum += i;
		}

		System.out.println(sum / 5);
	}

}

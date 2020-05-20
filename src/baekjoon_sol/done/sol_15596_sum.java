package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Jul 15, 2019
 * @desc	: 정수 n개가 주어졌을 때, n개의 합을 구하는 함수
 *
 */
public class sol_15596_sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		int[] inputInt = new int[input.length];
		for(int i = 0; i<inputInt.length; i++) {
			inputInt[i] = Integer.parseInt(input[i]);
		}
		
		long sum = sum(inputInt);
		System.out.println(sum);
		sc.close();
	}
	
	public static long sum(int[] a) {
		
		long sum = 0;
		
		for(int i : a) {
			sum += i;
		}
		
		return sum;
		
	}
}

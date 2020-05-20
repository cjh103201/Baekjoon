package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @desc
 * n! 팩토리얼 계산하기 - 재귀 & for문 사
 */
public class sol_10872_factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(factorial(n));
		
		sc.close();
	}
	
	// 1. 재귀적인 방식을 사용
//	public static int factorial(int n) {
//		if(n == 1) {
//			return 1;
//		} else {
//			return factorial(n-1) * n;
//		}
//	}

	// 2. for문 사용
	public static int factorial(int n) {
		
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		
		return result;
	}
}

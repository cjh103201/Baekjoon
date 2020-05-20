package baekjoon_sol.done;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @desc
 * 피보나치 수열 활용 문제
 * 
 * fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.
 * 		fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
 * 		fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다. 
 * 		두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
 *		fibonacci(0)은 0을 출력하고, 0을 리턴한다.
 * 		fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다. 
 * 		첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
 * 		fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.
 * 
 * 
 * 1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.
 */
public class sol_1003_fibonacci {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] result = new String[num];  // 결과 모아
		
		for(int i = 0; i < num; i++ ) {
			int n = sc.nextInt(); // 입력된 값
			
			result[i] = fibonacci(n);
		}
		
		sc.close();
		
		// 결괏값 출력
		for(String a : result) {
			System.out.println(a);
		}

	}
	
	// 갯수를 카운트하기 위한 함수
	public static String fibonacci(int n) {
		
		ArrayList<Integer> zero = new ArrayList<>();
		ArrayList<Integer> one = new ArrayList<>();
		
		zero.add(1);
		zero.add(0);
		one.add(0);
		one.add(1);
		
		if(n > 1) {
			for(int i = 2; i <= n; i++) {
				zero.add(zero.get(i-1) + zero.get(i-2));
				one.add(one.get(i-1) + one.get(i-2));
			}
		}
		
		return zero.get(n) + " " + one.get(n);
	}
	
//	성능을 해결하기 위해 동적프로그래밍을 활용한 피보나치수열
//	public static int fibonacci(int n) {
//		int a, b, result = 0;
//		
//		if(n <= 1) {
//			return 1;
//		}
//		
//		a = 1;
//		b = 1;
//		
//		for(int i = 0; i<n; i++) {
//			result = a + b;
//			a = b;
//			b = result;
//		}
//		
//		return result;
//	}
	
// 성능상 문제가 있는 재귀적인 방식
//	public static int fibonacci(int n) {
//		if( n == 0 ) {
//			total0++;
//			return 0;
//		} else if ( n == 1 ) {
//			total1++;
//			return 1;
//		} else {
//			return fibonacci(n-1) + fibonacci(n-2);
//		}
//	}

}

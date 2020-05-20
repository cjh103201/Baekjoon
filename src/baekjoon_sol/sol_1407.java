package baekjoon_sol;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Jul 14, 2019
 * @desc	: 약수를 함수값으로 가지는 함수 f(x)를 정의하자. 즉, f(15) = 1이고, f(40) = 8
 * 			  두 자연수 A, B(A≤B)가 주어지면, A 이상 B 이하의 모든 자연수에 대해서, 
 * 			  그 자연수의 모든 약수 중 2의 거듭제곱 꼴이면서 가장 큰 약수들의 총 합을 구하는 프로그램을 작성하시오. 
 * 			  즉 아래와 같은 수식의 값을 구해야 한다.
 *			  f(A) + f(A+1) + ... + f(B-1) + f(B)
 *
 */
public class sol_1407 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int result = 0;
		for(int N = A; N <= B; N++) {
			if( N % 2 != 0) {
				result += 1;
			} else {
				int cnt = 0;
				int tmp = N;
				while(tmp % 2 == 0) {
					cnt++;
					tmp = (int)(tmp / 2);
				}
				result += (int)Math.pow(2, cnt);
			}
		}

		System.out.println(result);
		sc.close();
	}
}

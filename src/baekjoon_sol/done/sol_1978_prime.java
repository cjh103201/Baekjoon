package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Jul 14, 2019
 * @desc	: 입력된 숫자들 중에서 소수의 개수 출력
 *
 */
public class sol_1978_prime {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int totalNum = sc.nextInt();
		int cnt = totalNum; // 전체 갯수에서 빼는 방식
		
		for(int i = 0; i < totalNum; i++) {
			int input = sc.nextInt();
			
			if(input == 1) cnt--;
			
			for(int j = 2; j<input; j++) { // 2 ~ 자기보다 하나 작은 수까지 범위로 나누기
				if(input % j == 0) {
					cnt--;
					break;
				}
			}
			
		}
		
		System.out.println(cnt);
		sc.close();
	}
	
//	// n이하의 소수의 갯수 판별
//	public static int checkPrimeNumber(int n) {
//		
//		boolean flag;
//		int cnt = 0;
//		
//		for(int i = 2; i <= n; i++) {
//			flag = true;
//			for(int j = 2; j < i; j++) { // 소수 판별;
//				if(i%j == 0) {
//					flag = false;
//				}
//			}
//			if(flag) { // 참이면 소수
//				cnt++;
//				System.out.println(i); // 소수 출력
//			}
//		}
//		
//		return cnt;
//	}
}

package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Aug 12, 2019
 * @desc	: 상수
 * 				- 두 수를 입력받아 큰 수 찾기
 *
 */
public class sol_2908 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		A = (A/100) + ((A/10)%10)*10 + (A%10)*100;
		B = (B/100) + ((B/10)%10)*10 + (B%10)*100;
		
		int result = A;
		if(B > A) result = B;
		
		System.out.println(result);
		
	}

}

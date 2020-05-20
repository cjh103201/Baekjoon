package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Aug 22, 2019
 * @desc	:
 *		분수찾기 -> 1/1, 1/2, 2/3, 3/1,...순서일 때 
 *		X를 입력받고 X번째 분수 구하
 */
public class sol_1193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int cnt = 0;
		int result = 0;
		String val = "";
		
		// 분자, 분모의 합이 얼마가 되어야하는지 먼저 찾기
		for(int i = 1; i*(i+1) < 2*X ; i++) {
			cnt = i + 2;
		}
		
		result = (cnt-2) * (cnt-1) / 2;
		
		int remain = X - result;
		
		if(cnt%2 == 1) { // 홀수일경우 2/1 1/1 순
			for(int i = 1; i<=remain; i++) {
				val = i + "/" + (cnt-i);
			}
		} else {
			for(int i = 1; i<=remain; i++) {
				val = (cnt-i) + "/" + i;
			}
		}

		System.out.println(val);
		sc.close();
	}
}

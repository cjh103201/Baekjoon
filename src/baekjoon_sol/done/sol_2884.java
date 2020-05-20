package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Jul 14, 2019
 * @desc	: 입력된 시간을 기준으로 45분 전을 계산하시오.
 *
 */
public class sol_2884 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if(min < 45) {
			hour--;
			min += 15;
		} else {
			min -= 45;
		}
		
		if(hour < 0) hour += 24;
		
		System.out.println(hour + " " + min);
		sc.close();
		
	}
}

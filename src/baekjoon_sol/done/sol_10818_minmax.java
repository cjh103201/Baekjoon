package baekjoon_sol.done;

import java.util.Scanner;
 /**
  * 
  * @author	: jeehyun
  * @date 	: Jul 14, 2019
  * @desc	: max, min 값 구하기
  *
  */
public class sol_10818_minmax {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int max = -1000000;
		int min = 1000000;
		
		for(int i = 0; i<cnt; i++) {
			int input = sc.nextInt();
			
			max = (input >= max) ? input : max;
			// max = Math.max(input, max);
			min = (input <= min) ? input : min;
			// max = Math.min(input, max);
		}
		
		System.out.println(min + " " + max);
		sc.close();
	}
}

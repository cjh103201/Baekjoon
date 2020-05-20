package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Jul 13, 2019
 * @desc	: 
 * 		높이가 V미터인 나무 막대
 * 		낮에는 A미터 올라가지만 잠을 자는 밤에는 B미터 미끄러진다.
 * 		모두 올라가려면 몇 일이 걸리는지 구하라
 * 
 * 		단, 정상에 올라간 후 밤에는 미끄러지지 않는다.
 *
 * @input 	: A B V 
 * 
 * 시간 제한 : 0.15
 *
 */
public class sol_2869 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		// 속도 향상을 위해서 수식 사용! ===> 반복문 대신!
		double days = (double)(V-B) / (A-B);
		int result = (int) Math.ceil(days);
		
		System.out.println(result);
		sc.close();
	}

}

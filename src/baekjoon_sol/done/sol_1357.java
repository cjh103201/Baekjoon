package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 2020. 5. 9.
 * @desc   뒤집힌 덧셈
 *	어떤 수 X가 주어졌을 때, X의 모든 자리수가 역순이 된 수를 얻을 수 있다. 
 *	Rev(X)를 X의 모든 자리수를 역순으로 만드는 함수라고 하자. 
 *
 *	예를 들어, X=123일 때, Rev(X) = 321이다. 
 *	그리고, X=100일 때, Rev(X) = 1이다.
 *
 *  두 양의 정수 X와 Y가 주어졌을 때, Rev(Rev(X) + Rev(Y))를 구하는 프로그램을 작성하시오
 *
 */
public class sol_1357 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] inputs = sc.nextLine().split(" ");
		
		int X = Rev(inputs[0]);
		int Y = Rev(inputs[1]);
		
		System.out.println(Rev(String.valueOf((X+Y))));
		sc.close();
	}

	public static int Rev(String n) {
		
		String r = "";
		for(int i = 0; i<n.length();i++) {
			r = n.charAt(i) + r;
		}
		
		return Integer.parseInt(r);
	}
}

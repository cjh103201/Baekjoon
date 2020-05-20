package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @desc
 * 		두 수 A와 B를 입력받은 다음, A+B를 출력
 */
public class sol_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		sc.close();
		
		String[] in = input.split(" ");
		
		int a = Integer.valueOf(in[0]);
		int b = Integer.valueOf(in[1]);
		
		int result = a + b;
		
		System.out.println(result);
		
	}

}

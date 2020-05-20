package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Jul 15, 2019
 * @desc	: 입력된 문자열을 주어진 숫자만큼 반복하여 출력하기
 *
 */
public class sol_2675_string_reputation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int totalCnt = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < totalCnt; i++) {
			String input = sc.nextLine();
			String[] inputs = input.split(" ");
			int reputNum = Integer.parseInt(inputs[0]);
			String[] inputArray = inputs[1].split("");

			String resultStr = "";
			for(String a : inputArray) {
				for(int j = 0; j<reputNum; j++) {
					resultStr += a;
				}
			}
			System.out.println(resultStr);
		}
		sc.close();
	}
}

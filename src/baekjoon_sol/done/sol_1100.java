package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 2020. 4. 17.
 * @desc   하얀 칸
 * 	문제
 * 		체스판은 8*8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다. 
 * 		가장 왼쪽 위칸 (0,0)은 하얀색이다. 
 * 
 * 		체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 * 
 *  입력
 *  	첫째 줄부터 8개의 줄에 체스판의 상태가 주어진다. 
 *  	‘.’은 빈 칸이고, ‘F’는 위에 말이 있는 칸이다.
 *
 *
 */
public class sol_1100 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[][] chess = new String[8][8];
		for(int i = 0; i<8; i++) {
			String[] input = sc.nextLine().split("");
			chess[i] = input;
		}
		
		int result = 0;
		for(int i = 0; i<8; i++) {
			for(int j = i % 2; j<8; j+=2) {
				if(chess[i][j].equals("F")) {
					result++;
				}
			}
		}
		
		System.out.println(result);
		sc.close();
	}

}

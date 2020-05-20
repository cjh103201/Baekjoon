package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 2020. 5. 19.
 * @desc    카드 게임
 *    입력
 *    첫 번째 줄에는 A가 제시한 카드의 숫자 10개가 라운드 순서대로 주어지고, 
 *    두 번째 줄에는 B가 제시한 카드의 숫자 10개가 라운드 순서대로 주어진다.
 *    
 *    출력
 *    게임의 승패가 결정되는 경우 승리한 사람을 출력하고, 
 *    비기는 경우에는 D를 출력한다. 
 *
 */
public class sol_10801 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] score_A = new int[10];
		int[] score_B = new int[10];;
		for(int i = 0; i<10; i++) {
			score_A[i] = sc.nextInt();
		}
		
		for(int i = 0; i<10; i++) {
			score_B[i] = sc.nextInt();
		}
		
		int a = 0;
		int b = 0;
		for(int i = 0; i<10; i++) {
			if(score_A[i] < score_B[i]) {
				b++;
			} else if(score_A[i] > score_B[i]) {
				a++;
			}
		}
		
		if(a > b) {
			System.out.println("A");
		} else if(a < b ) {
			System.out.println("B");
		} else {
			System.out.println("D");
		}
		
		sc.close();
	}

}

package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Jul 13, 2019
 * @desc	:
 * 		블랙잭
 *		김정인 버젼의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 
 *		그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 
 *		그런 후에 딜러는 숫자 M을 크게 외친다.
 *		이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 
 *		블랙잭 변형 게임이기 때문에, 
 *		플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
 *		N장의 카드에 써져 있는 숫자가 주어졌을 때, 
 *		M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
 *
 * input : 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)
 * 		   둘째 줄에는 카드에 쓰여 있는 수
 * 
 * 
 * ********* 백트래킹 알고리즘!!  => 가능한 모든 방법을 탐색하는 기본 아이디어!!
 * 				대표적으로 DFS(깊이 우선 탐)
 * 
 */
public class sol_2798_blackjack_brute_force {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cardCnt = sc.nextInt();
		int goal = sc.nextInt();
		
		int[] nums = new int[cardCnt];
		for(int i = 0; i<cardCnt; i++) {
			nums[i] = sc.nextInt();
		}
		
		int minDif = 99999;
		int result = 0;
		for(int i = 0; i<cardCnt; i++) {
			for(int j = i+1; j<cardCnt; j++) {
				for(int k = j+1; k < cardCnt; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if(sum <= goal) {
						int diff = goal - sum;
						if(diff < minDif) {
							minDif = diff;
							result = sum;
						}
					}
				}
			}
		}
		System.out.println(result);
		sc.close();
	}
}

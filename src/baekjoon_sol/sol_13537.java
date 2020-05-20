package baekjoon_sol;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 20. 04. 08
 * @desc
 * 	 문제 : 길이가 N인 수열 A1, A2, ..., AN이 주어진다. 이때, 다음 쿼리를 수행하는 프로그램을 작성하시오.
 *         i j k: Ai, Ai+1, ..., Aj로 이루어진 부분 수열 중에서 k보다 큰 원소의 개수를 출력한다.
 *         
 *   입력 : 첫째 줄에 수열의 크기 N (1 ≤ N ≤ 100,000)이 주어진다.
 *   	   둘째 줄에는 A1, A2, ..., AN이 주어진다. (1 ≤ Ai ≤ 109)
 *         셋째 줄에는 쿼리의 개수 M (1 ≤ M ≤ 100,000)이 주어진다.
 *         넷째 줄부터 M개의 줄에는 쿼리 i, j, k가 한 줄에 하나씩 주어진다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ 109)
 */
public class sol_13537 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arrNum = sc.nextInt();
		sc.nextLine();
		String[] arr = sc.nextLine().split(" ");
		
		int conditionNum = sc.nextInt();
		for(int i = 0; i<conditionNum; i++) {
			int start = sc.nextInt() - 1;
			int end = sc.nextInt() - 1;
			int min = sc.nextInt();
			
			int cnt = 0;
			for(int j = start; j<=end; j++) {
				if(Integer.parseInt(arr[j]) > min) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}

}

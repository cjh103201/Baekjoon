package baekjoon_sol;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date   20. 04.10
 * @desc
 * 
 * 문제
 * 		지민이는 수의 리스트가 있을 때, 이를 짝지어 각 쌍의 합이 소수가 되게 하려고 한다. 
 * 		예를 들어, {1, 4, 7, 10, 11, 12}가 있다고 하자. 지민이는 다음과 같이 그룹지을 수 있다.
 * 			1 + 4 = 5, 7 + 10 = 17, 11 + 12 = 23
 *			 또는
 * 			1 + 10 = 11, 4 + 7 = 11, 11 + 12 = 23
 * 
 *  	수의 리스트가 주어졌을 때, 
 *  	지민이가 모든 수를 다 짝지었을 때, 첫 번째 수와 어떤 수를 짝지었는지 오름차순으로 출력하는 프로그램을 작성하시오. 
 *  	
 *  	위의 예제에서 1 + 12 = 13으로 소수이다. 
 *  	그러나, 남은 4개의 수를 합이 소수가 되게 짝지을 수 있는 방법이 없다. 
 *  	따라서 예제의 답은 4, 10이다.
 *  
 * 입력
 * 		첫째 줄에 리스트의 크기 N이 주어진다. 
 * 		N은 50보다 작거나 같은 자연수이며, 짝수이다. 
 * 		둘째 줄에 리스트에 들어있는 수가 주어진다. 
 * 		리스트에 들어있는 수는 1,000보다 작거나 같은 자연수이며, 중복되지 않는다.
 * 
 * 출력
 * 		첫째 줄에 정답을 출력한다. 
 * 		없으면 -1을 출력한다.
 * 
 */
public class sol_1017 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 먼저 첫번째 숫자와 연결 가능한 경우에 대해 모두 실행
		boolean first = true;
		String rs = "";
		for(int i = 1; i<N; i++) {
			int sum = arr[0] + arr[i];
			if(chkPrime(sum)) {
				boolean[] visited = new boolean[N];
				visited[0] = true;
				visited[i] = true;
				int cnt = 1;
				for(int j = 1; j<N; j++) {
					if(!visited[j]) {
						for(int k = j+1; k<N; k++) {
							int sum2 = arr[j] + arr[k];
							if(chkPrime(sum2) && !visited[k]) {
								visited[j] = true;
								visited[k] = true;
								cnt++;
								break;
							}
						}
					}
				}
				if(cnt == (N/2)) {
					if(first) {
						rs += arr[i];
						first = false;
					} else {
						rs += " " + arr[i];
					}
				}
			}
		}
		if(rs.length() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(rs);
		}
		sc.close();
	}
	
	public static boolean chkPrime(int n) {
		
		if(n == 1) return false;
		if(n == 2) return true;
		if(n%2 == 0) return false;

		for(int i = 3; i <= n/2; i+=2) {
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}
}

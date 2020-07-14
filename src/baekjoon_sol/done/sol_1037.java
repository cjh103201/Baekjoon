package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author Admin
 * @date 20. 07. 14
 * @desc
 * 	문제
 * 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 
 * 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
 * 
 * 	입력
 * 첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다. 
 * 둘째 줄에는 N의 진짜 약수가 주어진다. 
 * 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.
 * 
 * 	출력
 * 첫째 줄에 N을 출력한다. 
 * N은 항상 32비트 부호있는 정수로 표현할 수 있다.
 * 
 */
public class sol_1037 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 오름차순 정렬
		for(int i = 0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				int num = arr[i];
				int next_num = arr[j];
				
				if(num > next_num) {
					arr[i] = next_num;
					arr[j] = num;
				}
			}
		}
		
		int start = arr[0];
		int end = arr[n-1];
		
		System.out.println(start * end);
		sc.close();
	}
}

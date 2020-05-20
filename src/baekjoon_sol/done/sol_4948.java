package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @desc 소수판별하기 - 에라토스테네스의 체 활용 ; 모두 배열에 넣고 체크하
 */
public class sol_4948 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		while(input != 0) {
			
			int cnt = 0;
			int end = 2 * input;
			boolean[] arr = new boolean[end + 1];
			arr[0] = arr[1] = false;
			
			for(int i = 2; i<=end; i++) {
				arr[i] = true;
			}
			
			// 2부터 숫자를 키우면서 제외
			for(int i = 2; i<=end; i++) {
				for(int j = 2; i*j<=end; j++) {
					arr[i * j] = false;
				}
			}
			
			for(int i = input + 1; i<=end; i++) {
				if(arr[i]) {
					cnt++;
				}
			}
			System.out.println(cnt);
			input = sc.nextInt();
		}
		sc.close();
	}

}

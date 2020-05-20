package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @desc
 * 테스트 케이스의 개수 T가 주어지고
 * "Case #x: "를 출력한 다음, A+B를 출력 ; 번호는 1부터 시 
 */
public class sol_11021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int totalCnt = sc.nextInt();
		
		for(int i = 0; i<totalCnt; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A + B;
			
			System.out.println("Case #"+(i+1) + ": " + sum);
		}
		
		sc.close();
	}

}

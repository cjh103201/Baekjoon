package baekjoon_sol;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @desc
 * 고정비용(전체에서 한 번 발생)과 가변비용(한대당)이 발생하며
 * 최초로 총 수입이 총 비용보다 많아저 이익이 발생하는 손익분기점을 구하는 프로그램
 * 
 * 입력 : A, B, C
 * 출력 : 손익분기점이 발생하는 판매량, 존재하지 않을 경우 -1 출력
 *
 */
public class sol_1712 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int cnt = 1;
		int total = C - B - A;
		
		// C-B가 0이거나 음수이면 존재하지 않는다. => 부등식!!
		if(C-B <= 0) {
			cnt = -1;
		} else {
			while(total <= 0 ) {
				cnt++;
				total =(C-B)*cnt - A; 
			}
		}
		sc.close();
		
		System.out.println(cnt);
	}

}

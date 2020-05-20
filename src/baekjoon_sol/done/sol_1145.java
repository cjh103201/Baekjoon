package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 2020. 4. 21.
 * @desc   적어도 대부분의 배수
 * 		문제
 *   다섯 개의 자연수가 있다. 
 *   이 수의 적어도 대부분의 배수는 위의 수 중 적어도 세 개로 나누어 지는 가장 작은 자연수이다.
 *   
 *   서로 다른 다섯 개의 자연수가 주어질 때, 적어도 대부분의 배수를 출력하는 프로그램을 작성하시오.
 *
 */
public class sol_1145 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] inputs = new int[5];
		for(int i = 0; i<inputs.length; i++) {
			inputs[i] = sc.nextInt();
		}

		int val = Integer.MAX_VALUE;
		for(int m : inputs) {
			int cnt = 0;
			int i = 1;
			int multi = m;
			while(cnt < 3) {
				cnt = 0;
				multi = m * i;
				for(int n : inputs) {
					if(multi % n == 0) cnt++;
				}
				i++;
			}
			
			if(multi < val) val = multi;
		}
		System.out.println(val);
		sc.close();
	}

}

package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @desc
 * 		어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 
 *  	어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 
 *  
 *  	예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 
 *  	따라서 245는 256의 생성자가 된다. 
 *  
 *  	물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
 *      자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
 *      
 */
public class sol_2231 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int result = 0;
		for(int t = 0; t < input; t++) {
			
			int digit = (int)Math.log10(t) + 1;
			
			int tmp = t;
			int sum = t;
			for(int i = 0; i<digit; i++) {
				int r = tmp % 10;
				tmp = tmp / 10;
				
				sum += r;
			}
			
			if(sum == input) {
				result = t;
				break;
			}
		}
		
		System.out.println(result);		
		sc.close();
	}

}

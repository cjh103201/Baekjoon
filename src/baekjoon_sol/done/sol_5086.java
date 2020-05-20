package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @desc
 * 	각 테스트 케이스마다 
 * 		첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 
 *      배수라면 multiple을, 
 *      둘 다 아니라면 neither를 출력한다.
 *      
 */
public class sol_5086 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		while (a != 0 && b!= 0) {
			if( a % b == 0) {
				System.out.println("multiple");
			} else if( b % a == 0 ) {
				System.out.println("factor");
			} else {
				System.out.println("neither");
			}
			
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
		sc.close();
	}

}

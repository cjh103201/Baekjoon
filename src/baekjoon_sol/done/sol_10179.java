package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 2020. 5. 6.
 * @desc   쿠폰
 *	 당신은 어떤 물건이라도 20% 할인해주는 쿠폰을 가지고 있다.
 *	 원래 가격이 주어질 때, 쿠폰을 사용하면 얼마가 되는지 알려주는 프로그램을 작성하시오.
 *
 *   입력
 *   첫 번째 줄에 테스트케이스의 수가 주어진다.
 *   각 줄에는 물건의 원래 가격이 소수점 둘째자리까지 주어진다.
 *   
 *   출력
 *   할인된 가격을 달러 단위로 출력한다.
 *   나누어 떨어지지 않을 때는 소수점 셋째 자리에서 반올림해서 둘째 자리까지 출력한다.
 *   
 *************************************************************************************************
 *	
 *		[ Check! ]
 *		float은 틀렸는데, double은 맞는 이유?
 *      1. float과 double은 소수점을 정확하게 표현하지 못한다.
 *        그렇기 때문에 중요한 수의 소수점 연산에서는 BigDecimal을 사용하는 것이 좋다.
 *		2. float과 double의 차이
 *   		-> float은 소수점 이하 6자리
 *   		-> doubld은 소수점 이하 15자리
 *       즉, 정밀도에 차이가 있다.
 *       표현할 수 있는 소수점이 얼마나 많은지에 따라 오차 범위가 줄어고 더 정밀한 계산이 되기 때문이다.
 */
public class sol_10179 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
			double price = sc.nextDouble(); 
			System.out.printf("$%.2f\n", price * 0.8);
		}
		
		sc.close();
	}

}

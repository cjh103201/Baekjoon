package baekjoon_sol;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 2020. 5. 8.
 * @desc	축구
 * 	
 *	홍준이는 축구 경기를 보고 있다. 
 *	그러다가 홍준이는 역시 두 팀 중 적어도 한 팀이 골을 소수로 득점할 확률이 궁금해 졌다. 
 *	축구 경기는 90분동안 이루어지고, 분석을 쉽게하기 위해서 경기를 5분 간격으로 나눴다. 
 *	처음 간격은 처음 5분이고, 두 번째 간격은 그 다음 5분, 그리고 이런식으로 나눈다. 
 *	경기가 진행되는 동안 각 간격에서 A팀이 득점할 확률과 B팀이 득점할 확률이 주어진다. 
 *	그리고, 각 간격에서 두 팀은 각각 많아야 한 골을 득점할 수 있다. 
 *	경기가 끝난 후 적어도 한 팀이 골을 소수로 득점할 확률을 구하시오.
 *
 *	입력
 *	첫째 줄에 A팀이 득점할 확률, 둘째 줄에 B팀이 득점할 확률이 퍼센트 단위로 주어진다. 
 *	퍼센트 단위로 주어지는 확률은 모두 0보다 크거나 같고 100보다 작거나 같은 정수이다.
 *
 *	출력
 *	첫째 줄에 적어도 한 팀이 골을 소수로 득점할 확률을 출력한다. 
 *	정답과의 절대/상대 오차가 10-6이내인 경우에 정답이다.
 *
 */
public class sol_1344 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double probA = sc.nextDouble() / 100.0;
		double probB = sc.nextDouble() / 100.0;
		double totalProb = 0.0;
		int total = 90 / 5;
		
		for(int i = 0; i <= total; i++) {
			if(!chkPrime(i)) {
				for(int j = 0; j <= total; j++) {
					if(!chkPrime(j)) {
						totalProb  += (calcCombination(total, i) * calcCombination(total, j)
								* Math.pow(probA, i) * Math.pow(probA, (total-i))
								* Math.pow(probB, j) * Math.pow(probB, (total-j)));
						
//						System.out.println("A = " + i  + " B = " + j);
					}
				}
			}
		}
		System.out.println(1 - totalProb);
		sc.close();
	}
	
	public static int calcCombination(int n, int r) {
		
		if(n == 0) return 1;
		if( r > n/2) r = n - r;
		
		int c = 1;
		for(int i = 1; i<=r; i++) {
			c *= (n+1-i);
			c /= i;
		}
		
		return c;
	}
	
	public static boolean chkPrime(int n) {
		
		if(n == 1 || n == 2) return true;
		if(n % 2 == 0) return false;
		
		for(int i = 3; i< n/2; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}

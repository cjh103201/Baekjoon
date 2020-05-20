package baekjoon_sol.done;

import java.util.ArrayList;
import java.util.Scanner;

public class sol_9020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int totalCnt = sc.nextInt();
		int max = -1;
		int[] arr = new int[totalCnt];
		for(int i = 0; i<totalCnt; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		ArrayList<Integer> primeArray = getPrimeArr(max);
		
		for(int c = 0; c < totalCnt; c++) {
			int n = arr[c];
			int resultVal = -1;
			
			for(int p : primeArray) {
				if( p > n/2 ) {
					break;
				}
				
				if(primeArray.contains(n - p)) {
					if(resultVal < p) {
						resultVal = p;
					}
				}
			}
			System.out.println(resultVal + " " + (n - resultVal));
		}
		sc.close();
	}
	
	public static ArrayList<Integer> getPrimeArr(int n) {
		
		ArrayList<Integer> primeArr = new ArrayList<>();
		
		//에라토스테네스의 채 - 2의 배수들부터 없애기
		boolean[] prime = new boolean[n+1];
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= n; i++) {
			for(int j = 2; i * j <= n; j++) {
				prime[i*j] = true;
			}
		}
		
		for(int i = 2; i<prime.length; i++) {
			if(!prime[i]) {
				primeArr.add(i);
			}
		}
		
		return primeArr;
	}
}

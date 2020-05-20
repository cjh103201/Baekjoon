package baekjoon_sol;

import java.util.Scanner;

public class sol_11047 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] coin = new int[N];
		
		for(int i = N-1; i>=0; i--) {
			coin[i] = sc.nextInt();
		}
		
		int start = 0;
		for(int i = 0; i<N; i++) {
			if(coin[i] <= K) {
				start = i;
				break;
			}
		}
		
		
//		for(int i = start; i<N; i++) {
//			System.out.println(i);
//		}
//		
//		for(int i = start; i<N; i++) {
//			for(int j = i+1; j<N; j++) {
//				System.out.println(i +"/" + j);
//			}
//		}
//		
//		for(int i = start; i<N; i++) {
//			for(int j = i+1; j<N; j++) {
//				for(int k = j+1; k<N; k++) {
//					System.out.println(i + "/" + j + "/" + k);
//				}
//			}
//		}

	}
	
}

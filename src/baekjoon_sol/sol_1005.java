package baekjoon_sol;

import java.util.ArrayList;
import java.util.Scanner;

public class sol_1005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[] D = new int[N];
			for(int j = 0; j<N; j++) {
				D[j] = sc.nextInt();
			}
			
			int[] X = new int[K];
			int[] Y = new int[K];
			for(int j = 0; j<K; j++) {
				X[j] = sc.nextInt();
				Y[j] = sc.nextInt();
			}
			
			int W = sc.nextInt();
			int time = 0;
			if(N * (N-1) / 2 == K) {
				for(int j = 0; j < W; j++) {
					time += D[j];
				}
			} else {
				int j = W;
				time = D[W-1];
				while(true) {
					ArrayList<Integer> tmp = findVal(X, Y, j);
					int maxTime = -1;
					for(int t : tmp) {
						if(maxTime < D[t-1]) {
							j = t;
							maxTime = D[t-1];
						}
					}
					if(tmp.size() == 0) {
						break;
					}
					time += maxTime;
				}
			}
			System.out.println(time);
		}
		sc.close();
	}
	
	public static ArrayList<Integer> findVal(int[] x, int[] y, int val) {
		
		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 0; i<y.length; i++) {
			if( val == y[i] ) {
				result.add(x[i]);
			}
		}
		
		return result;
	}
}

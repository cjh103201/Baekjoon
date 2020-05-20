package baekjoon_sol;

import java.util.Scanner;

public class sol_15649 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int N = sc.nextInt();
//		int M = sc.nextInt();
		
		int N = 4;
		int M = 3;
		
		boolean[] visited = new boolean[N];

		// 2개 뽑을 경우
		for(int i = 0; i< N; i++) {
			for(int j = i+1; j < N; j++) {
				if(!visited[j]) {
					System.out.println("(i, j) =  (" + i + ", " + j + ")");
					visited[j] = true;
				}
			}
			visited = new boolean[N];
			visited[i] = true;
		}
		
		for(int i = 0; i< N; i++) {
			for(int j = i+1; j < N; j++) {
				if(!visited[j]) {
					for(int k = j+1; k < N; k++) {
						if(!visited[j]) {
							System.out.println("(i, j, k) =  (" + i + ", " + j + ", " + k + ")");
							visited[k] = true;
						}
					}
					visited = new boolean[N];
					visited[j] = true;
				}
			}
			visited = new boolean[N];
			visited[i] = true;
		}
		
		sc.close();
	}

}

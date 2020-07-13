package baekjoon_sol;

import java.util.Scanner;

public class sol_15649 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int N = sc.nextInt();
//		int M = sc.nextInt();
		
		int N = 5;
		int M = 3;
		
		boolean[] visited = new boolean[N];
		for(int i = 0; i < N; i++) {
			visited = new boolean[N];
			visited[i] = true;
			
			
		}
//		while(countTrue(visited) == M) {
//			
//		}
		
//		for(boolean t : visited) {
//			System.out.println(t);
//		}
	


		
//		int N = 4;
//		int M = 3;
//		
//		boolean[] visited = new boolean[N];
//
//		// 2媛� 戮묒쓣 寃쎌슦
//		for(int i = 0; i< N; i++) {
//			for(int j = i+1; j < N; j++) {
//				if(!visited[j]) {
//					System.out.println("(i, j) =  (" + i + ", " + j + ")");
//					visited[j] = true;
//				}
//			}
//			visited = new boolean[N];
//			visited[i] = true;
//		}
//		
//		for(int i = 0; i< N; i++) {
//			for(int j = i+1; j < N; j++) {
//				if(!visited[j]) {
//					for(int k = j+1; k < N; k++) {
//						if(!visited[j]) {
//							System.out.println("(i, j, k) =  (" + i + ", " + j + ", " + k + ")");
//							visited[k] = true;
//						}
//					}
//					visited = new boolean[N];
//					visited[j] = true;
//				}
//			}
//			visited = new boolean[N];
//			visited[i] = true;
//		}
		
		sc.close();
	}

	public static int countTrue(boolean[] arr_bol) {
		// true 갯수 세기
		int cnt = 0;
		for(boolean a : arr_bol) {
			if(a) cnt++;
		}
		
		return cnt;
	}
	
}

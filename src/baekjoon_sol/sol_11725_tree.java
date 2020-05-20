package baekjoon_sol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 20. 04. 08
 * @desc
 *  	루트 없는 트리가 주어진다. 
 *  	이때, 트리의 루트를 1이라고 정했을 때, 각 노드의 부모를 구하는 프로그램을 작성하시오.
 *  
 *  입력
 *  	첫째 줄에 노드의 개수 N (2 ≤ N ≤ 100,000)이 주어진다. 
 *  	둘째 줄부터 N-1개의 줄에 트리 상에서 연결된 두 정점이 주어진다.
 *  
 *  출력
 *  	첫째 줄부터 N-1개의 줄에 각 노드의 부모 노드 번호를 2번 노드부터 순서대로 출력한다.
 *  
 */
public class sol_11725_tree {

	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			
			int N = Integer.parseInt(br.readLine());
			int[] arr1 = new int[N];
			int[] arr2 = new int[N];
			
			for(int i = 1; i<N; i++) {
				String[] input = br.readLine().split(" ");
				arr1[i] = Integer.parseInt(input[0]);
				arr2[i] = Integer.parseInt(input[1]);
			}
			
			int[] tree = new int[N+1];
			for(int i = 1; i<=N; i++) {
				int root = i;
				for(int j = 0; j<arr1.length; j++) {
					if(arr1[j] == root || arr2[j] == root) {
						System.out.println(arr1[j]);
						System.out.println(arr2[j]);
						System.out.println("========");
					}
				}
				System.out.println("-------------------------");
			}
			
			// arr1 = 1-6-3-4-2-4
			// arr2 = 6-3-5-1-4-7
			
			
//			1 - 6 - 3 - 5
//			  - 4 - 7 
//			      - 2
			
			
			int[] result = new int[N+1];
			int[] roots = new int[N+1];
			result[1] = 1;

			int index = 2;
			for(int i = 1; i<result.length; i++) {
				int root = result[i];
				for(int j = 1; j<arr1.length; j++) {
					if(arr1[j] == root && arr2[j] != -1) {
						roots[arr2[j]] = root;
						result[index] = arr2[j];
						index++;
						arr2[j] = -1;
					}
					
					if(arr2[j] == root && arr1[j] != -1) {
						roots[arr1[j]] = root;
						result[index] = arr1[j];
						index++;
						arr1[j] = -1;
					}
				}
			}
			
//			for(int i : result) {
//				System.out.println(i);
//			}
//			
//			System.out.println("=====");
//			
//			for(int i : roots) {
//				System.out.println(i);
//			}
			

			
			
//			for(int i = 2; i <= N; i++) {
//				for( int j = 0; j<result.length; j++) {
//					if(result[j] == i) {
//						System.out.println(roots[j]);
//					}
//				}
//			}
			
		} catch( Exception ex ) {
			ex.printStackTrace();
		}
	}

}

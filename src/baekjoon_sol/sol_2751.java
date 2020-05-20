package baekjoon_sol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author jeehyun
 * @date 20. 04. 08
 * @desc 정렬
 * 		N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 	   -> 힙정렬 ; O(NlogN)의 복잡도
 */
public class sol_2751 {

	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			
			int totalCnt = Integer.valueOf(br.readLine());
			int[] arr = new int[totalCnt];
			
			for(int i = 0; i<totalCnt; i++) {
				arr[i] = Integer.valueOf(br.readLine());
			}
			
			int[] result = new int[arr.length];
			for(int i = 0; i<result.length; i++) {
				arr = makeHeapTree(arr);
				result[i] = arr[0];
				arr[0] = arr[arr.length-i-1];
				arr[arr.length-1-i] = 1000000;
			}

			for(int a : result) {
				bw.write(a + "\n");
			}
			
			br.close();
			isr.close();
			bw.close();
			osw.close();
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static int[] makeHeapTree(int[] arr) {
		
		boolean chk = true;
		while(chk) {
			chk = false;
			for(int i = 0; i<= (arr.length/3 + 1); i++) {
				int l = ( i * 2 ) + 1;
				int r = l + 1;
				
				if(l < arr.length) {
					if(arr[i] > arr[l]) {
						changeVal(arr, i, l);
						chk = true;
					}
				}
				
				if(r < arr.length) {
					if(arr[i] > arr[r]) {
						changeVal(arr, i, r);
						chk = true;
					}
				}
			}
		}
		
		return arr;
	}
	
	
	public static void changeVal (int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

}

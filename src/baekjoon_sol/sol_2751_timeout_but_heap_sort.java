package baekjoon_sol;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 20. 04. 08
 * @desc 정렬
 * 		N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 	   -> 힙정렬 ; O(NlogN)의 복잡도
 */
public class sol_2751_timeout_but_heap_sort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int totalCnt = sc.nextInt();
		int[] arr = new int[totalCnt];
		for(int i = 0; i<totalCnt; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] result = new int[arr.length];
		for(int i = 0; i<result.length; i++) {
			arr = makeHeapTree(arr);
			result[i] = arr[0];
			arr[0] = arr[arr.length-1];
			arr = removeArry(arr);
		}
		
		for(int a : result) {
			System.out.println(a);
		}
	}
	
	public static int[] removeArry(int [] arr) {
		int[] nArr = new int[arr.length -1];
		
		for(int i = 0; i<arr.length -1; i++) {
			nArr[i] = arr[i];
		}
		
		return nArr;
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

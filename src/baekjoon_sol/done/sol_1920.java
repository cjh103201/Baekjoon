package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author Jeehyun
 * @date 20. 07. 13
 * @desc
 * 		수 찾기
 */
public class sol_1920 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 입력받기 - 변수 설정
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] find_arr = new int[m];
		for(int i = 0; i<find_arr.length; i++) {
			find_arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<find_arr.length; i++) {
			int find_val = find_arr[i];
			boolean flag = false;
			for(int j = 0; j<arr.length; j++) {
				if(find_val == arr[j]) {
					System.out.println("1");
					flag = true;
					break;
				}
			}
			if(!flag) System.out.println("0");
		}
		sc.close();
	}
}

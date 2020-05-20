package baekjoon_sol;

import java.util.Scanner;

public class sol_1037 {
	
	public static void main(String[] args) {
		
		
		// 원래 약수에서 1과 자기자신을 제외한 숫자가 주어짐
		
		// 4 2 -> 8
		// 3 5 -> 15
		// 2 4 8 -> 16
		
		
		// 최댓값을 먼저 찾고
		// 최댓값의 배수이면서 다른 나머지 숫자들로 나눠지는 수를 찾아
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int max = -1;
		for(int i = 0; i<N; i++) {
			int a = sc.nextInt();
			arr[i] = a;
			if(max < a) max = a;
		}
		
		int result = -1;
		for(int i = 0; i<N; i++) {
			if( max != arr[i]) {
				int tmp = max * arr[i];
				boolean flag = true;
				
				for(int j = 0; j<N; j++) {
					if( i != j && max != arr[j]) {
						int n = arr[j];
						if(tmp % n != 0) {
							flag = false;
							break;
						}
					}
				}
				
				if(flag) {
					result =tmp;
					break;
				}
			}
		}
		
		if(result == -1) {
			result = max * max;
		}
		
		System.out.println(result);
		sc.close();
	}
}

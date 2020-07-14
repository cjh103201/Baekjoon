package baekjoon_sol;

import java.util.ArrayList;
import java.util.Scanner;

public class sol_1038 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		while(list.size() < (n+1)) {
			list.add(i);
			if(i >= 10) {
				int len = (int) Math.log10(i) + 1;
				int num = i;
				int[] digit_num = new int[len];
				for(int j = 0; j < len; j++) {
					int rest = num % 10;
					num /= 10;
					digit_num[j] = rest;
				}
				
				// 감소하는지 체크
				for(int j = 0; j<digit_num.length - 1; j++) {
					int now = digit_num[j];
					int next = digit_num[j+1];
					
					if(now >= next) {
						list.remove(list.size()-1);
					}
				}
			}
			i++;
		}
		
		System.out.println(list.get(n));
		sc.close();
	}
}

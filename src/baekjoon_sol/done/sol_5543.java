package baekjoon_sol.done;

import java.util.Scanner;

public class sol_5543 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] burger_price = new int[3];
		int[] cok_price = new int[2];
		for(int i = 0; i<5; i++) {
			if(i <3) {
				burger_price[i] = sc.nextInt();				
			} else {
				cok_price[i-3] = sc.nextInt();
			}
		}
		
		int set_price = 4000;
		for( int i = 0; i<burger_price.length; i++) {
			for(int j = 0; j < cok_price.length; j++) {
				int tmp = burger_price[i] + cok_price[j];
				if(tmp < set_price) {
					set_price = tmp;
				}
			}
		}
		
		System.out.println(set_price-50);
		sc.close();
	}

}

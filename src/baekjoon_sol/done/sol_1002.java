package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @desc
 * 조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 
 * 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 
 * 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램
 * 
 * 
 * 1. 원의 중심이 다른 경우
 * 2. 원의 중심이 같은 경우
 * 
 */

public class sol_1002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i = 0; i<cnt; i++ ) {
			
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			// 중심 사이의 거리 구하기
			double d = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)); 
			
			if(d == 0) {  // 중심이 일치하는 경우
				
				if(r1 == r2) {  // 일치
					System.out.println(-1);
				} else { // 만나지 않음
					System.out.println(0);
				}
				
			} else {   // 중심이 일치하지 않는 경우
				
				int d1 = r1 + r2;
				int d2 = Math.abs(r1 - r2);
				
				if( d1 == d || d2 == d ) {
					System.out.println(1);
				} else if( d > d1 || d < d2 ) {
					System.out.println(0);
				} else {
					System.out.println(2);
				}
				
			}
		}
		
	}

}

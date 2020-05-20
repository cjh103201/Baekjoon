package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Aug 12, 2019
 * @desc	:
 *		다이얼 전화 걸
 */
public class sol_5622 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int totalTime = input.length();
		for(int i = 0; i < input.length(); i++) {
			
			char in = input.charAt(i);
			
			if(in == 'A' || in == 'B' || in == 'C') {
				totalTime+=2;
			} else if (in == 'D'|| in == 'E' || in == 'F') {
				totalTime+=3;
			} else if (in == 'G'|| in == 'H' || in == 'I') {
				totalTime+=4;
			} else if (in == 'J'|| in == 'K' || in == 'L') {
				totalTime+=5;
			} else if (in == 'M'|| in == 'N' || in == 'O') {
				totalTime+=6;
			} else if (in == 'P'|| in == 'Q' || in == 'R' || in == 'S') {
				totalTime+=7;
			} else if (in == 'T'|| in == 'U' || in == 'V') {
				totalTime+=8;
			} else {
				totalTime+=9;
			}
		}
		
		System.out.println(totalTime);
		
		sc.close();
	}

}

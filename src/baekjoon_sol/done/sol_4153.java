package baekjoon_sol.done;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Aug 23, 2019
 * @desc	: 직각삼각형인지 아닌지 판별
 *
 */
public class sol_4153 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> inputList = new ArrayList<>();
		
		// 0 0 0이 입력될 때까지 반복
		while(true) {
			String input = sc.nextLine();
			if(input.trim().equals("0 0 0")) break;
			inputList.add(input);
		}
		
		for(String input : inputList) {
			int[] vals = { Integer.valueOf(input.split(" ")[0]), 
					Integer.valueOf(input.split(" ")[1]), 
					Integer.valueOf(input.split(" ")[2]) }; 
			
			// max값 구하기
			int maxIdx = 0;
			int a = -1;
			int b = -1;
			int c = -1; // maximum value
			for(int i = 0; i<3; i++) {
				if(Integer.valueOf(input.split(" ")[i]) > c) {
					maxIdx = i;
					c = Integer.valueOf(input.split(" ")[i]);
				}
			}
			
			for(int i = 0; i<3; i++) {
				if(maxIdx != i) {
					if(a == -1) a = Integer.valueOf(input.split(" ")[i]);
					else if(b == -1) b = Integer.valueOf(input.split(" ")[i]);
				}
			}
			
			if(a*a + b*b == c*c) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}

		sc.close();
	}

}

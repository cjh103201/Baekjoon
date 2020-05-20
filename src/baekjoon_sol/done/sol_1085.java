package baekjoon_sol.done;

import java.util.Scanner;

public class sol_1085 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		int w = Integer.parseInt(input[2]);
		int h = Integer.parseInt(input[3]);
		
		int min_x = Math.min(Math.abs(x), Math.abs(w - x));
		int min_y = Math.min(Math.abs(y), Math.abs(h - y));

		System.out.println(Math.min(min_x, min_y));
		sc.close();
	}

}

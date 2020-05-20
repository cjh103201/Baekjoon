package baekjoon_sol.done;

import java.util.ArrayList;
import java.util.Scanner;

public class sol_3009 {
	
	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> xs = new ArrayList<>();
		ArrayList<Integer> ys = new ArrayList<>();

		
		for(int i = 0; i<3; i++) {
			String[] input = sc.nextLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			if(xs.contains(x)) {
				xs.removeIf(name -> name.equals(x));
			} else {
				xs.add(x);
			}
			
			if(ys.contains(y)) {
				ys.removeIf(name -> name.equals(y));
			} else {
				ys.add(y);
			}
		}
		
		System.out.println(xs.get(0) + " " + ys.get(0));
		sc.close();
	}

}

package baekjoon_sol.done;

import java.util.HashSet;
import java.util.Scanner;

public class sol_3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> resultSet = new HashSet<>();
		
		for(int i = 0; i<10; i++) {
			int val = sc.nextInt();
			int mod = val % 42;
			
			resultSet.add(mod);
		}
		
		sc.close();
		System.out.println(resultSet.size());

	}

}

package baekjoon_sol;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 20. 04. 08
 * @desc
 * 		Fly me to the Alpha Centauri
 */
public class sol_1011 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCnt = sc.nextInt();
		for(int i = 0; i<testCnt; i++) {
			int x = sc.nextInt();  // 0
			int y = sc.nextInt();  // 3
			
			ArrayList<ArrayList<Integer>> allProb = new ArrayList<>();
			for(int j = 0; j<(y - x); j++) {
				ArrayList<Integer> tmp = new ArrayList<>();
				for(int k = 1; k>-2; k--) {
					if(j+k > 0) {
						tmp.add(j + k);
					}
				}
				allProb.add(tmp);
			}
			
			for(int j = allProb.size()-1; j>= 0; j--) {
				System.out.println(allProb.get(j));
			}
			
		}
	}

}

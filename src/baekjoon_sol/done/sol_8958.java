package baekjoon_sol.done;

import java.util.Scanner;

public class sol_8958 {

	// OX 퀴즈 채점하기!
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int totalCnt = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i<totalCnt; i++) {
			String OX = sc.nextLine();
			int totalPoint = 0;
			int cntPoint = 1;
			
			if(OX.charAt(0) == 'O') {
				totalPoint++;
			}
			
			for(int j = 1; j < OX.length(); j++) {
				
				if(OX.charAt(j-1) == 'O' && OX.charAt(j) == 'O') {
					cntPoint++;
					totalPoint += cntPoint;
				} else if (OX.charAt(j) == 'X') {
					cntPoint = 0;
				} else if (OX.charAt(j) == 'O') {
					cntPoint = 1;
					totalPoint += cntPoint;
				}
				
				
			}
			
			System.out.println(totalPoint);
		}

		sc.close();
	}
}

package baekjoon_sol.done;

import java.util.Scanner;

public class sol_10250 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int caseCnt = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < caseCnt; i++) {
			String caseIn = sc.nextLine();
			int H = Integer.valueOf(caseIn.split(" ")[0]);
			int W = Integer.valueOf(caseIn.split(" ")[1]);
			int N = Integer.valueOf(caseIn.split(" ")[2]);
			
			String result = "";
			for(int j = 1; j<=W ; j++) {
				int total = j * H;
				if( total >= N ) {
					// 호
					if(j < 10) {
						result += "0";
					}
					result += j;
					
					// 층
					int floor = N - ((j-1) * H);
					result = floor + result;
					break;
				}
			}
			System.out.println(result);
		}
		sc.close();
	}
}

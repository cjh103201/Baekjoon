package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 2020. 4. 13.
 * @desc   문자열
 *	문제
 *   길이가 N으로 같은 문자열 X와 Y가 있을 때, 두 문자열 X와 Y의 차이는 X[i] ≠ Y[i]인 i의 개수이다. 
 *   예를 들어, X=”jimin”, Y=”minji”이면, 둘의 차이는 4이다.
 *   
 *   두 문자열 A와 B가 주어진다. 이때, A의 길이는 B의 길이보다 작거나 같다. 
 *   이제 A의 길이가 B의 길이와 같아질 때 까지 다음과 같은 연산을 할 수 있다.
 *   	1. A의 앞에 아무 알파벳이나 추가한다.
 *   	2. A의 뒤에 아무 알파벳이나 추가한다.
 *   이때, A와 B의 길이가 같으면서, A와 B의 차이를 최소로 하는 프로그램을 작성하시오.
 *   
 *  입력
 *   첫째 줄에 A와 B가 주어진다. 
 *   A와 B의 길이는 최대 50이고, A의 길이는 B의 길이보다 작거나 같고, 알파벳 소문자로만 이루어져 있다.
 *   
 *  출력
 *   A와 B의 길이가 같으면서, A와 B의 차이를 최소가 되도록 했을 때, 그 차이를 출력하시오.
 *
 * @testCase : adaabc aababbc -> 2
 * 
 */
public class sol_1120 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] inputs = sc.nextLine().split(" ");
		
		// 입력된 문자열을 문자열의 글자 수가 적은 문자열을 앞에 위치
		if(inputs[0].length() > inputs[1].length()) {
			String tmp = inputs[1];
			inputs[1] = inputs[0];
			inputs[0] = tmp;
		}
		
		int diff = inputs[1].length() - inputs[0].length();
		int cnt = inputs[1].length();
		for(int i = 0; i<=diff; i++) {   // 0 1 2
			int tmpCnt = 0;
			for(int j = 0; j<inputs[0].length(); j++) {  // 0 1 2 3
				int a = inputs[0].charAt(j);
				int b = inputs[1].charAt(i+j);
				
				if(a != b) {
					tmpCnt++;
				}
			}
			if(cnt > tmpCnt) cnt = tmpCnt;
		}

		System.out.println(cnt);
		sc.close();
	}

}

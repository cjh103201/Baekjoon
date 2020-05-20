package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 2020. 5. 7.
 * @desc	펠린드롬
 *	팰린드롬은 앞으로 읽으나 뒤로 읽으나 똑같은 단어나 숫자들을 말한다. 
 *	일반적으로 대소문자를 구분하지 않지만, 공백은 구분한다.
 *	
 *	입력
 *  첫째 줄에 테스트 케이스의 개수 n이 주어진다.
 *  각 테스트 케이스는 한 줄의 텍스트로 이루어져있으며, 비어있는 줄은 없다.
 *  
 *  출력
 *  각 테스트 케이스에 대해 정답을 출력한다.
 *  팰린드롬일 경우 "Yes"를 출력하고, 그렇지 않을 경우 "No"를 출력한다.
 *
 *
 */
public class sol_10174 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<T; i++) {
			String input = sc.nextLine().toLowerCase();
			int l = input.length();
			boolean flag = true;
			for(int j = 0; j<l/2; j++) {
				char f = input.charAt(j);
				char e = input.charAt(l-j-1);
				
				if(f != e) {
					System.out.println("No");
					flag = false;
					break;
				}
			}
			
			if(flag) System.out.println("Yes");
		}
		sc.close();
	}

}

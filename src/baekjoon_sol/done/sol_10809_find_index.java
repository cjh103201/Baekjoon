package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Jul 15, 2019
 * @desc	: 문자열에서 문자가 처음으로 나오는 위치 찾기
 *
 */
public class sol_10809_find_index {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		char[] inputChar = input.toCharArray();
		int[] index = new int[26];
		
		for(int i = 97; i<123; i++) {
			char a = (char)i;  // a ~ z까지 입력받음!
			int idx = -1;
			for(int j = 0; j < inputChar.length; j++ ) {
				if( a == inputChar[j]) {
					idx = j;
					break;
				}
			}
			
			index[i-97] = idx;
		}
		
		for(int a : index) {
			if(a == 25) {
				System.out.println(a);
			} else {
				System.out.print(a + " ");
			}
		}
		sc.close();
		
	}
}

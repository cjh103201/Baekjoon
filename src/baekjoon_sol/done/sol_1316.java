package baekjoon_sol.done;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Aug 27, 2019
 * @date 	: Mar 23, 2020
 * @desc	:  그룹 단어 체커  ; 그룹단어를 체크
 *
 */
public class sol_1316 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int totalCnt = sc.nextInt();
		sc.nextLine();
		int result = totalCnt;
		
		for(int i = 0; i<totalCnt; i++) {
			String str_input = sc.nextLine();
			String new_input = String.valueOf(str_input.charAt(0));
			for(int j = 0; j<str_input.length()-1; j++) {   // 연달아서 있는 문자 삭제하기
				char now_char = str_input.charAt(j);
				char next_char = str_input.charAt(j+1);
				
				if(!(now_char == next_char)) {
					new_input += String.valueOf(next_char);
				}
			}
			
			HashSet<Character> char_set = new HashSet<>();
			for(int j = 0; j<new_input.length(); j++) {
				char one = new_input.charAt(j);
				if(!char_set.contains(one)) {
					char_set.add(one);
				} else {
					result--;
					break;
				}
			}
		}
		System.out.println(result);
		sc.close();
	}
}

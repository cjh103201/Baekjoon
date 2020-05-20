package baekjoon_sol;

import java.util.ArrayList;
import java.util.Collections;

public class kakao2019 {
	
//	public static boolean check(String p) {
//		
//		boolean ck = false;
//		String new_p = p;
//		
//		while(true) {
//			int ex_len = new_p.length();
//			new_p = new_p.replace("()", "");
//			int cur_len = new_p.length();
//			if(ex_len == cur_len) break;
//		}
//		
//		if(new_p.length() == 0) ck = true;
//		
//		return ck;
//	}

	public static void main(String[] args) {
		
//		'(' 와 ')' 로만 이루어진 문자열이 있을 경우, '(' 의 개수와 ')' 의 개수가 같다면 이를 균형잡힌 괄호 문자열이라고 부릅니다.
//		그리고 여기에 '('와 ')'의 괄호의 짝도 모두 맞을 경우에는 이를 올바른 괄호 문자열이라고 부릅니다.
//		예를 들어, "(()))("와 같은 문자열은 균형잡힌 괄호 문자열 이지만 올바른 괄호 문자열은 아닙니다.
//		반면에 "(())()"와 같은 문자열은 균형잡힌 괄호 문자열 이면서 동시에 올바른 괄호 문자열 입니다.
//
//		'(' 와 ')' 로만 이루어진 문자열 w가 균형잡힌 괄호 문자열 이라면 다음과 같은 과정을 통해 올바른 괄호 문자열로 변환할 수 있습니다.
//
//		1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다. 
//		2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다. 
//		3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다. 
//		  3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다. 
//		4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다. 
//		  4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다. 
//		  4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다. 
//		  4-3. ')'를 다시 붙입니다. 
//		  4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다. 
//		  4-5. 생성된 문자열을 반환합니다.
//		균형잡힌 괄호 문자열 p가 매개변수로 주어질 때, 주어진 알고리즘을 수행해 올바른 괄호 문자열로 변환한 결과를 return 하도록 solution 함수를 완성해 주세요.
		

//		String p = "()))((()";
//		
//		String answer = "";
//		
//		// 이미 올바른 괄호 문자열인지 확인
//		boolean ck = check(p);
//		if(ck) {
//			answer = p;
//		} else {
//			String u = p.substring(0, 2);
//			String v = p.substring(2);
//			
//			ck = check(u);
//			
//			
//		}
//		
//		System.out.println(answer);
		
		
		
//		int total = 0;
//		
//		
//		for(int i = 0; i<p.length(); i++) {
//			if(p.charAt(i) == '(' ) {
//				total--;
//			} else if(p.charAt(i) == ')') {
//				total++;
//			}
//			
//			if(total == 0) {
//				System.out.println(p.substring(0, i+1));
//			}
//		}
		
		
		
		int n = 12; 
		int[] weak = {1, 5, 6, 10};
		int[] dist = {1, 2, 3, 4};
		
		
		
		
		
//		String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
//		String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};
//		
//		int[] answer = new int[queries.length];
//		for(int j = 0; j<queries.length; j++) {
//			
//			String q = queries[j];
//			
//			int start = -1;
//			int end = q.length();
//			int cnt = 0;
//			
//			for(int i = 0; i<q.length(); i++) {
//				if( start == -1 && !q.substring(i, i+1).equals("?")) {
//					start = i;
//				}
//				
//				if( i != q.length()-1 ) { 
//					if(!q.substring(i, i+1).equals("?") && q.subSequence(i+1, i+2).equals("?") ) {
//						end = i+1;
//					}
//				}
//			}
//			
//			for(String w : words) {
//				if(w.length() == q.length()) {
//					if(w.substring(start, end).equals(q.substring(start, end))) {
//						cnt++;
//					}
//				}
//			}
//			
//			answer[j] = cnt;
//			System.out.println(cnt);
//		}
		
		String s = "abcabcabcabcdedededededeabab";
		
		int unit = 0;
		ArrayList<Integer> results = new ArrayList<>(); 
		while (true) {
			String result = "";
			int cnt = 1;
			String tmp = "";
			String last = s.substring(s.length()-unit-1);
			
			unit++;
			
			for(int i = 0; i < s.length()-unit; i=i+unit) {
				tmp = s.substring(i, i+unit);
				
				if(i+unit+unit <= s.length() ) {
					if(s.substring(i, i+unit).equals(s.substring(i+unit, i+unit+unit))) {
						cnt++;
					} else {
						if(cnt != 1) result += cnt;
						result += tmp;
						cnt = 1;
					}
				} else {
					result += s.substring(i);
				}
				
				if(i == s.length()-unit-unit) {
					if(cnt != 1) result += cnt;
					result += last;
				}
			}
			
			System.out.println(result);
			results.add(result.length());
			if(unit == s.length()/2) break;
		}
//		
//		int answer = Collections.min(results);
//		System.out.println(answer);

	}
}

package baekjoon_sol.done;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author	: jeehyun
 * @date 	: Jul 15, 2019
 * @desc	: 가장 많이 사용된 알파켓을 대문자로 출력
 * 			===> 아스키코드의 int 값을 이용하면 빠르다.
 *
 */
public class sol_1157_fine_max_use_alphaber {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] in = br.readLine().toUpperCase().toCharArray();
		int[] cnt = new int[26];
		
		for(char i : in) {
			int idx = i;
			cnt[idx-65]++;
		} // a ~ z까지 모두 대응이 되도록 알파벳의 갯수를 가진 배열 생성 
		
		// 최대값 찾기
		String result = "?";
		int maxVal = -1;
		// maximum 값을 갖는 인덱스 값이 필요!
		for(int i = 0; i<cnt.length; i++) {
			if(maxVal < cnt[i]) {
				maxVal = cnt[i];
				char str = (char) (i + 65);
				result = Character.toString(str);
			} else if (maxVal == cnt[i]) {
				result = "?";
			}
		}
		
		System.out.println(result);
		br.close();
		
		
//		int[] cnt = new int[input.length()];
//		int max = -1;
//		char result = '?';
//		
//		for(int i = 0; i<input.length(); i++) {
//			cnt[input.charAt(i) - 65]++;
//			if(max < cnt[input.charAt(i)-65]) {
//				max = cnt[input.charAt(i)-65];
//				result = input.charAt(i);
//			} else if(max == cnt[input.charAt(i)-65]) {
//				result = '?';
//			}
//		}
//		
//		System.out.println(result);
//		br.close();
		
//		String in = br.readLine();
//		String[] input = in.toUpperCase().split("");
//		
//		HashMap<String, Integer> alphabetMapping = new HashMap<>();
//		
//		for(String i : input) {
//			if(alphabetMapping.containsKey(i)) {
//				alphabetMapping.put(i, alphabetMapping.get(i)+1);
//			} else {
//				alphabetMapping.put(i, 1);
//			}
//		}
//		
//		String result = "?";
//		int max = -1;
//		// Map에서 value가 최대인 값 찾기
//		for(String i : alphabetMapping.keySet()) {
//			if(max < alphabetMapping.get(i)) {
//				max = alphabetMapping.get(i);
//				result = i;
//			} else if(max == alphabetMapping.get(i)) result = "?";
//		}
//		
//		System.out.println(result);
	}
}

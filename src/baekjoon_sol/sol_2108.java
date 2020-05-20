package baekjoon_sol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author jeehyun
 * @date 20. 04. 08
 * @desc
 * 		수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.
 *      
 *      산술평균 : N개의 수들의 합을 N으로 나눈 값
 *      중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 *      최빈값 : N개의 수들 중 가장 많이 나타나는 값
 *      범위 : N개의 수들 중 최댓값과 최솟값의 차이
 *      
 *      N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
 *      
 *      
 *      첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 
 *      그 다음 N개의 줄에는 정수들이 주어진다. 
 *      입력되는 정수의 절댓값은 4,000을 넘지 않는다.
 */
public class sol_2108 {

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			int N = Integer.parseInt(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>();
			
			int sum = 0;
			int min = 4000;
			int max = -4000;
			for(int i = 0; i<N; i++) {
				int tmp = Integer.parseInt(br.readLine());
				arr.add(tmp);
				sum += tmp;
				if(tmp > max) max = tmp;
				if(tmp < min) min = tmp;
			}
			
			Collections.sort(arr);

			int mean = sum / N;
			int mid = arr.get(N/2);
			int mode = 0;
			int range = max - min;
			
			bw.write(mean + "\n");
			bw.write(mid + "\n");
			bw.write(mode + "\n");
			bw.write(range + "\n");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}

package baekjoon_sol.done;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author jeehyun
 * @date 2020. 5. 4.
 * @desc    A + B
 *    첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. 
 *    A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)
 *    
 *    각 테스트 케이스마다 A+B를 출력한다.
 *
 */
public class sol_10953 {

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			int N = Integer.parseInt(br.readLine());
			for(int i = 0; i<N; i++) {
				String[] in = br.readLine().split(",");
				bw.write(Integer.parseInt(in[0]) + Integer.parseInt(in[1]) + "\n");
			}
			bw.flush();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}

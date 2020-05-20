package baekjoon_sol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author jeehyun
 * @date 20. 04. 10
 * @desc 책 페이지
 * 	문제
 * 	  지민이는 N쪽인 책이 한권 있다. 
 *    첫 페이지는 1쪽이고, 마지막 페이지는 N쪽이다. 
 *    각 숫자가 모두 몇 번이 나오는지 출력하는 프로그램을 작성하시오.
 * 
 * 	입력
 * 	  첫째 줄에 N이 주어진다. 
 *    N은 1,000,000,000보다 작거나 같은 자연수이다.
 * 
 *  출력
 *    첫째 줄에 0이 총 몇 번 나오는지, 1이 총 몇 번 나오는지, ..., 9가 총 몇 번 나오는지를 출력한다.
 */
public class sol_1019_time_out {

	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			int N = Integer.parseInt(br.readLine());
			long start = System.currentTimeMillis();
			int[] cnt = new int[10];

			for(int i = 1; i <= N; i++) {
				int tmp = i;

				while(true) {
					if(tmp < 10) {
						cnt[tmp]++;
						break;
					} else {
						cnt[(tmp%10)]++;
						tmp /= 10;
					}
				}
			}
			
			for(int c : cnt) {
				bw.write(c + "\n");
			}
			
			long end = System.currentTimeMillis();
			bw.write("실행 시간 : " + ( end - start )/1000.0 + "\n" );
			
			bw.flush();
			bw.close();
			osw.close();
			br.close();
			isr.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

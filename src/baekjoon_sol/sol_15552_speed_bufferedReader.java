package baekjoon_sol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author jeehyun
 * @desc
 * Scanner와 sysout보다
 * BufferedReader와 BufferedWriter.flush를 사용하여 빠른 덧셈 구현 ==> 실행 시간 : 992ms
 * 
 * 
 * Python을 사용하고 있다면, 
 * input 대신 sys.stdin.readline을 사용할 수 있다. 
 * 단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 
 * .rstrip()을 추가로 해 주는 것이 좋다.
 */
public class sol_15552_speed_bufferedReader {

	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			int totalNum = Integer.valueOf(br.readLine());
			
			for(int i = 0; i < totalNum; i++) {
				String line = br.readLine();
				String[] inputVal = line.split(" ");
				
				String result = String.valueOf(Integer.valueOf(inputVal[0]) + Integer.valueOf(inputVal[1]));
				bw.write(result + "\n");
			}
			
			bw.flush();
			br.close();
			isr.close();
			bw.close();
			osw.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

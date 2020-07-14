package baekjoon_sol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashSet;

/**
 * 
 * @author jeehyun
 * @date 20. 04. 09
 * @desc   제곱 ㄴㄴ수
 * 	 문제
 * 		어떤 수 X가 1보다 큰 제곱수로 나누어 떨어지지 않을 때, 제곱ㄴㄴ수라고 한다. 
 * 		제곱수는 정수의 제곱이다. 
 * 		min과 max가 주어지면, min과 max를 포함한 사이에 제곱ㄴㄴ수가 몇 개 있는지 출력한다.
 *   
 *   입력
 *   	첫째 줄에 min과 max가 주어진다. 
 *   	min은 1보다 크거나 같고, 1,000,000,000,000보다 작거나 같은 자연수이고, max는 min보다 크거나 같고, min+1,000,000보다 작거나 같은 자연수이다.
 *
 *   출력
 *   	첫째 줄에 [min,max]구간에 제곱ㄴㄴ수가 몇 개인지 출력한다.
 */
public class sol_1016_time_out {

	public static void main(String[] args) {
		
		long min = Long.parseLong("1000000000000");
		long max = Long.parseLong("1000001000000");
		
		long totalCnt = max - min + 1;
		
		for(long n = min; n <= max; n++) {
			for(long i = 2; i*i <= max; i++) {
				long dbl_num = i * i;     // 4, 9, 16
				if( n % dbl_num == 0) {
					totalCnt--;
					break;
				}
			}
		}
		
		System.out.println(totalCnt);
		
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		
//		try {
//			String[] input = br.readLine().split(" ");
//			
//			long min = Long.parseLong(input[0]);
//			long max = Long.parseLong(input[1]);
//			
//			long cnt = max - min + 1;
//			int rootMax = (int)Math.sqrt(max);
//			HashSet<Long> arr = new HashSet<>();
//			
//			for(int i = 2; i <= rootMax; i++) {
//				int sqr = i * i;
//			
//				long start = min / sqr + 1;
//				long end = max / sqr;
//				
//				for(long j = start; j<= end; j++) {
//					long val = sqr * j;
//					System.out.println(val);
//					arr.add(val);
//				}
//			}
//			
//			long result = cnt - arr.size();
//			System.out.println(result);
//			
////			4 / 8 / 12 / 16 / 20 / 
////			24 / 28 / 32 / 36 / 40  
////			44 / 48 / 52 / 56 / 60 
////			64 / 68 / 72 / 76 / 80
////			84 / 88 / 92 / 96 / 100 
////			9 / 18 / 27 / 45 / 54
////			63 / 81 / 90 / 99 / 25 
////			50 / 75 / 49 / 98 / 
//
////			1 ~ 100
////5 * 8 - 1 = 39
////			   100 - 39  => 61개
////	10 ~ 100 : 	61 - 3 = 58
//			
//			
//			
//			
////			for(int i = 2; i<=rootMax; i++) {
////				int sqr = i * i;
////				
////				long start = min / sqr + 1;
////				long end = max / sqr;
////				
////				for(long j = start; j<=end; j++) {
////					long val = sqr * j;
////					val -= min;
////					
////					
//////					if(arr[(int) val]) {
//////						break;
//////					}
////					arr[(int) val] = true;
////				}
////			}
////			
////			int result = 0;
////			int size = arr.length;
////			for(int i = 0; i<size; i++) {
////				if(!arr[i]) {
////					result++;
//////					System.out.println(i + min);
////				}
////			}
////			 // 4 9 25 49
////
////			System.out.println("===");
////			System.out.println(result);
//			
//
////			for(int i = 2; i<=rootMax; i++) {
////				long t = i * i;
////				for(long j = min / t; t*j <= max; j++) {
////					long idx = (j * t) - min;
////					System.out.println(idx);
////					arr[(int) idx] = 1;
////				}
////			}
////			
////			for(long a : arr) {
////				if(a==1) cnt--;
////			}
////			
////			System.out.println(cnt);
//
//			br.close();
//			isr.close();
//			
//		} catch(Exception ex) {
//			ex.printStackTrace();
//		}
	}
}

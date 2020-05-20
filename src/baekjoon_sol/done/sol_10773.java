package baekjoon_sol.done;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @desc
 *  첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)
 *  이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며, 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
 *  정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.
 *  
 */
public class sol_10773 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		
		ArrayList<Integer> inputs = new ArrayList<>();
		int sum = 0;
		for(int i = 0; i < K; i++) {
			int in = sc.nextInt();
			if(in != 0) {
				sum += in;
				inputs.add(in);
			} else {
				int before = inputs.get(inputs.size() -1);
				inputs.remove(inputs.size() -1);
				sum -= before;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}

package baekjoon_sol.done;

import java.util.Scanner;

/**
 * 
 * @author	: jeehyun
 * @date 	: Jul 15, 2019
 * @desc	: 입력된 순서 오름, 내림, 섞여있는지 확인
 *
 */
public class sol_2920_sort_check {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] inputs = sc.nextLine().split(" ");
		
		boolean check = true; // 오름차순 : true, 내림차순 : false
		
		if(Integer.parseInt(inputs[0]) > Integer.parseInt(inputs[1])) {  // 첫 번째 상태 결정
			check = false;
		}
		
		String result = "";
		
		for(int i = 0; i<7; i++) {
			int now = Integer.parseInt(inputs[i]);
			int next = Integer.parseInt(inputs[(i+1)]);
			
			if( (check && now > next) || (!check && now < next) ) {
				result = "mixed";
				break;
			}
		}
		
		if(!result.equals("mixed")) {
			if(check) result = "ascending";
			if(!check) result = "descending";
		} 

		System.out.println(result);
		sc.close();
	}

}

package baekjoon_sol.done;

import java.util.Scanner;
/**
 * 
 * @author	: jeehyun
 * @date 	: Aug 13, 2019
 * @desc	: 크로아티아 알파벳 
 * 			https://www.acmicpc.net/problem/2941
 *
 */
public class sol_2941 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
        
        String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="}; 
        String input = sc.nextLine().trim();
        int result = 0;
        
        for(int i = 0; i<word.length; i++) {
        	if(input.contains(word[i])) {
        		input = input.replaceAll(word[i], "^");
        	}
        }
        
        result = input.length();
        System.out.println(result);

        sc.close();
	}

}

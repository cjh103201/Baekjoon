package baekjoon_sol;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * 
 * @author jeehyun
 * @date 2020. 4. 27.
 * @desc    별 찍기 - 10
 * 
 * 	재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.
 * 
 *  크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.
 *  		***
 *  		* *
 *  		***
 *  
 *  N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 
 *  예를 들어 크기 27의 패턴은 예제 출력 1과 같다.
 *		***************************
 *		* ** ** ** ** ** ** ** ** *
 *		***************************
 *		***   ******   ******   ***
 *		* *   * ** *   * ** *   * *
 *		***   ******   ******   ***
 *		***************************
 *		* ** ** ** ** ** ** ** ** *
 *		***************************
 *		*********         *********
 *		* ** ** *         * ** ** *
 *		*********         *********
 *		***   ***         ***   ***
 *		* *   * *         * *   * *
 *		***   ***         ***   ***
 *		*********         *********
 *		* ** ** *         * ** ** *
 *		*********         *********
 *		***************************
 *		* ** ** ** ** ** ** ** ** *
 *		***************************
 *		***   ******   ******   ***
 *		* *   * ** *   * ** *   * *
 *		***   ******   ******   ***
 *		***************************
 *		* ** ** ** ** ** ** ** ** *
 *		***************************
 *
 */
public class sol_2447 {

	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
		int N = 9;
		int size = N/3;
		String[] l = new String[N];
		for(int i = 0; i<l.length; i++) {
			l[i] = "";
		}
		
		drawStars(size, 1, l);
		
		for(String t : l) {
			System.out.println(t);
		}
		
//		OutputStreamWriter osw = new OutputStreamWriter(System.out);
//		BufferedWriter bw = new BufferedWriter(osw);

		sc.close();
	}
	
	// 재귀함수
	public static void drawStars(int n, int index, String[] list) {
		
		System.out.println("n = " + n);
		System.out.println("index = " + index);
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(i == 1 && j == 1) {
					if(n == 1) {
						System.out.print(" ");
					} else {
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("   ");
						index++;
					}
				} else {
//					System.out.print("(" + i + ", " + j + ")  ");
					if(n >= 3) {
						drawStars(n/3, index++, list);
					} else {
						System.out.print("*");
//						list[index-1] += "*";
					}
				}
			}
			System.out.println();
		}
		
	}
}

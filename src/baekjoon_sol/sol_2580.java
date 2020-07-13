package baekjoon_sol;

import java.util.Scanner;

/**
 * 
 * @author Admin
 * @date   20. 07. 13
 * @desc
 * 		스도쿠 채우기
 *
 */
public class sol_2580 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] sudoku = new int[9][9];
		
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<9; j++) {
				sudoku[i][j] = sc.nextInt();
			}
		}
		
		int type = 1;   // 1 : 가로, 2 : 세로
		while(!chkZeros(sudoku)) {
			if(type == 1) {
				sudoku = doVertical(sudoku);
				type = 2;
				
				for(int i = 0; i<9; i++) {
					for(int j = 0; j<9; j++) {
						System.out.print(sudoku[i][j] + " ");
					}
					System.out.println();
				}
				
			} else {
				sudoku = doHorizontal(sudoku);
				type = 1;
				
				for(int i = 0; i<9; i++) {
					for(int j = 0; j<9; j++) {
						System.out.print(sudoku[i][j] + " ");
					}
					System.out.println();
				}
			}
			
			System.out.println("===");
		}
		
		// 최종 결과 출력
		
		
		sc.close();
	}
	
	public static boolean chkZeros(int[][] arrs) {
		
		for(int i = 0; i<arrs.length; i++) {
			for(int j = 0; j<arrs[i].length; j++) {
				if(arrs[i][j] == 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static int[][] doHorizontal(int[][] sudoku) {
		
		for(int i = 0; i<9; i++) {
			int[] sub = new int[9];
			for(int j = 0; j<9; j++) {
				sub[j] = sudoku[j][i];
			}			
			
			int zero = countZero(sub);
			if(zero == 1) {
				boolean[] visited = new boolean[9];
				int zeroIdx = 0;
				for(int j = 0; j<9; j++) {
					int num = sub[j];
					if(num != 0) visited[(num-1)] = true;
					if(num == 0) zeroIdx = j;
				}
				
				for(int k = 0; i<9; k++) {
					if(!visited[k]) {
						sudoku[zeroIdx][i] = (k+1);
						break;
					}
				}
			}

		}
		
		return sudoku;
	}
	
	public static int[][] doVertical(int[][] sudoku) {
		
		for(int i = 0; i<9; i++) {
			int zero = countZero(sudoku[i]);
			if(zero == 1) {
				boolean[] visited = new boolean[9];
				int zeroIdx = 0;
				for(int j = 0; j<9; j++) {
					int num = sudoku[i][j];
					if(num != 0) visited[(num-1)] = true;
					if(num == 0) zeroIdx = j;
				}
				
				for(int k = 0; k<9; k++) {
					if(!visited[k]) {
						sudoku[i][zeroIdx] = (k+1);
						break;
					}
				}
			}
		}
		
		return sudoku;
	}
	
	public static int countZero(int[] arr_num) {
		int cnt = 0;
		for(int a : arr_num) {
			if(a == 0) cnt++;
		}
		
		return cnt;
	}

}

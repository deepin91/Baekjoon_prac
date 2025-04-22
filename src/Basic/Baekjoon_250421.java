package Basic;

import java.util.Scanner;

public class Baekjoon_250421 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int[] num = {a, b, c};
		
		int max = num[0];
		int min = num[0];
		
		for(int i=0; i < num.length; i++) { 
			for(int p=01; p < 2; p++) { 
			if(num[0] < num[p]) {
				min = num[i];
				max = num[p];
			}
			}
		}
		System.out.printf("min: %d",min);
		
		
		
		
		}
}
	

//7 4 6



// 7 < 4 
// 7 < 6

// 4 < 4
// 4 < 6 4

// 6 < 4
// 6 < 6 

//4 6 3

// 4 < 6 min 4
// 4 < 3 

// 6 < 6 
// 6 < 3

// 3 < 6 min 3
// 3 < 3








//

//
// 5 < 6 = min 8, max 6
// 8 < 7 = min 6, max 7

//max 8, 5
// 7 <>
package Basic;

import java.util.Scanner;

public class Baekjoon_250422 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		String str1 = Integer.toString(num1);
		String str2 = Integer.toString(num2);
		
		int[]etc1 = new int[str1.length()];
		int[]etc2 = new int[str2.length()];
		
		
		for(int i=0; i<str1.length(); i++){
			etc1[i] = str1.charAt(i)-'0';
		}
		
		for(int p=0; p<str2.length(); p++){
			etc2[p] = str2.charAt(p)-'0';
		}
		
		scan.close();	
		
		int f = 0;
		int q = 0;
		for(int z=3-1; z >= 0; z--) {
			f = num1 * etc2[z];
			System.out.println(f);
		}
		
		System.out.println(num1*num2);

	}

}

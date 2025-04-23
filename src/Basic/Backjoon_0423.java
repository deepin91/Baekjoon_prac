package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_0423 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int []nums = new int[3];
		for(int i = 0; i < 3; i++) {
			nums[i] = scan.nextInt();
			
		}
//		System.out.println(Arrays.toString(nums));
		
		int min = nums[0]; //7
		int max = nums[0];
		int mid;
		
		for(int i=1; i<nums.length; i++) { //0 1 2
			if(nums[i] < min) {
				min = nums[i];
			}
			if(max < nums[i]) {
				max = nums[i];
			}	
		}
		System.out.printf("min: %d max: %d", min, max);
		
//		if
		
}
	}

//7 4 5
//3 2 1
//4 8 6
//3 4 7
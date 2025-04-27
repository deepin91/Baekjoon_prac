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
		int mid = nums[0];
		
		for(int i=1; i<nums.length; i++) { //0 1 2
			if(nums[i] < min) {
				min = nums[i];
			}
			if(max < nums[i]) {
				max = nums[i];
			}
		}
			for(int n = 0; n < nums.length; n++) {
			if (nums[n]!= min && nums[n]!= max) {
				mid = nums[n];
			}
		}
			scan.close();
//	System.out.printf("min: %d max: %d mid: %d", min, max, mid);
			
		if(min+mid <= max) {
			System.out.println("Invalid");
		} else {
			if(min == mid && mid == max) {
			System.out.println("Equilateral");
		} else if(min == mid || mid == max) {
			System.out.println("Isosceles");
		} else if(min != mid && mid != max) {
			System.out.println("Scalene");
//		} else if(nums[0] == 0 && nums[1]==0 && nums[2] == 0) {
//			System.out.println("");
	}
		}
//		for(int y=0; y<nums.length;y++) {
//			if(nums[y]==0) {
//				
//			}
//		}
	}
	
}

//7 4 5
//3 2 1
//4 8 6
//3 4 7
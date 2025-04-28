package Basic;

import java.util.Arrays;

import java.util.Scanner;

public class Backjoon_0423 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int[] nums = new int[3];
			for (int i = 0; i < 3; i++) {
				nums[i] = scan.nextInt();
			}
			
			Arrays.sort(nums);

			int min = nums[0]; // 7
			int max = nums[1];
			int mid = nums[2];
			
			if (min == 0 && mid == 0 && max == 0) {
				break;
			}

			if (min + mid <= max) {
				System.out.println("Invalid");
			} else {
				if (min == mid && mid == max) {
					System.out.println("Equilateral");
				} else if (min == mid || mid == max || min == max) {
					System.out.println("Isosceles");
				} else {
					System.out.println("Scalene");

				}

			}
		}
		scan.close();
	}
}
//7 4 5
//3 2 1
//4 8 6
//3 4 7
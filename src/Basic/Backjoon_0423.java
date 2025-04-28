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

// 다른사람 숏코딩 한 거 참고

//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			int[] a = new int[] { sc.nextInt(), sc.nextInt(), sc.nextInt() }; -이런식으로도 사용 가능한 부분 참고.
//			Arrays.sort(a);
//			String s;
//			if (a[2] == 0)
//				break;
//			if (a[0] + a[1] <= a[2])
//				s = "Invalid";
//			else if (a[0] == a[1] && a[1] == a[2])
//				s = "Equilateral";
//			else if (a[0] == a[1] || a[1] == a[2])
//				s = "Isosceles";
//			else
//				s = "Scalene";
//			System.out.println(s);
//		}
//	}
//}
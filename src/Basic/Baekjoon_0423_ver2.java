package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_0423_ver2 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        while (true) {
	            int[] nums = new int[3];
	            for (int i = 0; i < 3; i++) {
	                nums[i] = scan.nextInt();
	            }

	            Arrays.sort(nums);

	            int min = nums[0];
	            int mid = nums[1];
	            int max = nums[2];

	            if (min == 0 && mid == 0 && max == 0) {
	                break;
	            }

	            classifyTriangle(min, mid, max); 
	            // 함수 하나 만들어서 그 안에 조건문 넣어두고 스캐너로 받은 입력값을 매개변수로 넘겨서 조건에 맞는 출력하도록
	        }
	        scan.close();
	    }

	    public static void classifyTriangle(int min, int mid, int max) {
	        if (min + mid <= max) {
	            System.out.println("Invalid");
	        } else if (min == mid && mid == max) {
	            System.out.println("Equilateral");
	        } else if (min == mid || mid == max || min == max) {
	            System.out.println("Isosceles");
	        } else {
	            System.out.println("Scalene");
	        }
	}
}

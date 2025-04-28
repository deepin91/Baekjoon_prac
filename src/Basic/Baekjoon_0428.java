package Basic;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Baekjoon_0428 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		scan.close();
		
		IntSummaryStatistics stat = list.stream().mapToInt(Integer::intValue).summaryStatistics();
		System.out.println("min: " + stat.getMin());
		System.out.println("max: " + stat.getMax());
		System.out.println("avg: " + stat.getAverage());
		}
	}

//		/* 아래같은 방식이 보통쓰이는 방식 위는 약간 혼종...? */

//		Scanner scan = new Scanner(System.in);
//			ArrayList<Integer> list = new ArrayList<>(); // 동적 배열
//
//				while (scan.hasNextInt()) {
//						int num = scan.nextInt();
//							list.add(num); // 입력할 때마다 리스트에 추가
//					}
//
//					int count = list.size(); // 입력한 숫자 개수
//					int min = Integer.MAX_VALUE;
//					int max = Integer.MIN_VALUE;
//
//						for (int num : list) {
//							min = Math.min(min, num);
//							max = Math.max(max, num);
//							}
//
//							System.out.println("입력한 숫자 개수: " + count);
//							System.out.println("최솟값: " + min);
//							System.out.println("최댓값: " + max);
//
//							scan.close();
//						}}
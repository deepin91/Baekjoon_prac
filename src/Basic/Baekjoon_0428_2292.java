package Basic;

import java.util.Scanner;

public class Baekjoon_0428_2292 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int cnt = 1;
		int range = 1;
		
		while(input > range) {
			range += 6*cnt;
//			System.out.println(range);
			cnt++;
		}
		System.out.println(cnt);
	}
}


//다음부턴 BufferedReader 활용해보자..

//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String input = br.readLine(); // 한 줄 통째로 입력받기
//
//        System.out.println(input);
//    }
//}

// Scanner과 차이첨? - 더 빠르고 한줄씩 문자열로 입력,
// 형변환 직접해줘야하지만 빠르게 알고리즘 관련 or 대량으로 입력해서 처리할때 유용

// + .equals()은 리스트형태 같은건 비교 x , 그럴땐 contain() 사용.
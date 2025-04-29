package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_0429_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] arr = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
			if (Character.isLowerCase(arr[i])) {
				arr[i] = Character.toUpperCase(arr[i]);
			}
		}

		int[] c = new int[input.length()];

		for (int a = 0; a < input.length(); a++) {
			int cnt = 0;
			for (int b = 0; b < input.length(); b++) {
				if (arr[a] == arr[b]) {
					cnt++;
					c[a] = cnt;
				}

			}
		}

		int max = 0;
		int mc = 0;
		for (int x = 0; x < c.length; x++) {
			if (c[x] > max) {
				max = c[x];
				mc = x;
			}
		}
	}
}
		
//		int same = 0;
//		for(int v = 0; v < c.length; v++) {
//			if(c[v] == max) {
//				same++;
//			}
//		}
//		if(same >= 2) {
//			System.out.println("?");
//		} else {
//			System.out.println(arr[mc]);
//		}
//	}
//}

//		System.out.println(cnt);

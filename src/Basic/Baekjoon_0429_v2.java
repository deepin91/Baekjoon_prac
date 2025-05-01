package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_0429_v2 {
	public static void main(String[] arg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> alphabetAndCount = new HashMap<>();
		String words = br.readLine();
		int l = words.length();
		char[] alphabet = new char[l];

		for (int i = 0; i < l; i++) {
			words = words.toUpperCase();
			alphabet[i] = words.charAt(i);
		}

		for (int p = 0; p < l; p++) {
			alphabetAndCount.put(alphabet[p], alphabetAndCount.getOrDefault(alphabet[p], 0) + 1);
		}

		int maxCnt = Collections.max(alphabetAndCount.values());
		char maxChr = Collections.max(alphabetAndCount.keySet());

		int maxCnt2 = 0;
		char maxChar = ' ';
		for (Map.Entry<Character, Integer> cnt : alphabetAndCount.entrySet()) {
			if (cnt.getValue() >= maxCnt2) {
				maxCnt2 = cnt.getValue();
				maxChar = cnt.getKey();
			}
		}//위에 뽑아서 안해도될거같긴한데 가 아니네

		if (maxCnt == maxCnt2 && maxChar != maxChr) {
			System.out.println("?");

		} else if (maxCnt != maxCnt2 && maxChar != maxChr) {
			System.out.println(maxChr);
		}
	}

}

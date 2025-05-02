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
		String words = br.readLine().toUpperCase();
		int l = words.length();
		char[] alphabet = new char[l];

		for (int i = 0; i < l; i++) {
//			words = words.toUpperCase();
			alphabet[i] = words.charAt(i);
		}

		for (int p = 0; p < l; p++) {
			alphabetAndCount.put(alphabet[p], alphabetAndCount.getOrDefault(alphabet[p], 0) + 1);
		}

		int maxCnt = Collections.max(alphabetAndCount.values());
//		char maxChr = Collections.max(alphabetAndCount.keySet()); ->알파벳 순서상 가장 뒤에있는 글자를 구하는거임 빈도수에 대한게 아니라

		int maxCnt2 = 0;
		char maxChar = ' ';
		int count = 0;
		for (Map.Entry<Character, Integer> cnt : alphabetAndCount.entrySet()) {
			if (cnt.getValue() == maxCnt) {
				count++;
				if(count == 1) {
					maxChar = cnt.getKey();
				}
//				maxCnt2 = cnt.getValue();
				
			}
		}//위에 뽑아서 안해도될거같긴한데 가 아니네

		if (count > 1) {
			System.out.println("?");

		} else {
			System.out.println(maxChar);
		}
	}

}
// 기존 코드 후반부는 최대등장 문자와 최대 중복횟수만 구함 
// => 중복된 최대 횟수 구함 : maxCnt
// => for Each 문으로 제일 많이 나온 알파벳의 횟수와 maxCnt와 같으면 count++ 해서 +1씩 카운트해줌
// 위의 값이 1이면 해당 key값을 maxChar에 설정
// 즉, count가 1이면  그 문자보다 더 많이 나온 알파벳이 없으므로 해당 문자가 출력
// 1이상일 경우 = 같은 횟수만큼 입력된 알파벳이 있으므로 ? 출력


package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_11282 {
	// 한글 // 아스키코드를 이용해서 풀기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine()); // bufferedReader(무조건 문자열로 저장)를 썼기 때문에 String을 int로 변환

		// 가에 해당하는 코드: 44032
		k += 44031; 

		char C = (char)k;

		System.out.println(C);
	}
}



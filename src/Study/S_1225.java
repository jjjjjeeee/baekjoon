package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1225 {
	// 이상한 곱셈
	// 자바의 정석 210p 참고
	public static void main(String[] args) throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," "); // 곱하기 앞 뒤로 숫자를 나눔
		
		String s1 = st.nextToken(); // 곱하기 앞에 있는 숫자
		String s2 = st.nextToken(); // 곱하기 뒤에 있는 숫자
		int sum = 0; // 더한 값
		
		for(int i=0; i<s1.length(); i++) {
			for(int j=0; j<s2.length(); j++) {
				sum += ((s1.charAt(i)-'0') * (s2.charAt(j)-'0'));
			}
		} System.out.println(sum);
		
	}

}

// 숫자 1 => 49
// 숫자 2 => 50

// String str = "12345";
// str.charAt(0); ===> str의 index가 0번인 것을 가져와서 "1"이됨
// "1"을 int 로 변환하면 아스키코드값인 49가 나옴
// 숫자 1을 얻기 위해서는 아스키코드값이 48인 "0"을 빼줌


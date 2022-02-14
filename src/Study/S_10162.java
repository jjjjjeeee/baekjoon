package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_10162 {
	// 전자레인지
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine()); // 전자레인지 돌리는 시간
		int A=0; // 5분(300초)
		int B=0; // 1분(60초)
		int C=0; // 10초
		
		if(T>=300) {
			A=T/300;
			T -= 300*A; // 
		}
		if(T>=60) {
			B=T/60;
			T -= 60*B;
		}
		if(T%10==0) {
			C=T/10;
			T =+ 10*C;
			System.out.println(A+B+C);
		}else {
			System.out.println(-1);
		}
	}

}

package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_10162 {
	// ���ڷ�����
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine()); // ���ڷ����� ������ �ð�
		int A=0; // 5��(300��)
		int B=0; // 1��(60��)
		int C=0; // 10��
		
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

package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_14914 {
	// 사과와 바나나 나눠주기
	// 유클리드 호제법 : 최대공약수와 최소공배수를 구할 수 있는 알고리즘
	// 안됨;;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int min = (a<b)?a:b;
		int gcd = 0; // 최대공약수
		
//		for(int i=1; i<=min; i++) {
//			if(a%i==0 && b%i==0) {
//				gcd = i;
//			}
//		}
//		System.out.println(gcd+" "+a+" "+b);
		// System.out.println("최대공약수 : "+gcd);
		// System.out.println("최소공배수 : "+(a*b)/gcd);

		for(int i=1; i<=gcd; i++) {
			if(gcd%i==0)
				System.out.println(i+ (a/i)+ (b/i));
		}
		System.out.println(gcd+ (a/gcd)+ (b/gcd));
	}

}

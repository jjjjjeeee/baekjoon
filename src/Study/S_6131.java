package Study;

import java.util.Scanner;

public class S_6131 {
	// 완전 제곱수 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		for(int i=1; i<=500; i++) {
			double A = Math.pow(i, 2); // A = i^2 
			for(int j=1; j<=500; j++) {
				double B = Math.pow(j, 2); // B = j^2
				if(A==B+N) cnt++;
			}
		}
		System.out.println(cnt);
	}
}

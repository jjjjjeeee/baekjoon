package Study;

import java.util.Scanner;

public class S_11943 {
	// 파일옮기기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int D = s.nextInt();
		
//		2가지 경우의 수가 존재
//		1. A그룹의 사과옮기기+B그룹의 오렌지옮기기 (A+D)
//		2. A그룹의 오렌지옮기기+B그룹의 사과옮기기 (B+C)

		System.out.println(Math.min(A+D,B+C));
	}

}

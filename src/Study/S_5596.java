package Study;

import java.util.Scanner;

public class S_5596 {
	// 시험 점수
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int S = 0; // 민국이 점수의 총합
		int T = 0; // 만세 점수의 총합
	
		System.out.println("민국이 점수를 입력하세요.");

		for(int i=0; i<4; i++) {
			int score1 = s.nextInt();
			S += score1;
		}

		System.out.println("만세 점수를 입력하세요.");
		for(int i=0; i<4; i++) {
			int score2 = s.nextInt();
			T += score2;
		}
		if (S>=T) {
			System.out.println(S);
		} else {
			System.out.println(T);
		}
		

	}
}

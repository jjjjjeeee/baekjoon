package Study;

import java.util.Scanner;

public class S_5596 {
	// ���� ����
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int S = 0; // �α��� ������ ����
		int T = 0; // ���� ������ ����
	
		System.out.println("�α��� ������ �Է��ϼ���.");

		for(int i=0; i<4; i++) {
			int score1 = s.nextInt();
			S += score1;
		}

		System.out.println("���� ������ �Է��ϼ���.");
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

package Study;

import java.util.Scanner;

public class S_17496 {
	// ��Ÿ�ĸ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // �����ϼ�
		int T = sc.nextInt(); // �ڶ�� �� �ɸ��� �ϼ�
		int C = sc.nextInt(); // ���� �� �ִ� ĭ�� ��
		int P = sc.nextInt(); // ���� ����
		
		int a = N/T; // ��Ÿ�ĸ��� �ɱⰡ ������ ��
		
//		1, 11, 21, 31, 41 �Ͽ� ��Ÿ�ĸ��� ������ ������ �˴ϴ�. 
//		51�Ͽ� ������ 61�Ͽ� ��Ȯ�� �����ѵ� ������ 60�ϱ��� �̹Ƿ� 61�Ͽ��� ��Ȯ�� �� �����ϴ�. ���� �� 5 * 300 = 1500���� ��Ÿ�ĸ����� ��Ȯ�� �� �ֽ��ϴ�.
		if(N%T==0) a -= 1; // ���� �����ϼ��� �ڶ�� �� �ɸ��� �ϼ��� ���ٸ� �Ϸ縦 ����

		System.out.println(a*C*P);
	}
}


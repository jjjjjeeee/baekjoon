package Study;

import java.util.Scanner;

public class S_11943 {
	// ���Ͽű��
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int D = s.nextInt();
		
//		2���� ����� ���� ����
//		1. A�׷��� ����ű��+B�׷��� �������ű�� (A+D)
//		2. A�׷��� �������ű��+B�׷��� ����ű�� (B+C)

		System.out.println(Math.min(A+D,B+C));
	}

}

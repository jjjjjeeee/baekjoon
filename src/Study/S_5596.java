package Study;

import java.util.Scanner;

public class S_5596 {
	// ���� ����
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���.");
		
		int a = Integer.parseInt(s.nextLine());
		int b = Integer.parseInt(s.nextLine());
		
		
		int res1[] = new int[a];
		int res2[] = new int[b];
		 // �α��� �������� ���� �迭
		 // ���� �������� ���� �迭
		
		int sum=0;
		for(int i=0; i<res1.length ;i++) {
			int S = s.nextInt();
			sum += res1[i];
			
			
		} System.out.printf("�α��� ������ ����: %d",sum);
		
		
	}

}

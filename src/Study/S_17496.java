package Study;

import java.util.Scanner;

public class S_17496 {
	// ��Ÿ�ĸ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = 0;
		int star[] = new int[no];
		int sum = 0;
		
		
		for(int i=0; i<star.length; i++) {
			System.out.println("���ڸ� �Է��ϼ�");
			no = sc.nextInt();
			star[i] = no;	
		}
		for(int i=0; i<star.length; i++) {
			sum += star[i];
		}
		System.out.println("��: "+sum);
	}
}


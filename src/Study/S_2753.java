package Study;

import java.util.Scanner;

public class S_2753 {
	// ����
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		��� 1) if��
//		int y = s.nextInt();
//		
//		if(y%4==0 && !(y%100==0) || y%400==0) {
//			if (y>=1 && y<=4000) {
//				System.out.println("1");
//			} else {
//				System.out.println("���ڸ� �ٽ� �Է��ϼ���");
//			} 
//		} else {System.out.println("0");
//		
//		}
		
//		��� 2) ���׿�����
		int y = s.nextInt();
		
		int result = (y%4==0 && !(y%100==0) || y%400==0)? 1:0;
		System.out.println(result);
	}

}

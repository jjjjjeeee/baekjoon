package Study;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class S_11866 {
	// �似Ǫ�� ����

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int n= scan.nextInt();
			int k = scan.nextInt();
			Queue<Integer> q = new LinkedList<>(); 
			
			for(int i=0;i<n;i++) {
				q.add(i+1);
			}
			
			System.out.print("<");
			while (q.size()>0){
	        	// �� �տ��ִ� ���ڸ� poll�� �� ť�� ���� �߰��Ͽ� ť�� ������ ����
				for(int i=0;i<k-1;i++) {
					q.add(q.poll());
				}
				System.out.print(q.poll());
				if (q.size()>0) {
					System.out.print(", ");
				}
			}
			System.out.print(">");
		}

	}



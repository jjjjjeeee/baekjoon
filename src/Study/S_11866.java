package Study;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class S_11866 {
	// 요세푸스 문제

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
	        	// 맨 앞에있던 숫자를 poll한 후 큐에 새로 추가하여 큐의 시작을 변경
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



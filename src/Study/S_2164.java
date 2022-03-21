package Study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S_2164 {
	// 카드2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 카드 개수
		
		Queue<Integer> que = new LinkedList<Integer>();
			for(int i=0; i<=N; i++) {
				que.offer(i); // que에 전체 카드 집어넣기 
			}
		
			while(que.size()>1) { // que에 남아있는 카드가 1개 이상이면
				 que.poll();	// 제일 먼저 넣은 데이터 꺼냄
				 int num = que.poll(); 
				 que.offer(num); // 꺼낸 데이터 que에 넣기 
			}
			System.out.println(que.poll());
			
	}
}

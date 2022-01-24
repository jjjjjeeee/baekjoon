package Study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S_11866_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int k = s.nextInt();
		
		Queue<Integer> q = new LinkedList<Integer>();
		StringBuilder res = new StringBuilder();
		
		for(int i=1; i<=n; i++) {
			q.offer(i);
		}
		
		res.append("<");
		
		for(int i=0; i<n-1; i++) {
			for(int m=0; m<k-1; m++) {
				q.offer(q.poll());
			}
			res.append(q.poll()+",");
		}
		res.append(q.poll()+">");
		System.out.println(res);
	}

}

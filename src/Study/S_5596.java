package Study;

import java.util.Scanner;

public class S_5596 {
	// 시험 점수
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요.");
		
		int a = Integer.parseInt(s.nextLine());
		int b = Integer.parseInt(s.nextLine());
		
		
		int res1[] = new int[a];
		int res2[] = new int[b];
		 // 민국이 시험점수 담을 배열
		 // 만세 시험점수 담을 배열
		
		int sum=0;
		for(int i=0; i<res1.length ;i++) {
			int S = s.nextInt();
			sum += res1[i];
			
			
		} System.out.printf("민국이 점수의 합은: %d",sum);
		
		
	}

}

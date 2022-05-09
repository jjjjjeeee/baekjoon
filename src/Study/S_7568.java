package Study;

import java.util.Scanner;

public class S_7568 {
	// 덩치
	// 자바의 정석 214p 참고
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 전체 사람의 수
		int[][] arr = new int[N][2]; // 몸무게와 키를 담은 2차원 배열 (N행 2열)
		
		
		for(int i=0; i<=N; i++) {
			arr[i][0] = sc.nextInt(); // 몸무게
			arr[i][1] = sc.nextInt(); // 키
		}
		
		for(int i=0; i<N; i++) {
			int rank = 1;
			for(int j=0; j<N; j++) {
				if(i==j) continue;
				else if(
						arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]
						) rank++;
			}
			System.out.println(rank);
		} 
	}

}

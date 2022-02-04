package Study;

import java.util.Scanner;

public class S_17496 {
	// 스타후르츠
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 여름일수
		int T = sc.nextInt(); // 자라는 데 걸리는 일수
		int C = sc.nextInt(); // 심을 수 있는 칸의 수
		int P = sc.nextInt(); // 개당 가격
		
		int a = N/T; // 스타후르츠 심기가 가능한 날
		
//		1, 11, 21, 31, 41 일에 스타후르츠 씨앗을 심으면 됩니다. 
//		51일에 심으면 61일에 수확이 가능한데 여름은 60일까지 이므로 61일에는 수확할 수 없습니다. 따라서 총 5 * 300 = 1500개의 스타후르츠를 수확할 수 있습니다.
		if(N%T==0) a -= 1; // 만약 여름일수와 자라는 데 걸리는 일수가 같다면 하루를 빼줌

		System.out.println(a*C*P);
	}
}


package Study;

import java.util.Scanner;

public class S_10797 {
	// 	10부제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 0; // 차량개수
		int num = sc.nextInt(); // 차량번호

		for(int i=1; i<=5; i++) {		

			int car = sc.nextInt();
			if(num==car) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}

package Study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S_1333 {
	// 부재중전화
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.next());
		
		int N = Integer.parseInt(st.nextToken()); // 총 곡의 수
		int L = Integer.parseInt(st.nextToken()); // 노래의 길이
		int D = Integer.parseInt(st.nextToken()); // D초마다 1초씩 전화벨이 울림
		
		// 이론 참고: https://blog.naver.com/aaammm7777/221963931450
		*/
		Scanner sc = new Scanner(System.in);
//		sc = new Scanner(src);
		int Nsong = sc.nextInt();
		int Lsecond = sc.nextInt();
		int Dbell = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<Nsong; i++) {
			for(int j=0; j<Lsecond; j++) {
				list.add(1);
			}
			for(int j=0; j<5; j++) {
				list.add(0);
			}
		}
		int time = 0;
		while(true) {
			if(time>= list.size()) {
				break;
			}
			if(list.get(time)==0)
				break;
			else {
				time += Dbell;
			}
		}
		System.out.println(time);
	}

}

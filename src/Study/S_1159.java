package Study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S_1159 {
	// 농구경기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lst = new ArrayList<String>(); // 선수들의 이름을 담을 배열생성
		
		int N = sc.nextInt(); // 선수의 수
		
		for(int i=0; i<N; i++) {
			String name = sc.next(); // 선수의 이름
			lst.add(name.substring(0,1)); // 선수이름 중 앞 1글자만 lst에 담기
			//System.out.println(lst);
			
		}
		for(int i=0; i<lst.size(); i++) {
			int player = Collections.frequency(lst, lst.get(i)); // lst.get(i)의 빈도수를 구해줌
			if(player<=5) {
				System.out.println("PREDAJA");
			}else {
				System.out.println(lst.get(i));
			}
		}
	}

}

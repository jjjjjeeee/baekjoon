package Study;

import java.util.Scanner;

public class S_22864 {
	// 피로도
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 피로도+
		int B = sc.nextInt(); // 일처리+
		int C = sc.nextInt(); // 피로도-
		int M = sc.nextInt(); // 피로도 임계치
		int work=0; 
		int fatigue=0;
		
		for(int i=0; i<24; i++) {
			if(fatigue+A>M) { // A만큼 피로도 쌓이지만 M을 넘기지는 않음
				fatigue = fatigue-C; // C만큼 감소한 피로도
				fatigue = Math.max(fatigue, 0);
			}else {
				fatigue = fatigue+A; // A만큼 증가한 피로도
				work = work+B; // B만큼 처리한 일의 양
			}
		}System.out.println(work);
	}

}

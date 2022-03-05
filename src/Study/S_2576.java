package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S_2576 {
	// 홀수
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0; 	// 홀수의 합
		int min = 100;  // 최솟값
		
		List<Integer> lst = new ArrayList<Integer>(); // 홀수담을 list
		
		for(int i=1; i<8; i++) {			
			int n = Integer.parseInt(br.readLine());	
			
			if(n%2==1) {
				lst.add(n);
				sum += n;
				
				if(min>=n) {
					min = n; 
				}
			}

		}		
		if(sum==0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		
	}

}

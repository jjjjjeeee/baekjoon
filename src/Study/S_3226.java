package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_3226 {
	// 전화요금
	// 왜 안되냐고..
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int callNum = Integer.parseInt(br.readLine());
		
		for(int i=0; i<callNum; i++) {
			System.out.println(i);
			String call = br.readLine();
			String a[] = call.split(" |:"); // 입력받은 전화정보를 배열 a에 공백으로 나눠서 담음

			int HH = Integer.parseInt(a[0]); 
			int DD = Integer.parseInt(a[1]); 
			int MM = Integer.parseInt(a[2]); 
			int price = 0; // 전화요금
			
			if (HH>=7 && HH<=19) {
				price = MM*10;
			}
			if(HH>=23 && HH<7) {
				price = MM*5;
			}	
			
			System.out.println(price);			
		}	
	}
}

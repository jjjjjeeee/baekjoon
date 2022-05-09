package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_6378 {
	// 디지털루트
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		String N = br.readLine();
		
		String[] lst;
			
		lst = N.split("");
		String sum = "";
		for(int i=0; i<lst.length; i++) {
			
			System.out.println(lst[i]);
			sum = sum+lst[i];
		}
		
	}

}

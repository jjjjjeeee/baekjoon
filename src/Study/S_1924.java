package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1924 {
	// 2007년
	public static void main(String[] args) throws IOException{
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		int total = 0;
		for(int i=0; i<m-1; i++) {
			total = month[i]+d;
		}
		System.out.println(day[total%7]);
	}

}

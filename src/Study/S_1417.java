package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S_1417 {
	// 국회의원 선거
	// 안됨..
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 후보의 수
		int da = Integer.parseInt(br.readLine()); // 다솜이 투표수
		
		int arr[] = new int[N-1]; // 후보 투표수
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int person = 0; // 매수하는 사람수
		
		Arrays.sort(arr);
		int high = arr.length-1; // 가장 투표많은 사람
		if(high>da) {
			high--; // 많은 투표받은 사람-1
			da++; // 다솜이+1
			person++; // 매수해야하는 사람+1
		}
		System.out.println(person);
	}

}

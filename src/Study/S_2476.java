package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2476 {
	// 주사위게임
	public static void main(String[] args) throws IOException, NumberFormatException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int answer=0;
		
		for(int i=0; i<N; i++) {
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int tot=0; 
			if(a==b && b==c)  {
				tot = 10000*a*1000; 
			} else if(a==b || a==c){
				tot = 1000*a*100;
			} else if(b==c) {
				tot = 1000*b*100;
			} else {
				int max = Math.max(a, Math.max(b, c));
				tot = max*100;
			}
			answer = (answer<tot)?tot:answer;
		}System.out.println(answer);
	}
 
}
// 안됨ㅠㅠ
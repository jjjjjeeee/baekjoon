package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2442 {
	// º°Âï±â
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=a; i++) {
			for(int j=i; j<a; j++) {
				// °ø¹é
				System.out.print(" ");
			}
			for(int n=0; n<2*i-1; n++) {
				// º°Âï±â
				System.out.print("*");
			}System.out.println();
		}
	}

}

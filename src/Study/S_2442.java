package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2442 {
	// �����
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=a; i++) {
			for(int j=i; j<a; j++) {
				// ����
				System.out.print(" ");
			}
			for(int n=0; n<2*i-1; n++) {
				// �����
				System.out.print("*");
			}System.out.println();
		}
	}

}

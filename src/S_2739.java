import java.util.Scanner;

public class S_2739 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int gu = s.nextInt();
		
		for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n",gu,i,gu*i);
			}
		}
	}


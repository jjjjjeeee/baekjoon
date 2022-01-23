import java.util.Scanner;

public class If_2884 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("시간을 입력하세요");
		int h = s.nextInt();
		int m = s.nextInt();
		
		if (h<=23) {
			if (m<45) {System.out.println(h+":"+(m-45));}
			else {System.out.println((h-1)+":"+(m-45));}
		} else {
			System.out.println(h+"+"+m);
		}
	}

}

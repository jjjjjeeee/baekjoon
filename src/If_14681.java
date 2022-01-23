import java.util.Scanner;

public class If_14681 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("좌표를 입력하시오");

		int a = s.nextInt();
		int b = s.nextInt();
		
		s.close();

		if (a>0) {
			if (b>0) {
				System.out.println(1);
				}
			else {
				System.out.println(4);
			}
		} else {
			if (b>0) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
	}
}

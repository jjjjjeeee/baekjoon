package Study;

import java.util.Scanner;

public class S_2720 {
	// 세탁소 사장 동혁
	// 참고: https://new93helloworld.tistory.com/265 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int T = sc.nextInt();
	     while(T!=0){
	            int cost = sc.nextInt();
	 
	            int a = (int)cost/25;
	            int b = (int)(cost-a*25)/10;
	            int c = (int)(cost-a*25-b*10)/5;
	            int d = cost-a*25-b*10-c*5;
	            System.out.println(a+ " "+b+ " "+c+ " "+d);                                                  
	            T--;
	        }
	    }
	
	}



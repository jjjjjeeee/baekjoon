package Study;

import java.util.LinkedList;
import java.util.Scanner;

public class S_2605 {
	// 줄 세우기
	
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int stu = Integer.parseInt(br.readLine()); // 학생의 수
//		
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		ArrayList<Integer> list = new ArrayList<Integer>(); 
//		
//		for(Integer i : list) {
//			int num = Integer.parseInt(st.nextToken()); // 학생들이 뽑은 번호
//			list.add(i-num, i); // list.add(a,b) => index a에 b삽입
//		}
//		for(int i=0; i<=stu; i++) {
//			System.out.println(list.get(i)+" ");
//		}
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			LinkedList<Integer> student = new LinkedList<>();
			int n=sc.nextInt();
			
			for(int i=0;i<n;i++) {
			int loc=sc.nextInt();
			student.add(loc, i+1);
			}
			
			for(int i=0;i<n;i++)
			System.out.print(student.pollLast()+" ");

			// 출처: https://hunucho.tistory.com/entry/Baekjoon-2605-줄-세우기-JAVA [훈발자]
	}

}

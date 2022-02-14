package Study;

import java.util.Arrays;
import java.util.Scanner;

public class S_2752 {
	// 세수정렬
//	
//	static void swap(int[] a, int idx1, int idx2) {
//		int t = a[idx1];
//		a[idx1] = a[idx2];
//		a[idx2] = t;
//	}
//	
//	static void bubbleSort(int[] a, int n) {
//		for(int i=0; i<n-1; i++) {
//			for(int j=n-1; j>i; j--) {
//				if(a[j-1]>a[j]) {
//					swap(a,j-1,j);
//				}
//			}
//		}
//	}
//	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		
//		System.out.print("숫자를 3개 입력하세요.");
//		
//		int nx = s.nextInt();
//		int[] x = new int[nx];
//		
//		for(int i=0;i<nx;i++) {
//			x[i] = s.nextInt();
//		}
//		
//		bubbleSort(x,nx);
//		
//		for(int i=0; i<nx; i++) {
//			System.out.println("오름차순 정렬 결과 =>"+x[i]);
//		}
		Scanner sc = new Scanner(System.in); 
		int[] num = new int[3]; 
		
		for(int i=0; i<3; i++) 
			num[i] = sc.nextInt(); 
		Arrays.sort(num); 
		
		for (int i : num) System.out.print(i+" ");  

		// 백준 넣었을때 컴파일 에러남ㅠㅠ
	}

}

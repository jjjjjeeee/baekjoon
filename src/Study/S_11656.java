package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S_11656 {
	// 접미사 배열
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 방법1
		// StringBuffer sb = new StringBuffer(); // 방법2
		
		// 방법1
		String S = br.readLine();
		String[] word= new String[S.length()]; // 나눠진 단어들을 담을 배열
		
		for(int i=0; i<S.length(); i++) {
			word[i] = S.substring(i,S.length());
		}
		Arrays.sort(word);
		
		for(int i=0; i<word.length; i++) {
			System.out.println(word[i]);
		}
		
//		방법2
//		for(String w : word){
//			sb.append(w);
//			sb.append("\n");
//		} System.out.println(sb);
	}

}

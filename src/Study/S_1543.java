package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S_1543 {
	// 문서 검색
	// 다시 풀어봐야 함
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
		
		List<String> list = new ArrayList<String>();		
		
		String sentence = br.readLine();
		String word = br.readLine();
		
		int cnt=0;
		int i=0;
		
		while(i<sentence.length()) {
			if(sentence.contains(word)) {
				list.add(word);				
			}break;

		}
		System.out.println("문자가 포함되어 있습니다.");
		System.out.println(list.size());
		
	}

}

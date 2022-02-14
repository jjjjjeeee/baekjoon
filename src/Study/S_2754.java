package Study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S_2754 {
	// 학점계산
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		// key와 value값으로 묶여져있는 hashmap사용
		Map<String,Double> map = new HashMap();
		map.put("A+", 4.3);
		map.put("A0", 4.0);
		map.put("A-", 3.7);
		map.put("B+", 3.3);
		map.put("B0", 3.0);
		map.put("B-", 2.7);
		map.put("C+", 2.3);
		map.put("C0", 2.0);
		map.put("C-", 1.7);
		map.put("D+", 1.3);
		map.put("D0", 1.0);
		map.put("D-", 0.7);
		map.put("F", 0.0);
		
		//System.out.println(map.get("A0"));
		
		String score = sc.nextLine();
		if(map.containsKey(score)) // 입력한 학점이 key에 있으면
			System.out.println(map.get(score)); // 해당 key value에 해당하는 값 반환
	}
}

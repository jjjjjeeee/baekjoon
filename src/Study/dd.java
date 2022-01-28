System.out.print("학생수 : ");
		int a = sc.nextInt();
		
		int[] S = new int[a];
		
		for(int i = 0; i < a; i++) {
			System.out.print("학생" + (i + 1) + "의 점수 : ");
			S[i] = sc.nextInt();
			if(S[i] > 100 || S[i] < 0) { // 점수가 0미만이거나 100초과인 경우
				System.out.println("잘못된 점수 입니다. 다시 입력해 주세요.");
				i--;
				continue;
			}
		}
		
		for(int i = 0; i < a; i++) {
			total += S[i];
		}
		System.out.println("학생 " + stNum + "명의 총합은 " + total +  "점 입니다.");
		System.out.println("학생 " + stNum + "명의 평군은 " +Math.round(total / stNum * 100) / 100f +  "점 입니다.");package Study;

public class dd {

}

System.out.print("�л��� : ");
		int a = sc.nextInt();
		
		int[] S = new int[a];
		
		for(int i = 0; i < a; i++) {
			System.out.print("�л�" + (i + 1) + "�� ���� : ");
			S[i] = sc.nextInt();
			if(S[i] > 100 || S[i] < 0) { // ������ 0�̸��̰ų� 100�ʰ��� ���
				System.out.println("�߸��� ���� �Դϴ�. �ٽ� �Է��� �ּ���.");
				i--;
				continue;
			}
		}
		
		for(int i = 0; i < a; i++) {
			total += S[i];
		}
		System.out.println("�л� " + stNum + "���� ������ " + total +  "�� �Դϴ�.");
		System.out.println("�л� " + stNum + "���� ���� " +Math.round(total / stNum * 100) / 100f +  "�� �Դϴ�.");package Study;

public class dd {

}

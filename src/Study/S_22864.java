package Study;

import java.util.Scanner;

public class S_22864 {
	// �Ƿε�
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // �Ƿε�+
		int B = sc.nextInt(); // ��ó��+
		int C = sc.nextInt(); // �Ƿε�-
		int M = sc.nextInt(); // �Ƿε� �Ӱ�ġ
		int work=0; 
		int fatigue=0;
		
		for(int i=0; i<24; i++) {
			if(fatigue+A>M) { // A��ŭ �Ƿε� �������� M�� �ѱ����� ����
				fatigue = fatigue-C; // C��ŭ ������ �Ƿε�
				fatigue = Math.max(fatigue, 0);
			}else {
				fatigue = fatigue+A; // A��ŭ ������ �Ƿε�
				work = work+B; // B��ŭ ó���� ���� ��
			}
		}System.out.println(work);
	}

}

package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_11282 {
	// �ѱ� // �ƽ�Ű�ڵ带 �̿��ؼ� Ǯ��
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine()); // bufferedReader(������ ���ڿ��� ����)�� ��� ������ String�� int�� ��ȯ

		// ���� �ش��ϴ� �ڵ�: 44032
		k += 44031; 

		char C = (char)k;

		System.out.println(C);
	}
}



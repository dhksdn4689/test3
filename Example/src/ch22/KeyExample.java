package ch22;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ű���� �ָ� �������� ��ȯ�ϴ� �޼ҵ�
		HashMap<Key,String> hashmap= new HashMap<Key,String>();
		
		//�ĺ�Ű "new Key(1)"�� "ȫ�浿"�� ����
		
		hashmap.put(new Key(1),"ȫ�浿" );
		//�ĺ���; new Key �� ȫ�浿 �� ������
		String str1 = hashmap.get(new Key(1));
		System.out.println(str1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

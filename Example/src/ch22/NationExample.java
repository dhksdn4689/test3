package ch22;

import java.util.HashMap;
import java.util.Scanner;

public class NationExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>();

		while (true) {
			
			System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)");
			String nara = sc.next();
			if (nara.equals("�׸�")) {
				break;
			}
			int pop=sc.nextInt();
			nations.put(nara,pop);

			Integer ingu = nations.get(nara);
			

			
		}
		
		
		while(true) {
			System.out.println("�α� �˻��� ������� �Է��ϼ��� >>");
			//�Է¹ް�
			String na=sc.next();
			if(na.equals("�׸�")) {
				break;
			}
			Integer n= nations.get(na);
			if(n==null) {
				System.out.println(na + "����� ����");
			}
			else {
				System.out.println(na + "�� �α���"+n);
			}
	
			//�׸� �̶�� ���ڰ����� �극��ũ
			
			Integer aaa = nations.get(na);
			//nations.get�� �α������ؼ� ����
			if(na.equals(nations)) {
				System.out.println(aaa);
			}
			
			
			
			
			
			
			
			
		}

	}

}


package ch22;

import java.lang.reflect.Member;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member1 obj1 = new Member1("blue");
		Member1 obj2 = new Member1("blue");
		Member1 obj3 = new Member1("red");
		
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�");
			
		}
		else {
			System.out.println("obj1�� obj2�� �ٸ��ϴ�");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�");
			
		}
		else {
			System.out.println("obj1�� obj3�� �ٸ��ϴ�");
		}
		
		
		
		
		
		
	}

}
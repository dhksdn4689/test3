
package ch22;

import java.lang.reflect.Member;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member1 obj1 = new Member1("blue");
		Member1 obj2 = new Member1("blue");
		Member1 obj3 = new Member1("red");
		
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동일합니다");
			
		}
		else {
			System.out.println("obj1과 obj2는 다릅니다");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동일합니다");
			
		}
		else {
			System.out.println("obj1과 obj3는 다릅니다");
		}
		
		
		
		
		
		
	}

}
package ch22;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//키값을 주면 벨류값을 반환하는 메소드
		HashMap<Key,String> hashmap= new HashMap<Key,String>();
		
		//식별키 "new Key(1)"로 "홍길동"을 저장
		
		hashmap.put(new Key(1),"홍길동" );
		//식별ㅋ; new Key 로 홍길동 을 저장함
		String str1 = hashmap.get(new Key(1));
		System.out.println(str1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

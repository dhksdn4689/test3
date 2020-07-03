package ch22;

import java.util.HashMap;
import java.util.Scanner;

public class NationExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>();

		while (true) {
			
			System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
			String nara = sc.next();
			if (nara.equals("그만")) {
				break;
			}
			int pop=sc.nextInt();
			nations.put(nara,pop);

			Integer ingu = nations.get(nara);
			

			
		}
		
		
		while(true) {
			System.out.println("인구 검색할 나라명을 입력하세요 >>");
			//입력받고
			String na=sc.next();
			if(na.equals("그만")) {
				break;
			}
			Integer n= nations.get(na);
			if(n==null) {
				System.out.println(na + "나라는 없음");
			}
			else {
				System.out.println(na + "의 인구는"+n);
			}
	
			//그만 이라는 문자가오면 브레이크
			
			Integer aaa = nations.get(na);
			//nations.get로 인구추출해서 저장
			if(na.equals(nations)) {
				System.out.println(aaa);
			}
			
			
			
			
			
			
			
			
		}

	}

}

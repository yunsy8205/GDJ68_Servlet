package com.iu.main.api.util.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ListMain {

	public static void main(String[] args) {
		// ArrayList
		// 배열처럼 몇개를 넣을지 미리 지정하지 않아도됨
		// 배열기반 : 인덱스 번호로 접근
		ArrayList ar = new ArrayList();
		//autoboxing
		ar.add(1); //Integer타입으로 변환
		ar.add(3.1); //Double타입으로 변환
		ar.add("test");
//		ar.add(1,"add");
//		// 1번 인덱스에 넣어라!(원래 값을 다음 인덱스로 미루고 끼워넣음)
//		ar.set(0, "first");// 바꿈
//		ar.remove(0);// 특정 인덱스번호에 있는 값 삭제
//		ar.remove("test");
		//ar.clear(); // 데이터 모두 삭제
		// 타입을 섞어 넣을 수 있다.
		// 모든 타입을 넣을 수 있다.
		// 끼워넣을 때 배열과 같은 원리로 이루어지기 때문에 느리다.
		// ArrayList를 많이 씀
		
		for(int i=0;i<ar.size();i++) { //size는 length와 같은 의미
			System.out.println(ar.get(i));
		}
		
		int num = (Integer)ar.get(0);
		//Object를 integer로 바꿔줌 : 다형성, 오토언박싱
		String test = (String)ar.get(2);
		//ArrayList에는 타입이 무엇인지 알수가 없다.
		//타입의 안전성이 떨어진다.
		
//		HashSet hs = new HashSet();
//		hs.add(1);
//		hs.add(2); //중복 데이터 허용 안함
//		hs.add("f1");
//		hs.size();
//		System.out.println(hs);
//		System.out.println(hs.size());
//		
		//LinkedList
		//- 배열처럼 순서대로 들어가는 게 아니라 데이터를 넣고 다음순서의 주소를 그 뒤에 저장 : 빠름
//		
//		LinkedList ar2 = new LinkedList();
//		ar2.add("1");
//		ar2.remove(0);
//		ar2.clear();
//		ar2.get(0);
//		ListStudy listStudy = new ListStudy();
//		listStudy.ex1();
	}
}

package com.iu.main.api.lang;

public class LangMain {

	public static void main(String[] args) {
		Object obj = new Test();
		obj = new ChildTest();
		
		obj = new Object(); // Object는 모든 클래스의 최상위 클래스다.
		Object obj2 = new Object();
		
		System.out.println(obj==obj2);
		System.out.println(obj.equals(obj2));
		Test test = new Test();
		
		//참조변수를 출력하면
		//내부에서 toString 호출
		System.out.println(obj);
		System.out.println(obj.toString());
		
		System.out.println(test.toString());
		System.out.println(test);

	}

}

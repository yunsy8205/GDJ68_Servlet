package com.iu.main.api.lang.wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		// Wrapper 감싼다. 
		System.out.println(Integer.SIZE);//bit
		System.out.println(Integer.BYTES);//byte 담은 변수
		
		int num=10;
		Integer num2=new Integer(num);
		
		num = num2.intValue();//num2를 int타입으로 바꿈
		
		num2 = new Integer("32");
		num = num2.intValue();//32라는 문자열이 32라는 숫자로 변경
		
		//AutoBoxing
		num2 = num; //자동으로 가능하게 만듬
		//AutoUnBoxings
		num = num2;
		
		Long l1= 10L; //AutoBoxing
		//l1 = num; // 같은 타입만 오토박싱할 수 있다.
		l1 = (long)num;
		long l2 = num; // 자동형변환
		
		String n = "20";// 문자열을 프리미티브 타입으로 바꿀 수 있다.
		num = Integer.valueOf(n);
		num = Integer.parseInt(n);// 바로 프리미티브 타입으로 바꿔줘서 자주 씀!
		System.out.println(num*3);
		
		WrapperStudy wrapperStudy = new WrapperStudy();
		wrapperStudy.ex2();
	}

}

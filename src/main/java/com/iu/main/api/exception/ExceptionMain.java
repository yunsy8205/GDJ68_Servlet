package com.iu.main.api.exception;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		ExceptionStudy es = new ExceptionStudy();
//		es.s1();
//		
//		try {
//			es.s2();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		try {
			es.s3();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}

}

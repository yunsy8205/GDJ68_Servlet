package com.iu.main.api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionStudy {
	
	public void s3() throws MyException {
		//유치원 입학전 3-4
		int num1 = 65;
		int num2 = 57;
		
		int result = num1+num2;
		if(result>99){
			throw new MyException();//강제로 예외객체를 만들어서 던짐
		}
		result = num2-num1;
		if(result<0) {
			throw new MyException("그런거 몰라요");
		}
	}
	
	public void s2() throws Exception{
		int num = 10;
		int num2 = 0;
		System.out.println(num/num2);
	}
	
	public void s1() {
		Scanner sc = new Scanner(System.in);
		int num = 26;
		int result =0;
		System.out.println("숫자를 입력");
		try {
		int num2 = sc.nextInt();
		 //throw new InputMismatchException();
		 //해당 예외의 객체를 만들어서 던짐
		
		result = num/num2;
		 //throw new ArithmeticException();
		}catch(Exception e) {//어떤 예외타입인지 모를때
			e.printStackTrace();
		}
		
		System.out.println("Result : "+result);
	}

}

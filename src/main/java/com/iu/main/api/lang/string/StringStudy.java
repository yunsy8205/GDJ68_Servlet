package com.iu.main.api.lang.string;

import java.util.Scanner;

public class StringStudy {
	
	private Scanner sc;
	
	public StringStudy() {
		sc = new Scanner(System.in);
	}
	
	public void s1() {
		//문자열
		//length()
		//indexOf()
		//lastIndextOf()
		String str = "Hello World";
		for(int i=0;i<str.length();i++) {//length라는 메서드
			System.out.println(str.charAt(i));
		}
		
		int ch=str.indexOf('Z');
		//int ch(char) : 입력한 숫자나 문자가 몇번 인덱스에 있는지 없으면 -값이 나온다.
		System.out.println("Ch : "+ch);
		ch = str.indexOf("H", 4);
		System.out.println("Ch : "+ch);
		
		str="iu.winter.suji.jpg";
		ch=str.indexOf(".");
		System.out.println("Ch : "+ch);//앞에서 부터
		ch=str.lastIndexOf(".");
		System.out.println("Ch : "+ch);//뒤에서 부터
		
	}
	
	public void s2() {//파싱, 파싱 전처리
		//replace
		//split
		String data="서울 비 대구 눈-광주-맑음,부산,우박,제주,안개";
		System.out.println(data);
		data = data.replace(" ", ",");
		System.out.println("공백제거 : " + data);
		data = data.replace("-", ",");
		System.out.println("-제거 : " + data);
		String [] datas = data.split(",");//문자열을 자르려고 하는데 기준은 - 이다.
		for(int i=0; i<datas.length;i++) {
			System.out.println(datas[i]);	
		}
	}
	
	public void s3() {
		String str="iu.suji.winter.jpg";
				
		str = str.substring(str.lastIndexOf("j"));//begin 포함 end 미만까지 자르기
		System.out.println(str);
	}
	
	public void ex1() {
		//파일명.확장자 abc.gif
		//확장자가 jpg면 이미지파일 출력
		//확장자가 doc면 문서파일 출력
		//확장자가 mp3면 오디오파일 출력
		//그외 알수없는 파일 형식 출력
		
		System.out.println("파일명 입력");
		String file = sc.nextLine();
		file = file.substring(file.lastIndexOf(".")+1);
		
		if(file.equals("jpg")) {
			System.out.println("이미지파일");
		}else if(file.equals("doc")) {
			System.out.println("문서파일");
		}else if(file.equals("mp3")) {
			System.out.println("오디오파일");
		}else {
			System.out.println("알수없는 파일 형식");
		}
		
	}
	public void ex2() {
		//파일명.확장자 abc.gif
		//확장자가 jpg,jpeg,png,gif면 이미지파일 출력
		//확장자가 doc,txt,hwp면 문서파일 출력
		//확장자가 mp3, wav, midi, pcm면 오디오파일 출력
		//그외 알수없는 파일 형식 출력
		
		System.out.println("파일명 입력");
		String file = sc.next();
		file = file.substring(file.lastIndexOf(".")+1);
		file = file.toLowerCase();
		if(file.equals("jpg")||file.equals("jpeg")||file.equals("png")||file.equals("gif")) {
			System.out.println("이미지파일");
		}else if(file.equals("doc")||file.equals("txt")||file.equals("hwp")||file.equals("jpg")) {
			System.out.println("문서파일");
		}else if(file.equals("mp3")||file.equals("wav")||file.equals("midi")||file.equals("pcm")) {
			System.out.println("오디오파일");
		}else {
			System.out.println("알수없는 파일 형식");
		}
		//내용 자르는 법 2가지 1)split 2)substring
		String [] fn = file.split(".");
		//3-2,4-3,2-1,1-0
	}
	

}

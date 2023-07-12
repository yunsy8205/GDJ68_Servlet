package com.iu.main.api.lang.wrapper;

import java.util.Scanner;

import com.iu.main.bankBook.BankBookDTO;

public class WrapperStudy {
	
	public void s1() {
		//외부에서 들어오는 정보는 숫자열로 받을 수 없고 문자열로 받음!
		String str="청약저축-5.2-1"; // 이름 , 이자율, 판매율
		String [] strs = str.split("-");
		
		double rate = Double.parseDouble(strs[1]);
		int sale = Integer.parseInt(strs[2]);
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName(strs[0]);
		bankBookDTO.setBookRate(rate);
		bankBookDTO.setBookSale(sale);
	}
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		String jumin = sc.next();
		
		//1. 남녀 구분
		if(Integer.parseInt(jumin.substring(jumin.indexOf("-")+1, 8))==1
				||Integer.parseInt(jumin.substring(jumin.indexOf("-")+1, 8))==3) {
			System.out.println("성별 : 남자");
		}else if(Integer.parseInt(jumin.substring(jumin.indexOf("-")+1, 8))==2
				||Integer.parseInt(jumin.substring(jumin.indexOf("-")+1, 8))==4) {
			System.out.println("성별 : 여자");
		}
		//2. 나이 현재년도-출생년도
		int age = Integer.parseInt(jumin.substring(0, 2));
		if(Integer.parseInt(jumin.substring(jumin.indexOf("-")+1, 8))==1
				||Integer.parseInt(jumin.substring(jumin.indexOf("-")+1, 8))==2) {
			System.out.println("나이 : "+(123-age));
		}else {
			System.out.println("나이 : "+(23-age));
		}
		//3. 3-5 : 봄, 6-8 : 여름, 9-11: 가을, 12-2 : 겨울 태어난계절출력
		int mon = Integer.parseInt(jumin.substring(2, 4));
		if(3<=mon && mon<=5){
			System.out.println("계절 : 봄");
		}else if(6<=mon && mon<=8){
			System.out.println("계절 : 여름");
		}else if(9<=mon && mon<=11){
			System.out.println("계절 : 가을");
		}else{
			System.out.println("계절 : 겨울");
		}
	}
		
		public void ex2(){
			Scanner sc = new Scanner(System.in);
			System.out.println("주민번호 입력");
			String jumin = sc.next();
			jumin = jumin.replace("-", "");
			char [] nums = new char[jumin.length()];
			int sum = 0;
			
			for(int i=0;i<nums.length;i++) {
				nums[i]=jumin.charAt(i);
			}
			
			
//			String [] nums2 = new String [nums.length];
//			for(int i=0;i<nums2.length;i++) {
//				nums2[i]= String.valueOf(nums[i]);
//			}
			
			int [] nums3 = new int[nums.length];
			for(int i=0;i<nums3.length;i++) {
				nums3[i]=Integer.parseInt(String.valueOf((nums[i])));
			}
			
			for(int i=0;i<nums.length;i++) {
				System.out.println(nums3[i]);
			}// int로 최종변환
			System.out.println("------------------");

			for(int i=0;i<nums3.length-1;i++) {
				if(i<8) {
					nums3[i]=nums3[i]*(i+2);
				}else {
					nums3[i]=nums3[i]*(i-6);
				}
			}
			
			for(int i=0;i<nums.length;i++) {
				System.out.println(nums3[i]);
				
			}
			System.out.println("------------------");
			
			for(int i=0;i<nums.length-1;i++) {
				sum = sum + nums3[i];
			}// 합
			System.out.println(sum);
			
			int num = sum%11;//몫, 나머지
			num = 11-num;
			
			if(num>=10) {
				num=num%10;
			}
			
			if(num==nums3[nums3.length-1]) {
				System.out.println("올바른 번호");
			}else {
				System.out.println("잘못된 번호");
			}	
	}
}

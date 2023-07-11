package com.iu.main.bankBook;

import java.util.Scanner;

public class BankBookController {

	public void start() throws Exception{
		Scanner sc = new Scanner(System.in);
		BankBookDAO bankBookDAO = new BankBookDAO();
		BankBookInput bankBookInput = new BankBookInput();
		BankBookDTO bankBookDTO = new BankBookDTO();
		BankBookOutput bankBookOutput = new BankBookOutput();
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 제품 등록");
			System.out.println("2. 제품 삭제");
			System.out.println("3. 제품 조회");
			System.out.println("4. 프로그램 종료");
			System.out.println("==========================");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("등록 실행");
				bankBookDTO = bankBookInput.bankBookAdd();
				select = bankBookDAO.bankBookAdd(bankBookDTO);
				if(select > 0) {
					bankBookOutput.view("등록성공");
				}else {
					bankBookOutput.view("등록실패");
				}
				
				
			}else if(select==2) {
				System.out.println("삭제 실행");
				bankBookDTO = bankBookInput.bankBookDelete();
				select = bankBookDAO.bankBookDelete(bankBookDTO);
				if(select > 0) {
					bankBookOutput.view("삭제성공");
				}else {
					bankBookOutput.view("삭제실패");
				}
				
			}else if(select==3) {
				System.out.println("조회 실행");
				bankBookDTO = bankBookInput.bankBookDetail();
				bankBookDTO = bankBookDAO.bankBookDetail(bankBookDTO);
				
				if(bankBookDTO != null) {
					bankBookOutput.view(bankBookDTO);	
				}else {
					bankBookOutput.view("조회되지 않습니다.");
				}
			}else if(select==4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘 못 입력하셨습니다.");
			}
		}
		//1. 제품 등록
		//2. 제품 삭제
		//3. 제품 조회
		//4. 프로그램 종료
	}
}

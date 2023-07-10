package com.iu.main;

import com.iu.main.bankBook.BankBookDAO;
import com.iu.main.bankBook.BankBookDTO;
import com.iu.main.bankBook.BankBookInput;

public class StartMain {

	public static void main(String[] args) {
		try {
			//실행, 테스트
			BankBookDAO bankBookDAO = new BankBookDAO();
			BankBookInput bankBookInput = new BankBookInput();
			BankBookDTO bankBookDTO = bankBookInput.bankBookAdd();
			
			int result = bankBookDAO.bankBookAdd(bankBookDTO);
			//데이터 삽입 성공 여부 판단
			if(result > 0) {
				System.out.println("insert 성공");
			}else {
				System.out.println("insert 실패");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

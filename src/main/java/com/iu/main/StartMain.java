package com.iu.main;

import com.iu.main.bankBook.BankBookController;
import com.iu.main.bankBook.BankBookDAO;
import com.iu.main.bankBook.BankBookDTO;
import com.iu.main.bankBook.BankBookInput;

public class StartMain {

	public static void main(String[] args) {
		try {
			//실행, 테스트
			BankBookDAO bankBookDAO = new BankBookDAO();
//			BankBookInput bankBookInput = new BankBookInput();
//			BankBookDTO bankBookDTO = bankBookInput.bankBookAdd();
//			
//			int result = bankBookDAO.bankBookAdd(bankBookDTO);
			
//			BankBookDTO bankBookDTO = new BankBookDTO();
//			bankBookDTO.setBookNum(5000);
//			int result=bankBookDAO.bankBookDelete(bankBookDTO);
//			
			BankBookDTO bankBookDTO = new BankBookDTO();
//			bankBookDTO.setBookNum(1);
//			bankBookDTO = bankBookDAO.bankBookDetail(bankBookDTO);
//			System.out.println(bankBookDTO.getBookNum());
//			System.out.println(bankBookDTO.getBookName());
//			System.out.println(bankBookDTO.getBookRate());
//			System.out.println(bankBookDTO.getBookSale());
//			
			//데이터 삽입 성공 여부 판단
//			if(result > 0) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
			
			BankBookController bc = new BankBookController();
			bc.start();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

package com.iu.main.bankBook;

import java.util.ArrayList;

public class BankBookOutput {
	
	public void view(ArrayList<BankBookDTO> ar) {
		for(int i=0; i<ar.size();i++) {
			this.view(ar.get(i)); 
		}
	}
	
	public void view(BankBookDTO bankBookDTO) {
		System.out.println("BookNum : "+bankBookDTO.getBookNum());
		System.out.println("BookName : "+bankBookDTO.getBookName());
		System.out.println("BookRate : "+bankBookDTO.getBookRate());
		System.out.println("BookSale : "+bankBookDTO.getBookSale());
	}
	
	public void view(String str) {//성공, 실패
		System.out.println("Result : "+str);
	}

}

package com.iu.main.bankBook;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.iu.main.util.DBConnector;

public class BankBookDAO {
	
	public int bankBookAdd(BankBookDTO bankBookDTO) throws Exception {
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		//2. 쿼리문 작성
		String sql="INSERT INTO BANKBOOK VALUES (BANK_SEQ.NEXTVAL,?,?,?)";
		
		//3. 쿼리문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4.?값 세팅
		st.setString(1, bankBookDTO.getBookName());
		st.setDouble(2, bankBookDTO.getBookRate());
		st.setInt(3, bankBookDTO.getBookSale());
		
		//5. 최종 전송 및 결과 처리
		int result = st.executeUpdate(); //result가 1이상이면 성고으 아니면 실패
		
		System.out.println("DB에 insert");
		
		return result;
		
	}
	
	//delete
	public void bankBookDelete() {
		System.out.println("DB Delete");
	}

}

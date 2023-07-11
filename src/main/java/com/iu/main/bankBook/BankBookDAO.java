package com.iu.main.bankBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.main.util.DBConnector;

public class BankBookDAO {
	//상품 1개 조회
	public BankBookDTO bankBookDetail(BankBookDTO bankBookDTO) throws Exception{
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		
		//2.query
		String sql ="SELECT * FROM BANKBOOK WHERE BOOKNUM=?";
		
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ?값 세팅
		st.setLong(1, bankBookDTO.getBookNum());
		
		//5. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();
		// cursor 한줄읽기 (무조건 한줄씩 읽어서 처리) rs.next : 한줄 읽고 오라는 의미
		// 그 결과물을 rs에 담음
		if(rs.next()) {
			//매개변수로 받은 DTO 재활용
			bankBookDTO.setBookNum(rs.getLong("BOOKNUM"));
			bankBookDTO.setBookName(rs.getNString("BOOKNAME"));
			bankBookDTO.setBookRate(rs.getDouble("BOOKRATE"));
			bankBookDTO.setBookSale(rs.getInt("BOOKSALE"));
			
		}else {
			bankBookDTO=null;
			
		}
		
		return bankBookDTO; 
		
	}
	
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
		int result = st.executeUpdate(); //result가 1이상이면 성공 아니면 실패
		
		System.out.println("DB에 insert");
		
		return result;
		
	}
	
	//delete
	public int bankBookDelete(BankBookDTO bankBookDTO) throws Exception {
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		//2. query문 작성
		String sql="DELETE BANKBOOK WHERE BOOKNUM=?";
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ?값 세팅
		st.setLong(1, bankBookDTO.getBookNum());
		//5. 최종전송 및 결과 처리
		int result = st.executeUpdate(); //result가 1이상이면 성공 아니면 실패
		
		System.out.println("DB Delete");
		
		return result;
	}

}

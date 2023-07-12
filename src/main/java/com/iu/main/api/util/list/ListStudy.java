package com.iu.main.api.util.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ListStudy {
	
	public void s1() {
		//<> Generic
		//E Element : 변수
		ArrayList<Integer> ar = new ArrayList<>();//뒤 <> 생략가능
		ar.add(2);
		
		int num = ar.get(0);
	}
	
	public void ex1() { //로또 번호 뽑기 : 1~45
		Random random = new Random();
		HashSet hs = new HashSet();
		
		for(int i=0;i>=0;i++) {
			if(hs.size()==6) {
				break;
			}else {
				hs.add(random.nextInt(44)+1);
			}
		}
			System.out.println(hs);

	}
}

package com.iu.main.api.util.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MapMain {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//<키로 어떤 타입, 밸류로 어떤 타입>을 쓸지 정해야 한다.
		
		map.put("k1", 20);
		map.put("k2", 50);
		map.put("k3", 45);
		
		map.remove("k1", 25);
		//map.clear();
		
		map.put("k3", 60);//키가 있으면 수정, 없으면 추가
		
		System.out.println(map.get("k2"));
		System.out.println(map.containsKey("k3"));
		System.out.println(map.containsValue(30));
		System.out.println(map);
		System.out.println("=============================");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		// set은 하나만 꺼낼 수는 없음.
		
		// set에서 꺼내기
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {//hasNext 다음것이 있는지 여부 트루, 폴스
			int num = it.next(); // 다음에 있는 값
			System.out.println(num);
		}
		
		System.out.println("===============================");
		Iterator<String> keys = map.keySet().iterator();
		//맵의 키를 Set타입으로 바꿔줌
		while(keys.hasNext()) {//다음요소가 있는지 확인
			String key = keys.next();//다음요소를 반환
			System.out.println("key : "+key);
			int value = map.get(key);
			System.out.println(value);
		}
		
		
	}
}

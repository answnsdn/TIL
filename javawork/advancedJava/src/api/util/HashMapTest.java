package api.util;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.key와 value를 한 쌍으로 저장
		//	- Generic으로 데이터 타입을 명시할때도 key에 대한 타입, value에 대한 타입을 같이 정의해야한다.
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//map에서는 key로 요소를 구분하기 때문에 key가 같으면 덮어쓴다.
		map.put(1,"servlet");
		map.put(1,"jsp");
		map.put(1,"spring");
		System.out.println("map에 저장된 요소의 개수 : "+map.size());
		System.out.println("key가 1인 요소의 value : "+map.get(1));
		
		//map에 저장된 데이터를 모두 출력하기
		//map은 key를 이용해서 저장될 위치를 계산하기 때문에 저장한 순서대로 출력되지 않는다.
		HashMap<String, String> map2 = new HashMap<String,String>();
		map2.put("1","servlet");
		map2.put("2","jsp");
		map2.put("3","spring");
		map2.put("4","tiles");
		map2.put("5","mybatis");
		
		//1.key 목록을 추출한다
		Set<String> keylist = map2.keySet();
		//2.반복문 안에서 key를 이용해 value를 추출한다.
		for(String key: keylist) {
			String value = map2.get(key);
			System.out.println(key+" : "+value);
		}
	}

}

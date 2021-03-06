package api.util;

import java.util.ArrayList;

public class ArrayListTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"java","oracle","jdbc","html5","css","java"};
		ArrayList<String> list = changeData(arr);
		//변환되어 리턴된 ArrayList에 저장된 값을 꺼내서 출력하기
		int size = list.size(); //메소드 안에서 size를 다시 정의해주면 불필요하게 heap에 접속하는 시간을 없앨 수 있다.
		for(int i=0;i<size;i++) {
			System.out.println(list.get(i));
		}
		/*for(String data : list) {
		 System.out.println("요소 : "+data);
		} --> 이런 식으로 표현 가능 */
		
		
		
	}
	//배열을 ArrayList로 변환해서 리턴하는 메소드
	public static ArrayList<String> changeData(String[] arr){
		ArrayList<String> list = new ArrayList<String>();
		//매개변수로 전달된 배열에서 데이터를 꺼내서 ArrayList에 저장하는 코드
		String ar = null;
		for(int i=0;i<arr.length;i++) {
			ar = arr[i];
			list.add(ar); //->list.add(arr[i])로 표현 가능
		}
		
		
		return list;
	}

}

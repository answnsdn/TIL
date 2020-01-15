package api.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set�� �ֿ����� ������ ������ ����� ������ ����
public class HashSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("oracle");
		set.add("html");
		set.add("java");
		print(set,"set");
		
		//�������� �����ϴ� ��� => Set��ü�� ������ �� ���������� ǥ���� Set�� �������� �Ű������� ����
		HashSet<String> set2 = new HashSet<String>(set);
		set2.add("servlet");
		set2.add("jsp");
		set2.add("hadoop");
		print(set2,"set2");
				
		HashSet<String> set3 = new HashSet<String>();
		set3.add("jdbc");
		set3.add("oracle");
		set3.add("hive");
		print(set3,"set3");
		
		//set�� set3�� ������ ���ϱ�
		set.retainAll(set3);
		print(set,"������set");//set�� set3�� ����� ��� �� �ߺ��Ǵ� ��Ҹ� ������ ���ο� set������ ���������.
							//��ġ�ϴ� �͸� ����� �������� ���ŵȴ�.
		
	}
	public static void print(Set<String> set, String setName) {
		System.out.println("������=>"+set.size());
		for(String data : set) {
			System.out.println(setName+"�� ����� ��� : "+ data);
		}
		System.out.println("=========================");
	}
}
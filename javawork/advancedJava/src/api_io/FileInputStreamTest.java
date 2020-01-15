package api_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//advancedJava ������Ʈ���� �Ʒ� ����� test.txt�� ������ �о �ֿܼ� ����ϱ�
public class FileInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			//1. ���� �����ϱ�
		fis = new FileInputStream("src/data/test.txt");
			//2. ���Ͽ�����
		while(true) {
			int data= fis.read();
			if(data==-1) {
				break;
			}
			System.out.print((char)data);
		}
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}finally {
	
			//3.���ϴݱ�
		try {
			if(fis!=null)fis.close();
		}catch(IOException e) {
			e.printStackTrace();
	}
	}
	}
}
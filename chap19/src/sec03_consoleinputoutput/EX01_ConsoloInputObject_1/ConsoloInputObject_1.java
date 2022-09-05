package sec03_consoleinputoutput.EX01_ConsoloInputObject_1;

import java.io.IOException;
import java.io.InputStream;

public class ConsoloInputObject_1 {

	public static void main(String[] args) throws IOException {
		//InputStream 객체 생성
		InputStream is = System.in;
		int data;
		while( (data = is.read()) != '\r') {
			System.out.println("읽은 데이터: " + (char)data + " 남은 바이트 수: " + is.available());
		}
		
		System.out.println(data); // \r (13)
		System.out.println(is.read()); // \n(10) 버퍼를 비워주기 위해 입력버퍼에 남아있는 \n을 read()메서드를 이용해 꺼냄

	}

}

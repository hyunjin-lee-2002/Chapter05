package com.javaex.ex03;
/*
PhoneDB.txt 파일을 한줄씩 읽는다, (MS949방식으로 저장되어 있음)
"이효리,010-2222-3333,031-2323-4441"  을 "," 로 구분한다.  -->배열
문제에 있는 형식으로 출력한다
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader (in, "PhoneDB");
		BufferedReader br = new BufferedReader(isr); 
		
		OutputStream out = new FileOutputStream("\"C:\\javaStudy\\PhoneDB.txt\"");
		OutputStreamWriter osw = new OutputStreamWriter(out, "PhoneDB");
		BufferedWriter bw = new BufferedWriter(osw);
		
		System.out.println("----------스트림 준비 완료----------");
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				System.out.println("----------읽기 끝----------");
				break;
			}
			
			bw.write(str);
		}
		bw.close();
		br.close();
		
		System.out.println("=====프로그램 종료=====");
		
	}

}

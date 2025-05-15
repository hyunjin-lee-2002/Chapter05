package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	public static void main(String[] args) throws IOException{
		
		//Main stream
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\bufferedimg.jpg");
		
		//보조 스트림
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		System.out.println("스트림 준비 완료");
		
		
		System.out.println("복사 시작");
		while(true) {
			int data = bin.read();
			if(data == -1) {
				System.out.println("복사 끝");
				break;
			}
			bout.write(data);
		}
		
		bin.read();

		
		//스트림 정리
		bout.close();	//Close Main stream
		bin.close();	//Close Main stream
		
		System.out.println("프로그램 종료");
	}

}

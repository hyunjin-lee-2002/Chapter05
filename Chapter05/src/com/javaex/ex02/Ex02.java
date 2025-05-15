package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		//ready Main stream
		Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		
		//ready Extra stream
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("-----스트림 준비 완료-----");

		while(true) {
			String str = br.readLine();
			if(str == null) {
				System.out.println("-----파일 읽기 끝-----");
				break;
			}
			
			System.out.println(str);
		
		}
		
		//end Stream
		br.close();
	}

}

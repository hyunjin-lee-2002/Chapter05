package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		//ready Main Stream
		Writer fw = new FileWriter("C:\\javaStudy\\song.txt");
		
		//ready extra Stream
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("집 존나 가고 싶노 씨발");
		bw.newLine();
		bw.write("재미 좆도 없다 썅");
		bw.newLine();
		bw.write("영어발음 개이상함 buffered가 버퍼티드가 됨 쓸 때마다 헷갈리게 함 짜증");
		bw.newLine();
		bw.write("걍 텔가서 자다가 퇴실 찍고 싶다");
		
		//end Stream
		bw.close();
		
		
	}

}

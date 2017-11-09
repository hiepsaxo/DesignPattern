package com.chilvas.example2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice1 {
	
	public static String processFile(BufferedReaderProcessor p) throws IOException {
		try(BufferedReader br = new BufferedReader(new FileReader("D:/TEST/java/file1.properties"))){
			return p.process(br);
		}
	}
	public static void main(String[] args) {
		try {
			String oneLine = processFile((BufferedReader br)->br.readLine());
			System.out.println(oneLine);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

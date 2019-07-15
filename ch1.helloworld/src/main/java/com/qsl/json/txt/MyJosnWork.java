package com.qsl.json.txt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyJosnWork {
//	public static void main(String[] args) {
//		try {
// 
//			String ss=getJson();
//			System.out.println(ss.substring(0,100));
//		} catch (IOException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
//	}
	public static String getJson() throws IOException {
		String path="E:\\my_workspace\\ecplise_oxygen\\ch1.helloworld\\src\\main\\java\\com\\qsl\\json\\txt\\movie.txt";
		 FileReader reader = new FileReader(path);
    	 BufferedReader br = new BufferedReader(reader);
    	 String content="";
    	 StringBuilder sb = new StringBuilder();
    	 while(content != null){
    	 content = br.readLine();
    	 if(content == null){
    	 break;
    	 }
    	 sb.append(content);
    	 }
    	 
    	 br.close();
		return sb.toString();
	}
}

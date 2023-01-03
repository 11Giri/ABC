package com.readWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	//String [] names= {"Jon","carl","Jerry"};
	public static void main(String[] args)  {
		String [] names= {"Jon","carl","Jerry"};
		try {
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\happy\\OneDrive\\Documents\\FileWrite.txt"));
			writer.write("\nHere is another line");
			writer.write("\nHere is another nextline");
			for(String name: names) {
				writer.write("\n" + names);
			}
				writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		BufferedReader reader= new BufferedReader(new FileReader("C:\\Users\\happy\\OneDrive\\Documents\\FileWrite.txt"));
		String line;
		while((line=reader.readLine())!=null){
			System.out.println(line);
		}
		System.out.println(reader.readLine());
		reader.close();
		}catch(IOException e) {
			e.printStackTrace();

	}

	}
}

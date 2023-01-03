package com.abc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderMultiLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//got to path
		File file=new File("C:\\Users\\happy\\OneDrive\\Desktop\\newFile.txt");
		FileInputStream fileInput=new FileInputStream(file);
		int i=0;
		while((i=fileInput.read())!=-1){
			System.out.println((char)i);
		}
		fileInput.close();
	}

}

package com.abc;

import java.io.File;
import java.io.FileOutputStream;

public class FileWrite {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
File file=new File("C:\\Users\\happy\\OneDrive\\Desktop\\Text.txt ");
//open the file
FileOutputStream fileOutput=new FileOutputStream(file);
// write to file
fileOutput.write(500);
//message before closing
System.out.println("file write succeful");
//close the file
fileOutput.close();
	}

}

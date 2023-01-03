package com.readWrite;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class StudentMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file= new File("C:\\Users\\happy\\git\\repository\\ABC\\src\\com\\readWrite\\raj.properties");
		
			FileReader reader=new FileReader(file);
			Properties p= new Properties();
			
				p.load(reader);
				
String name = p.getProperty("name");
String address = p.getProperty("address");
String id = p.getProperty("id");

Student std = new Student(name,Integer.parseInt(id), address);
std.show();
	
	
		
}
}
/* System.out.println(pr.getProperty("name"));
System.out.println(pr.getProperty("address"));
System.out.println(pr.getProperty("Id"));*/





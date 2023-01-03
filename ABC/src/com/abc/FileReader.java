package com.abc;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class FileReader {
//	public static void main(String[] args) throws IOException {
//		
//	File file=new File("C:\\Amazon\\vava\\abdjava.txt");
//	FileInputStream fileinput=new FileInputStream(file);
//	int i= fileinput.read();
//	// converting the integer ASCII values to character
//	System.out.println((char)i);
//	//close the file
//	fileinput.close();
//}
//}

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfWriteDemo {

	public static void main(String[] args) throws DocumentException, FileNotFoundException {

		String file = "C:\\Demo IO\\Demo8.pdf";			

		Document doc = new Document();
		FileOutputStream fileOS = new FileOutputStream(file);

		PdfWriter.getInstance(doc, fileOS);

		doc.open();
		Paragraph names = new Paragraph("Anil,Ashmita, Bijay,Bishow,Brital,"
									+ "\nDipika,Giriraj,Jhabindra,Keshar,Meaza,"
										+ "\nNarayan,Rajiv,Ryan,Safal,Tilak");
		doc.add(names);
		doc.close();

		System.out.println(names);

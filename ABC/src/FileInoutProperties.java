import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileInoutProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\happy\\git\\repository\\ABC\\src\\giri.properties");
		FileReader fr = new FileReader(file);
		
		Properties p = new Properties();
		p.load(fr);
		String name = p.getProperty("name");
		String address = p.getProperty("address");
		String id = p.getProperty("id");
		//System.out.println(p.getProperty("users")); 
		System.out.println(p.getProperty("users"));

		}

	

	}



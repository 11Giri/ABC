import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("C:\\Users\\happy\\OneDrive\\Documents\\FileWrite.txt");
		Scanner scan=new Scanner(file);
		String fileContent="This is a new file made by us you Know that i hi all how are you ";
		while(scan.hasNextLine()) {
			fileContent=fileContent.concat(scan.nextLine()+"\n ");
			System.out.println(scan.nextLine());

			}
		FileWriter writer =new FileWriter("C:\\Users\\happy\\OneDrive\\Documents\\FileWrite.txt");
		writer.write(fileContent);
		writer.close();
		}
			
		}


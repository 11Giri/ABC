import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileReader1009 {

	public static void main(String[] args) throws IOException {
		// locate a File
				File file = new File("C:\\Users\\happy\\OneDrive\\Documents\\FileReader.txt ");

				FileReader fileReader = null;
				// open the file
				try {
					fileReader = new FileReader(file);
					int i;
					// reading the file
					while ((i = fileReader.read()) != -1) {
						System.out.print((char) i);
					}

				} catch (Exception e) {

					e.printStackTrace();
				} finally {
					// closing the file
					try {
						fileReader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

			}
		}

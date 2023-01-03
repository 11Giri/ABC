import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LogMain {

	public static void main(String[] args) throws SecurityException, IOException {
		// TODO Auto-generated method stub
		boolean flag= true;
		FileHandler file= new FileHandler("LoggerPractice.logFile",flag);
		Logger logger=Logger.getLogger("Application");
		logger.addHandler(file);
		logger.info("Fourth try");
		logger.severe(" Fifth Try ");
		logger.warning(" sixth Try");
LogFile logFile =new LogFile();
logFile.display();
logFile.run();
logFile.walk();
	}
	}


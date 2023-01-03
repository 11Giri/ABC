import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class GetLogger {
public static Logger Sleep() throws SecurityException, IOException {
	boolean flag= true;
	FileHandler file= new FileHandler("LoggerPractice.logFile",flag);
	Logger logger=Logger.getLogger("Application");
	logger.addHandler(file);
	return logger;
}
}


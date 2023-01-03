import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogFile {
	GetLogger getLog=new GetLogger();
	Logger logger=null;
	
	
 public  void display() throws SecurityException, IOException {
	  logger=GetLogger.Sleep();
	logger.log(Level.INFO, " First Inside display method");
 }
 public  void run() {

	 logger.log(Level.WARNING, "Secound inside display");
 }
 public void walk() {
	
	 logger.log(Level.SEVERE, " Third Inside walk method");
 }
 
}

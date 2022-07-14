import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Main {
public static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String args[])
	{
		logger.info("This is my first Info Log");
		logger.debug("This is my first Debug Log");
		logger.warn("This is my first Warn Log");
		logger.error("This is my first Error Log");
		//logger.log(Level.ERROR,"Second Error Log");
		
	}
}

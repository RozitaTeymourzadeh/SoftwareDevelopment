/**
 * 
 */
package logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;

/**
 * @author rozitateymourzadeh
 *
 */

/* Read Logger in java API
SEVERE (highest)
WARNING
INFO
CONFIG
FINE
FINER
FINEST
 */
// http://www.vogella.com/tutorials/Logging/article.html
public class cs601Logger {

	public static void setup() {

		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.setLevel(Level.INFO);
		FileHandler fileout;
		try {
			fileout = new FileHandler("out.log");
			fileout.setFormatter(new SimpleFormatter());
			logger.addHandler(fileout);	
		}catch (SecurityException | IOException e){
			e.printStackTrace();
		}
	}
}


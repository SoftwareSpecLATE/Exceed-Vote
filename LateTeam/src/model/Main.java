

import org.apache.log4j.Logger;
//import org.apache.log4j.Level;

public class Main {

	public void testlogging() {
		Logger logger = Logger.getLogger(this.getClass());
		logger.info("this is an info message");
	}

	public static void initJavaLogger() {
		java.util.logging.Handler handler = null;
		java.util.logging.Logger logger = java.util.logging.Logger
				.getLogger("");
		
		// get System property named "logfile", default to "example.log"
		// user can set this using command line switch -dlogfile=somefile.txt
		String logfile = System.getProperty("logfile", "Records.log");

		try {
			if (logfile != null)
				handler = new java.util.logging.FileHandler(logfile);
			else
				handler = new java.util.logging.ConsoleHandler();
			handler.setFormatter(new java.util.logging.SimpleFormatter());
			logger.addHandler(handler);
			logger.setUseParentHandlers(false); // don't send log msgs to parent

		} catch (java.io.IOException e) {
		}
		logger.setLevel(java.util.logging.Level.ALL);
	}

	private static Vote v = new Vote();

	public static void main(String[] args) {

		// test logging
		//Main main = new Main();
		//main.testlogging();

		v.VoteBallot();
		UIVote.createAndShowGUI();

		// Log program exit so we can see that "fatal" does.
		Logger logger = Logger.getLogger(Main.class);
		logger.fatal("exiting");
	}

}

package Designpattern;
abstract class Logger{
	public static int OUTPUTINFO=1;
	public static int ERRORINFO=2;
	public static int DEBUGINFO=3;
	protected int levels;
	protected Logger nextLevelLogger;
	public void setNextLevelLogger(Logger nextLevelLogger) {
		this.nextLevelLogger=nextLevelLogger;
	}
	public void logMessage(int levels,String msg) {
		if(this.levels<=levels) {
			displayLogInfo(msg);
		}
		if(nextLevelLogger!=null) {
			nextLevelLogger.logMessage(levels, msg);
		}
	}
	protected abstract void displayLogInfo(String msg);
}
class ConsoleBasedLogger extends Logger{
	public ConsoleBasedLogger(int levels) {
		this.levels=levels;
	}
	protected void displayLogInfo(String msg) {
		System.out.println("CONSOLE LOGGER INFO: "+msg);
	}
}
class DebugBasedLogger extends Logger{
	public DebugBasedLogger(int levels) {
		this.levels=levels;
	}
	protected void displayLogInfo(String msg) {
		System.out.println("DEBUG LOGGER INFO: "+msg);
	}
}
class ErrorBasedLogger extends Logger{
	public ErrorBasedLogger(int levels) {
		this.levels=levels;
	}
	protected void displayLogInfo(String msg) {
		System.out.println("ERROR LOGGER INFO: "+msg);
	}
}
public class chainofresponbilityex1 {
	private static Logger dochaining() {
		Logger consoleLogger=new ConsoleBasedLogger(Logger.OUTPUTINFO);
		Logger errorLogger=new ErrorBasedLogger(Logger.ERRORINFO);
		consoleLogger.setNextLevelLogger(errorLogger);
		Logger debugLogger=new DebugBasedLogger(Logger.DEBUGINFO);
		errorLogger.setNextLevelLogger(debugLogger);
		return consoleLogger;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger chainLogger=dochaining();
		chainLogger.logMessage(Logger.OUTPUTINFO,"Enter Sequence of the value");
		chainLogger.logMessage(Logger.ERRORINFO,"An Error Occured");
		chainLogger.logMessage(Logger.DEBUGINFO,"This was an Error noe debuging is completed");
	}
}

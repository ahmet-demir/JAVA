package polimorfizmDemo;

public class Main {

	public static void main(String[] args) {
		//FileLogger fileLogger = new FileLogger();
		//fileLogger.Log("file çalıştırdı");
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger()};
		for(BaseLogger logger : loggers) {
			logger.log("çalıştı");
		}
		 
	}

}

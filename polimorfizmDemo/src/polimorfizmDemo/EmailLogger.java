package polimorfizmDemo;

public class EmailLogger extends BaseLogger{
	
	public void log(String massage) {
		System.out.println("EmailLogger çalıştı = "+ massage);
	}
}

package inheritance;
 // iki nesne arasındaki miras brakma durumudur

public class Main {

	public static void main(String[] args) {
		// customer ve employee , person dan özellik miras aldığı için artık onların içinde de kullanıla bilir oldular.
		Customer customer = new Customer();
		customer.age=12;   // customer class'ının içinde age yok ama preson dan miras aldı için kullanıla bilir oldu 
		Employee employee = new Employee();
		employee.firstname="demir"; // aynı şekilde employee de firstname aldı.
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		
		customerManager.list(); // için de olmamasına ramen PersonManagerden miras aldığı için çalışabilir.
		employeeManager.add();  
		
	}

}

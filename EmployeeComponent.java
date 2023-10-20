
public class EmployeeComponent {

	public static void main(String[] args) {

		// Assemble all the pieces of the MVC
		EmployeeModel m = EmployeeModel.getInstance();
		EmployeeView v = new EmployeeView();
		EmployeeController c = new EmployeeController(m, v);

		c.initController();

	}

}
	
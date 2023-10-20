
public class EmployeeController {

	private EmployeeModel model;
	private EmployeeView view;

	public EmployeeController(EmployeeModel m, EmployeeView v) {
		model = m;
		view = v;
		initView();
	}

	public void initView() {
		view.getEmployeeWorkingHourTextfield().setText(Integer.toString(model.getWorkingHour()));
	}

	/**
	 * Connect the buttons to the listner function
	 */
	public void initController() {
		view.getEmployeeSaveButton().addActionListener(e -> saveWorkingHour());
		view.getEmployeePrintButton().addActionListener(e -> printToConsole());

	}

	/**
	 * Calculate the bonus salary of the employee
	 * 10 dollar for each extra hour
	 * @return the bonus salary of the employee
	 */
	private double calculateBonusSalary() {
		int workingHour = model.getWorkingHour();
		double bonusSalary = 0;

		if (workingHour >= 160) {
			bonusSalary = (workingHour - 160) * 10;
		}
		return bonusSalary;
	}

	/**
	 * Calculate the base salary of the employee
	 * according to the following equation 160 * 15
	 * @return the base salary of the employee
	 */
	private double calculateBaseSalary() {
		int workingHour = model.getWorkingHour();
		double baseSalary;

		if (workingHour >= 160) {
			baseSalary = 160 * 15;
		} else {
			baseSalary = workingHour * 15;
		}
		return baseSalary;

	}

	/**
	 * Save the working hour to the model
	 */
	private void saveWorkingHour() {
		model.setWorkingHour(Integer.parseInt(view.getEmployeeWorkingHourTextfield().getText()));
	}

	/**
	 * Print the working hour of the employee 
	 * along with the base, bonus and Total Salary
	 */
	private void printToConsole() {
		double baseSalary = calculateBaseSalary();
		double bonusSalary = calculateBonusSalary();

		System.out.printf("Working Hour : %d\n", model.getWorkingHour());
		System.out.printf("Base Salary : %.2f$\n", baseSalary);
		System.out.printf("Bonus Salary : %.2f$\n", bonusSalary);
		System.out.printf("Total Salary : %.2f$\n", (baseSalary + bonusSalary));
	}
}

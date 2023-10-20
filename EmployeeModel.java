
public class EmployeeModel {

	private static EmployeeModel uniqueInstance;

	// other useful instance variables here
	private EmployeeModel() {
	}

	private int workingHour;

	public static EmployeeModel getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new EmployeeModel();
		}

		return uniqueInstance;
	}	

	public int getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(int workingHour) {
		assert workingHour > 0;
		this.workingHour = workingHour;
	}

}

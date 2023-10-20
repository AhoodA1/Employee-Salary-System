import static org.junit.Assert.*;
import org.junit.Test;

public class EmployeeModelTest {
	@Test
	public void testGetWorkingHour() {

		EmployeeModel employeeModel = EmployeeModel.getInstance();

		int value = 170;

		employeeModel.setWorkingHour(value);

		int actual = employeeModel.getWorkingHour();

		assertEquals(value, actual);
	}

	@Test
	public void testSetWorkingHour() {

		EmployeeModel employeeModel = EmployeeModel.getInstance();

		int value = 100;

		employeeModel.setWorkingHour(value);

		int actual = employeeModel.getWorkingHour();

		assertEquals(value, actual);
	}
}

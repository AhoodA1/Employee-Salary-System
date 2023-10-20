import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmployeeView {

	private JFrame frame;

	// View elements
	private JLabel employeeLabel;
	private JTextField employeeWorkingHourTextfield;
	private JButton employeeSaveButton;
	private JButton employeePrintButton;

	public EmployeeView() {

		frame = new JFrame("Employee");
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 100);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		// Create UI elements
		employeeLabel = new JLabel("Working Hour:");
		employeeWorkingHourTextfield = new JTextField();
		employeeSaveButton = new JButton("Save working hour");
		employeePrintButton = new JButton("Print Working hour to Console!");

		// Add UI element to frame
		GroupLayout layout = new GroupLayout(frame.getContentPane());

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(employeeLabel))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(employeeWorkingHourTextfield))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(employeeSaveButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(employeePrintButton)));

		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(employeeLabel)
						.addComponent(employeeWorkingHourTextfield).addComponent(employeeSaveButton)
						.addComponent(employeePrintButton)));

		frame.getContentPane().setLayout(layout);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getEmployeeLabel() {
		return employeeLabel;
	}

	public void setEmployeeLabel(JLabel employeeLabel) {
		this.employeeLabel = employeeLabel;
	}

	public JTextField getEmployeeWorkingHourTextfield() {
		return employeeWorkingHourTextfield;
	}

	public void setEmployeeWorkingHourTextfield(JTextField employeeWorkingHourTextfield) {
		this.employeeWorkingHourTextfield = employeeWorkingHourTextfield;
	}

	public JButton getEmployeeSaveButton() {
		return employeeSaveButton;
	}

	public void setEmployeeSaveButton(JButton employeeSaveButton) {
		this.employeeSaveButton = employeeSaveButton;
	}

	public JButton getEmployeePrintButton() {
		return employeePrintButton;
	}

	public void setEmployeePrintButton(JButton employeePrintButton) {
		this.employeePrintButton = employeePrintButton;
	}

}

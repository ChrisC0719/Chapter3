package exercises;

import javax.swing.JOptionPane;

public class DemoRaise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String startingWageString, salaryString;
		double salary = 200.00;
		double startingWage = 800.00;
		System.out.println("Demonstarting some raises");
		startingWageString = JOptionPane.showInputDialog(null, "Enter employee's starting salary" , "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
		salary = Double.parseDouble(startingWageString) * salary;
		salaryString = JOptionPane.showInputDialog(null,"Enter employee's salary?", "Salary dialog 2", JOptionPane.QUESTION_MESSAGE);
		
		predictRaise(400.00);
		predictRaise(salary);
		predictRaise(startingWage);
		
		
	}
	public static void predictRaise(double salary)
	{
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current salary: " + salary + " After raise: " + newSalary);
	}

}

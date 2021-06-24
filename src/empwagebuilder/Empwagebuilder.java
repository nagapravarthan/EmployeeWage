package empwagebuilder;

public class Empwagebuilder {
	public static void main(String args[]) { 
		int FULL_DAY = 8;
		int PART_TIME = 4;
		int WAGE_PER_HOUR =20;
                double IS_EMP_PRESENT = 1.0;
                double IS_PART_TIME = 2.0;
				double empCheck = Math.floor(Math.random() *10) % 3;
				if (empCheck == IS_EMP_PRESENT) {
					int dailywage = FULL_DAY *WAGE_PER_HOUR;
					System.out.println("Empoyee is Present");
					System.out.println("Daily Employee Wage is : "+ dailywage);
				}
				else if(empCheck  == IS_PART_TIME) {
					int PartTimeWage = PART_TIME *WAGE_PER_HOUR;
					System.out.println("Employee is Present for part time");
					System.out.println("Daily Employee Wageis : "+ PartTimeWage);
				} 
				else {
					System.out.println("Employee is absent");
				}
	  } 

}
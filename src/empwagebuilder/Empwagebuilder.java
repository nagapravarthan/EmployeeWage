package empwagebuilder;

public class Empwagebuilder {
	public static void main(String args[]) { 
		int FULL_DAY = 8;
		int PART_TIME = 4;
		int WAGE_PER_HOUR =20;
                final int IS_EMP_PRESENT = 1;
                final int IS_PART_TIME = 2;
                int dailywage=0;
				double empCheck = Math.floor(Math.random() *10) % 3;
				if (empCheck == IS_EMP_PRESENT) {
					dailywage = FULL_DAY *WAGE_PER_HOUR;
					System.out.println("Empoyee is Present");
					System.out.println("Daily Employee Wage is : "+ dailywage);
				}
				else if(empCheck  == IS_PART_TIME) {
					dailywage = PART_TIME *WAGE_PER_HOUR;
					System.out.println("Employee is Present for part time");
					System.out.println("Daily Employee Wageis : "+ dailywage);
				} 
				else {
					System.out.println("Employee is absent");
				}
				switch ((int)empCheck) {
				
				case IS_EMP_PRESENT:
					break;
					
				case  IS_PART_TIME:{
				}
				default:
					System.out.println("Employee is Absent");
				}
	  } 

}
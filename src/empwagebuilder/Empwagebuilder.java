package empwagebuilder;

public class Empwagebuilder {

	public static final int FULL_DAY = 8;
	public static final int PART_TIME = 4;
	public static final int WAGE_PER_HOUR =20;
	public static final int IS_EMP_PRESENT = 1;
    public static final  int IS_PART_TIME = 2;
    public static void main(String args[]) { 
            int dailywage=0;
for (int i = 0; i<20; i++) {

}
			double empCheck = Math.floor(Math.random() *10) % 3;
			
			
			switch ((int)empCheck) {
			
			case IS_EMP_PRESENT:
				dailywage = FULL_DAY *WAGE_PER_HOUR;
				System.out.println("Empoyee is Present");
				System.out.println("Daily Employee Wage is : "+ dailywage);
				break;
				
			case  IS_PART_TIME:{
				dailywage = PART_TIME *WAGE_PER_HOUR;
				System.out.println("Employee is Present for part time");
				System.out.println("Daily Employee Wageis : "+ dailywage);
			}
			default:
				System.out.println("Employee is Absent");
			}
  } 


}
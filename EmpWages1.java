import java.util.Scanner;
import java.util.Random;

public class EmpWages1 {
    public static void main(String[] args) {
        //int IS_FULL_TIME = 1;
        //int IS_PART_TIME = 2;
        int Emp_Rate_Per_Hour = 20;
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int Total_Working_hours = 100;
        int totalEmpWage = 0;

        while (totalEmpHrs <= Total_Working_hours || totalWorkingDays < totalWorkingDays)
        {
            totalWorkingDays++;
            //Random random = new Random();
            double random = Math.random();
            //int empCheck = random.Next(0,3);


            switch (((int) (random*10) )% 2) {
                case 1:
                    System.out.println("\nEmployee is Present ");
                    empHrs = 8;
                    break;

                case 2:

                    System.out.println("\nEmployee is Part Time ");
                    empHrs = 4;
                    break;

                default:

                    System.out.println("\nEmployee is Absent ");
                    empHrs = 0;
                    break;
            }

            totalEmpHrs += empHrs;
            System.out.println("\ntotal day " + totalWorkingDays + " Emp Hrs" + totalEmpHrs);

        }
        totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hour;
        System.out.println("\n" + totalEmpWage);
    }
}


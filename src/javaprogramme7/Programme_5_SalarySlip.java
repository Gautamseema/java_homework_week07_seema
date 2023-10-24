package javaprogramme7;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 * 6.
 */

public class Programme_5_SalarySlip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System .in);

        System.out.println("Enter the EmployeeId");
        int employeeId = scanner.nextInt();
        System.out.println("Enter the Employee");
        String employeeName = scanner .nextLine() ;
        System.out.println("Enter basic salary");
        double basicSalary = scanner . nextDouble() ;
        scanner .close() ;
        double HRA = basicSalary*10/100;
        double  DA = basicSalary*8/100 ;
        double  TA = basicSalary*9/100;
        double  PF= basicSalary*20/100;
        double grosssalary = basicSalary+HRA+TA+DA-PF;

        System.out.println("____________________________");
        System.out.println("|       Salary slip          |  ");
        System.out.println("____________________________");
        System.out.println("| Employee Id: " + employeeId +"| "  );
        System.out.println("| employee Name : " + employeeName+" |" );
        System.out.println("____________________________");
        System.out.println("| Basic Salary: " + basicSalary + " | ");
        System.out.println("| HRA 10% : " + HRA +"  |");
        System.out.println("| TA 8% : 2250.0 |");
        System.out.println("| DA 9% : 2000.0 |");
        System.out.println("| PF - 20& : 5000.0 |");
        System.out.println("____________________________");
        System.out.println("| Gross Salary : 26750.0 |");
        System.out.println("|===========================|");



    }
}

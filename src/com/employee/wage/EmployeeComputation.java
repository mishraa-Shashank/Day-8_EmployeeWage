package com.employee.wage;
public class EmployeeComputation {
    public static void main(String[] args) {


        int salary=0;
        WelcomeMessage.msg();
        WelcomeMessage attendance = new WelcomeMessage();
        if (attendance.attendance()==0){
            System.out.println("Employee is absent.");
        } else if (attendance.attendance()==1) {
            System.out.println("Employee is present for half day.");
            salary=WelcomeMessage.halfSalary();
        } else {
            System.out.println("Employee is present.");
            salary=WelcomeMessage.dailySalary();
        }
        System.out.println("Employee Salary is: "+salary);

    }
}

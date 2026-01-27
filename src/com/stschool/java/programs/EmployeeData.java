package com.stschool.java.programs;

import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter EmployeeId");
        int EmployeeId = sc.nextInt();
        System.out.println("Enter a Age");
        byte Age = sc.nextByte();
        System.out.println("Enter a DepartmentCode");
        char DepartmentCode = sc.next().charAt(0);
        System.out.println("Enter a MonthlySalary");
        double MonthlySalary = sc.nextDouble();
        System.out.println("Enter a Years Of Experience");
        short YearsOfExperience = sc.nextShort();
        System.out.println("Enter a MobileNumber");
        long MobileNumber = sc.nextLong();
        System.out.println("PermanentEmployee");
        boolean PermanentEmployee = sc.nextBoolean();
        System.out.println("Enter a PerformanceRating");
        float PerformanceRating = sc.nextFloat();
        System.out.println("EmployeeId : " + EmployeeId);
        System.out.println("Age : " + Age);
        System.out.println("DepartmentCode : " + DepartmentCode);
        System.out.println("MonthlySalary : " + MonthlySalary);
        System.out.println("YearsOfExpericence : " + YearsOfExperience);
        System.out.println("MobileNumber : " + MobileNumber);
        System.out.println("PermanentEmployee : " + PermanentEmployee);
        System.out.println("PerformanceRating : " + PerformanceRating);
        sc.close();


    }
}

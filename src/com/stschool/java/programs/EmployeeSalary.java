package com.stschool.java.programs;


import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeId, employeeName, basicSalary, hra, da, grossSalary, netSalary, giveAmount, ta, pf;
        System.out.println("Enter a employeeId");
        employeeId = sc.nextInt();
        System.out.println("Enter a emlpoyeeName");
        employeeName = sc.nextInt();
        System.out.println("Enter a basicSalary");
        basicSalary = sc.nextInt();
        System.out.println("Enter a hra");
        hra = sc.nextInt();
        System.out.println("Enter a da");
        da = sc.nextInt();
        System.out.println("Enter a grossSalary");
        grossSalary = sc.nextInt();
        System.out.println("netSalary");
        netSalary = sc.nextInt();
        System.out.println("giveAmount");
        giveAmount = sc.nextInt();
        System.out.println("Enter a ta");
        ta = sc.nextInt();
        System.out.println("Enter a pf");
        pf = sc.nextInt();
        hra = basicSalary * 20 / 100;
        da = basicSalary * 10 / 100;
        pf = basicSalary * 12 / 100;
        ta = basicSalary * 5 / 100;
        netSalary = grossSalary - (pf * ta);
        System.out.println("basicSalary is : " + basicSalary);
        System.out.println("hra is : + " + hra);
        System.out.println("da is : " + da);
        System.out.println("ta is : " + ta);
        System.out.println("netSalary is : " + netSalary);
        sc.close();


    }
}

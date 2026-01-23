package com.stschool.java.programs;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        byte subject1Marks, subject2Marks, subject3Marks, subject4marks, subject5Marks, subject6Marks;
        System.out.println("subject 1 marks");
        subject1Marks  = sc.nextByte();
        System.out.println("subject 2 marks");
        subject2Marks = sc.nextByte();
        System.out.println("subject 3 marks");
        subject3Marks = sc.nextByte();
        System.out.println("subject 4 marks");
        subject4marks = sc.nextByte();
        System.out.println("subject 5 marks");
        subject5Marks = sc.nextByte();
        System.out.println("subject 6 marks");
        subject6Marks = sc.nextByte();
        sc.close();

        float marks;
        marks = (float) (subject1Marks+subject2Marks+subject3Marks+subject3Marks+subject4marks+subject5Marks+subject6Marks)/6;
        System.out.println("The Marks is : " + marks);
        int averageMarks = 35;
        System.out.println(" Average marks  :" + averageMarks);
        if(marks>580) {
            System.out.println("o");
        }
        else if(marks>500){
            System.out.println("a+");
        }
        else if(marks>450){
            System.out.println("b+");
        }
        else if(marks>300){
            System.out.println("b");
        }
        else if(marks>250){
            System.out.println("c");
        } else  {
            System.out.println("D");
        }





    }

}

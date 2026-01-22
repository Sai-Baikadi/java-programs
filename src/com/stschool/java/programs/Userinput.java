package com.stschool.java.programs;
import java.util.*;
public class Userinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age");
        byte age = sc.nextByte();
        sc.close();
    }
}

package com.stschool.java.programs;

import java.util.Scanner;

public class PrintNumberFromNto1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=n;
        while(i>0) {
            System.out.println(i);
            i--;
        }
    }
}

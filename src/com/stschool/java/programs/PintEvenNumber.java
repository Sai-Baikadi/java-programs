package com.stschool.java.programs;
import java.util.Scanner;
public class PintEvenNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n % 2 != 0) {
                n--;
            }
            while (n >= 2) {
                System.out.println(n);
                n -= 2;
            }
        }
    }




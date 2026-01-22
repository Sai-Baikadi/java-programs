package com.stschool.java.programs;

import java.util.Scanner;

public class ProductPrice {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter productPrice");
         int productPrice = sc.nextInt();
         System.out.println("Enter discountPercentage");
         float discountPercentage = sc.nextFloat();
         final float STATE_TAX_Percentage = 2.5F;
         final float CENTRAL_TAX_Percentage = 2.5F;
         float discountAmount = productPrice*(discountPercentage/100);
         float productAmount = productPrice - discountAmount;
         float stateTax = productAmount*(STATE_TAX_Percentage/100);
         float centralTax = productAmount*(CENTRAL_TAX_Percentage/100);
         float finalProductAmount = productAmount+stateTax+centralTax;
         System.out.println("Discount Amount : " + discountAmount);
         System.out.println("Discounted Price : " + productAmount );
         System.out.println("state Tax : " + stateTax);
         System.out.println("central Tax : " + centralTax);
         System.out.println("final productPrice : " + finalProductAmount);
         System.out.println("Enter quantity");
         int quantity = sc.nextInt();
         double totalSaved = discountAmount*quantity;
         double totalAmount = productAmount*quantity;
         System.out.println("final bill : " + totalSaved);
         System.out.println(" totalSaved : " + totalAmount);
         sc.close();






     }
}

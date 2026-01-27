package com.stschool.java.programs;

import java.util.Scanner;

public class ChoiceStatement {
    public static void main(String[] args) {
        final float STATE_TAX_PERCENTAGE = 2.5F;
        final float CENTRAL_TAX_PERCENTAGE = 2.5F;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter productPrice");
        int productPrice = sc.nextInt();

        float discountPercentage;
        System.out.println("Enter membership type");
        char membershipType = sc.next().charAt(0);

        float shippingCharges;
        switch (membershipType) {
            case 'S':
                discountPercentage = 10;
                shippingCharges = 50;
                break;
            case 'G':
                discountPercentage = 15;
                shippingCharges = 20;
                break;
            case 'D':
                discountPercentage = 20;
                shippingCharges = 0;
                break;
            default:
                discountPercentage = 0;
                shippingCharges = 100;
        }


        float discountAmount = productPrice * (discountPercentage / 100);
        float productAmount = productPrice - discountAmount;
        float stateTax = productAmount * (STATE_TAX_PERCENTAGE / 100);
        float centralTax = productAmount * (CENTRAL_TAX_PERCENTAGE / 100);
        float finalProductAmount = productAmount + stateTax + centralTax;

        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Discounted Price : " + productAmount);
        System.out.println("state Tax : " + stateTax);
        System.out.println("central Tax : " + centralTax);
        System.out.println("shippingcharges : " + shippingCharges);
        System.out.println("final productPrice : " + finalProductAmount);

        System.out.println("Enter quantity");
        int quantity = sc.nextInt();

        double totalSaved = discountAmount * quantity;
        double totalAmount = productAmount * quantity + shippingCharges;

        System.out.println("totalSaved  : " + totalSaved);
        System.out.println("final bill : " + totalAmount);
        sc.close();


    }
}



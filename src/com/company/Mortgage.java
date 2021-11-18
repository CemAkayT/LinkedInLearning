package com.company;

import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //obtain values
        System.out.println("this program computes monthly" + "mortgage payments");
        System.out.print("loan amount: ");
        double loan = console.nextDouble();
        System.out.print("number of years: ");
        int years = console.nextInt();
        System.out.print("interest rate: ");
        double rate = console.nextDouble();

        // compute result
        int n = 12 * years;
        double c = rate /12/100;
        double payment = loan * c *Math.pow(1+c,n)/(Math.pow(1+c,n)- 1);
        System.out.println("monthly payment =  " + (int) payment);
        }
    }

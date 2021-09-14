package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class App
{
    public static void main(String[] args)
    {
        String choice;
        double F;
        double C;
        String answer;
        Scanner input = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.");

        System.out.println("Press F to convert from Celsius to Fahrenheit.");

        System.out.print("Your choice: ");
        choice = input.next();

        if(choice.equals("C") || choice.equals("c"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            F=input.nextDouble();
            C=(F-32)*5/9;
            BigDecimal rounding = new BigDecimal(C).setScale(0, RoundingMode.HALF_UP);
            C = rounding.doubleValue();
            answer="The temperature in Celsius is "+((int)C)+".";
            System.out.print(answer);

        }
        if(choice.equals("F") || choice.equals("f"))
        {
            System.out.print("Please enter the temperature in Celsius: ");
            C=input.nextDouble();
            F=(C*9/5)+32;
            BigDecimal rounding = new BigDecimal(F).setScale(1, RoundingMode.HALF_UP);
            F = rounding.doubleValue();
            answer="The temperature in Fahrenheit is "+((int)F)+".";
            System.out.print(answer);
        }

    }

}
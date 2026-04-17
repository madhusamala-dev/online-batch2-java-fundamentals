package com.java.fundamentals;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.in -> input source ( keyboard )
        //System.out.println(); console

        /*
        Utility Methods
        byte -> nextByte()
        short -> nextShort()
        int -> nextInt()
        long -> nextLong()
        float -> nextFloat()
        double -> nextDouble()
        boolean -> nextBoolean()
        char -> next().charAt(0)
         */
        System.out.println("Enter your age : ");
        byte age = scanner.nextByte();


        System.out.println("Enter your total marks: ");
        short totalMarks = scanner.nextShort();

        System.out.println("Enter your salary : ");
        int salary = scanner.nextInt();

        System.out.println("Enter Mobile Number : ");
        long mobileNo = scanner.nextLong();

        System.out.println("Enter your percentage : ");
        float percentage = scanner.nextFloat();

        System.out.println("Enter final price :");
        double finalPrice = scanner.nextDouble();

        System.out.println("Enter your gender : ");
        char gender = scanner.next().charAt(0);

        System.out.println("Enter your isLoggedIn : ");
        boolean isLoggedIn = scanner.nextBoolean();

        System.out.println("Age : " + age);
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Salary : " + salary);
        System.out.println("Mobile Number : " + mobileNo);
        System.out.println("Percentage : " + percentage);
        System.out.println("Final Price : " + finalPrice);
        System.out.println("Gender : " + gender);
        System.out.println("isLoggedIn : " + isLoggedIn);




        scanner.close(); //important step to close the scanner
    }
}

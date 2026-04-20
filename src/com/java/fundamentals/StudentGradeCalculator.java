package com.java.fundamentals;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Subject1 Marks : ");
        byte subject1Marks = scanner.nextByte();
        System.out.println("Enter Subject2 Marks : ");
        byte subject2Marks = scanner.nextByte();
        System.out.println("Enter Subject3 Marks : ");
        byte subject3Marks = scanner.nextByte();
        System.out.println("Enter Subject4 Marks : ");
        byte subject4Marks = scanner.nextByte();
        System.out.println("Enter Subject5 Marks : ");
        byte subject5Marks = scanner.nextByte();

        short totalMarks = (short) (subject1Marks + subject2Marks +
                        subject3Marks + subject4Marks + subject5Marks);
        System.out.println("Total Marks : " + totalMarks);
        float averageMarks = (float) totalMarks / 5;
        System.out.println("Average Marks : " + averageMarks);
        if( averageMarks >= 60)
            System.out.println("Grade : A");
        else if (averageMarks >= 50)
            System.out.println("Grade : B");
        else if (averageMarks >= 40)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : F");
    }
}

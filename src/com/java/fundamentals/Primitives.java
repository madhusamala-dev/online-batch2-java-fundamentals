package com.java.fundamentals;

public class Primitives {

    /*
        This method calculate the final price
        of the product given the price, discount percentage and the quantity
     */
    public static void main(String[] args) {
        /*
        * Primitives examples
        * byte variable declaration
        *
        * */
        byte age = 20; // just a variable declaration

        byte screenSize , replacementInDays;
        screenSize = 10;
        replacementInDays = 10;
        System.out.println("Age :" + age);

        System.out.println("Screen Size " + screenSize + " inches");

        byte teluguMarks, englishMarks, hindiMarks, mathsMarks;
        teluguMarks = 80;
        englishMarks = 90;
        hindiMarks = 70;
        mathsMarks = 90;
        System.out.println("Telugu Marks : " + teluguMarks);
        System.out.println("English Marks : " + englishMarks);
        System.out.println("Hindi Marks : " + hindiMarks);
        System.out.println("Maths Marks : " + mathsMarks);

        /*
        short
        - 2 bytes
        - range: -32,768 to 32,767
         */
        short totalMarks;
        totalMarks = 500;
        System.out.println("Total Marks : " + totalMarks);

        /*
        int
        - 4 bytes
        - range: -2,147,483,648 to 2,147,483,647
         */
        int salary;
        int productPrice;
        salary = 100000;
        productPrice = 92990;
        System.out.println("Salary : " + salary);
        System.out.println("Product Price : " + productPrice);

        /*
        long
        - 8 bytes
        - range
         */

        long companyAnnualRevenue;
        companyAnnualRevenue = 1000000000000000000L;
        System.out.println("Company Annual Revenue : " + companyAnnualRevenue);

        /*
        float - 4 bytes
        lowest numbers
        with less precision
         */
        float percentage;
        percentage = 10.5F;
        System.out.println("Percentage : " + percentage);

        /*
        234234.234
        double - 8 bytes
        highest numbers
        high precision
         */

        double totalPrice;
        totalPrice = 100000.5;
        System.out.println("Total Price : " + totalPrice);
        /*
        char - 2 bytes

         */
        char gender;
        gender = 'M';
        System.out.println("Gender : " + gender);

        char ch;
        ch = 97;
        System.out.println("ch : " + ch);

        boolean isLoggedIn;
        isLoggedIn = true;
        System.out.println("isLoggedIn : " + isLoggedIn);
    }
}

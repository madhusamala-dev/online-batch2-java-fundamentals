package com.java.fundamentals;

public class Operators {
    public static void main(String[] args) {
        //Assignment operation
        byte age = 20;
        byte castingAge;
        castingAge = age;
        System.out.println(castingAge);

        //Arithmetic operations
        byte no1 = 127;
        byte no2 = 127;
        short res;
        res = (short) (no1 + no2);
        System.out.println(res);

        no1 = 10;
        no2 = 20;
        System.out.println(no1 + no2);
        System.out.println(no1 - no2);
        System.out.println(no1 * no2);
        System.out.println(no1 / no2);
        System.out.println(no1 % no2);

        res = 10 + (20 - 30) * 40 / 50 % 60;
        System.out.println(res);

        /*byte discountPercentage = 10;
        discountPercentage = (byte) (discountPercentage + 10);
        System.out.println(discountPercentage);*/
        byte discountPercentage = 10;
         discountPercentage += 10;
        System.out.println(discountPercentage);

    }
}

package com.alex.homework;

public class Main {
    public static void main(String[] args) {
        byte first_number = 122;
        short second_number = 12235;
        int third_number = 1223312312;
        long fourth_number = 1544545412123L;
        float fifth_number = 12245.010f;
        double sixth_number = 12545456.2211584;
        char symbol = 'c';
        boolean isTrue = true;
        String name = "Alex";
        System.out.println("Result is: " + result(4.0f,0.23f,907.0f, 2354.3f));
        System.out.println("Result is: " + resultNumber(12,19));
        positiveOrNegativeNumber(124);
        positiveOrNegativeNumber(-123);
    }

    static float result(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    static boolean resultNumber(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum <= 20;
    }

    static void positiveOrNegativeNumber(int number) {
        if (number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Positive");
        }
    }



}

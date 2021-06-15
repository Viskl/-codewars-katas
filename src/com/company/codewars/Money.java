package com.company.codewars;

public class Money {
    public static void main(String[] args) {
        System.out.println(calculateYears(1000, 0.05,0.18, 1100));
    }
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int year = 0;
        double sum = principal;
        while(sum<desired){
            double income = sum * interest;
            sum = sum + income * (1- tax);
            year++;
        }
        return year;
    }
}


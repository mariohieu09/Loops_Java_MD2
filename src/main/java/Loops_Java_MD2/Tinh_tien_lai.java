package Loops_Java_MD2;

import java.util.Scanner;

public class Tinh_tien_lai {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interest_rate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = sc.nextDouble();
        System.out.println("Enter number of months: ");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interest_rate = sc.nextDouble();
        double total = 0;
        for(int i = 0; i < month; i++){
            total += money * (interest_rate/100/12) * month;
        }
        System.out.println("Total of interest is: " + total);
    }
}

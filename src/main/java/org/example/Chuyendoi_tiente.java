package org.example;

import java.util.Scanner;

public class Chuyendoi_tiente {
    public static void main(String[] args) {
        int vnd, usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        usd = sc.nextInt();
        vnd = usd * 23000;
        System.out.printf("%d usd equal to %d vnd.", usd, vnd);
    }
}

package org.example;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap can nang:");
        weight = sc.nextDouble();
        System.out.println("Nhap chieu cao:");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf(" %-20s%s", bmi, "Interpretation\n");
        if(bmi < 18.5){
            System.out.printf("%-20.2s%s",bmi, "Underweight");
        }else if(bmi >= 18.5 && bmi < 25.0){
            System.out.printf("%-20.2s%s",bmi, "Normal");
        }else if(bmi >= 25.0 && bmi < 30.0){
            System.out.printf("%-20.2s%s",bmi, "Fat");
        }else{
            System.out.printf("%-20.2s%s",bmi, "Obese");
        }
    }
}

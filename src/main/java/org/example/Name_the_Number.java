package org.example;

import java.util.Scanner;

public class Name_the_Number {
    public static void main(String[] args) {
        int num, tram, chuc, dv;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        num = sc.nextInt();
        dv = (num % 100)% 10;
        chuc = ((num% 100) - dv)/10;
        tram = (num - chuc - dv)/100;
        String sdv = String.valueOf(dv);
        String schuc = String.valueOf(chuc);
        String stram = String.valueOf(tram);

        switch(tram){
            case 1:
                stram = "One hundred";
                break;
            case 2:
                stram = "Two hundred";
                break;
            case 3:
                stram = "Three hundred";
                break;
            case 4:
                stram = "Four hundred";
                break;
            case 5:
                stram = "Five hundred";
                break;
            case 6:
                stram = "Six hundred";
                break;
            case 7:
                stram = "Seven hundred";
                break;
            case 8:
                stram = "Eight hundred";
                break;
            case 9:
                stram = "Nine hundred";
                break;
            default:
                stram = "";
        }
        switch (chuc){
            case 1:
                schuc = "teen";
                break;
            case 2:
                schuc = "twenty";
                break;
            case 3:
                schuc = "thirty";
                break;
            case 4:
                schuc = "fourty";
                break;
            case 5:
                schuc = "fifty";
                break;
            case 6:
                schuc = "sixty";
                break;
            case 7:
                schuc = "seventy";
                break;
            case 8:
                schuc = "eightty";
                break;
            case 9:
                schuc = "ninety";
                break;
            case 0:
                schuc = "and";
                break;
            default:
                schuc = "";
        }
        switch (dv){
            case 1:
                sdv = "one";
                break;
            case 2:
                sdv = "two";
                break;
            case 3:
                sdv = "three";
                break;
            case 4:
                sdv = "four";
                break;
            case 5:
                sdv = "five";
                break;
            case 6:
                sdv = "six";
                break;
            case 7:
                sdv = "seven";
                break;
            case 8:
                sdv = "eight";
                break;
            case 9:
                sdv = "nine";
                break;
            case 0:
                sdv = "";
                break;

        }
        if(chuc == 1){
            System.out.printf("%s and %s%s", stram, sdv, schuc);
        }else if(chuc == 0){
            System.out.printf("%s %s %s", stram, schuc, sdv);
        }else{
            System.out.printf("%s and %s %s", stram, schuc, sdv);
        }
    }
}

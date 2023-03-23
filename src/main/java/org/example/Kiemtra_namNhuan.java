package org.example;

import java.util.Scanner;

public class Kiemtra_namNhuan {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra: ");
        a = sc.nextInt();
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.printf("%d là nam nhuan", a);
                } else {
                    System.out.printf("%d khong phai la nam nhuan", a);
                }
            } else {
                System.out.printf("%d la nam nhuan ", a);
            }

        }else{
            System.out.printf("%d khong phai la nam nhuan", a);
        }
    }
}

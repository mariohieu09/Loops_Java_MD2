package Loops_Java_MD2;

import java.sql.Array;

public class Hien_thi_SNT {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 2; i < 1000; i++){
            if(checkPr(i) == 1){
                count++;
                System.out.println(i);
                if(count == 20){
                    break;
                }
            }
        }

    }
    public static int checkPr(int a){
        int check = 1;
        for(int b = 2; b < a; b++){
            if(a % b == 0){
                check = 0;
                break;
            }
        }
        return check;
    }
}

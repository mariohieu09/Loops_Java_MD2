package Loops_Java_MD2;

public class Checksnt {
    public static void main(String[] args) {

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

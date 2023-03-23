package Loops_Java_MD2;

public class SNT_100 {
    public static void main(String[] args) {
        int a = 2;
        int count = 0;
        for(a = 2; a < 1000; a++){
            if(Checksnt.checkPr(a) == 1){
                count++;
                System.out.println(a);
                if(count == 100){
                    break;
                }
            }
        }
        }
    }



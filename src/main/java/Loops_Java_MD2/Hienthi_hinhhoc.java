package Loops_Java_MD2;

public class Hienthi_hinhhoc {
    public static void main(String[] args) {
        for(int i = 0; i< 3; i++){
            System.out.println("*********");
        }
        for(int i = 1; i <= 5; i++){
            String nt = "";
            for(int j = 1; j <= i; j++){
                nt += "*";
            }
            System.out.println(nt);
        }
        for(int i = 5; i >= 1; i--){
            String nt = "";
            for(int j = 1; j <= i; j++){
                nt += "*";
            }
            System.out.println(nt);
        }

    }
}

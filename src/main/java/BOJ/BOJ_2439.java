package BOJ;

import java.util.Scanner;

public class BOJ_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1;i<n+1;i++){
            String star  = "*".repeat(i);
            String blank = " ".repeat(n-i);
            System.out.println(blank+star);
        }


    }
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder s = new StringBuilder();
        for(int i=1; i<n+1;i++){
            for(int j = n-i; j>0 ;j--){
                s.append(" ");
            }
            for(int k = 0; k<i;k++){
                s.append("*");
            }
            s.append("\n");
        }
        System.out.print(s);
    }

     */
}

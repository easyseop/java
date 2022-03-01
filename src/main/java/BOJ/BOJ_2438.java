package BOJ;

import java.util.Scanner;

public class BOJ_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder s = new StringBuilder();
        for(int i=1; i<n+1;i++) {
            for(int j = 0;j<i;j++){
                s.append("*");
            }
            s.append("\n");
        }
        System.out.print(s);
    }
}

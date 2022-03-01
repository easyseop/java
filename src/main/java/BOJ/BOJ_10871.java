package BOJ;

import java.util.*;
public class BOJ_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int s = sc.nextInt();

        for(int i = 0; i<h; i++){
            int num = sc.nextInt();
            if (num<s){
                System.out.print(num);
                System.out.print(' ');
            }
            }
        }

    }


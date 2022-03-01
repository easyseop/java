package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int[] arr1 = new int[a.length()];
        int[] arr2 = new int[b.length()];

        for(int i = 0; i<a.length(); i++){
            int k=a.charAt(i)-'0' ;
            arr1[i] = k;
        }

        for(int i = 0; i<b.length(); i++){
            int k=b.charAt(i)-'0' ;
            arr2[i] = k;

        }
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        System.out.println(arr2[2]*A);
        System.out.println(arr2[1]*A);
        System.out.println(arr2[0]*A);
        System.out.println(A*B);


    }
}

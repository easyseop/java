package lec02;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class dbdvm0324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] arr = new Integer[3];

        for(int i=0;i<3;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

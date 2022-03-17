package CP;

import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        System.out.println(n/100+(n%100)/10+n%10); //각 자릿수의 합

    }
}

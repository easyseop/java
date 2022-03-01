package BOJ;

import java.util.Scanner;

public class BOJ_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int N; int M;
            N = sc.nextInt();
            M = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n",i+1,N,M,N+M );
        }
    }
}

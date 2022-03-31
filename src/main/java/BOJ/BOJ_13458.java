package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_13458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] A = new long [n];
        for(int i =0;i<n;i++){
            A[i] = sc.nextInt();
        }


        long B = sc.nextInt();
        long C = sc.nextInt();
        long cnt = (long)n;

        long [] host_manager =new long [n];
        for(int j = 0;j<n;j++){
            host_manager[j] = A[j]-B;
        }

        for(int k =0; k<n;k++){
            if(host_manager[k]<=0){
                continue;
            }else{
                if(host_manager[k]%C==0){

                    cnt+=host_manager[k]/C;
                }else{
                    cnt+=host_manager[k]/C +1;
                }
            }
        }
        System.out.print(cnt);
    }
}

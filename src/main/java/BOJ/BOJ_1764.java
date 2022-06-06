package BOJ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k ;
        if (n<=m){
            k = n;
        }else{
            k = m;
        }
//        Set<String> set = new HashSet<String>();

        String[] lis = new String[n];
        String[] lis2 = new String[m];
        String[] answer = new String[k];
        int ans_idx = 0;
        for(int i = 0 ; i<n; i++){

            String str = sc.next();
//            set.add(str);
            lis[i] = str;
        }

        for(int j = 0 ; j<n; j++){
            String str = sc.next();
            lis2[j] = str;
//            set.add(str);
        }

        if(n<=m){
            for(int i=0;i<lis.length;i++){
                String str = lis[i];
                if (Arrays.asList(lis2).contains(str)==true){
                    answer[ans_idx++] = str;

                }
            }
        }else{
            for(int i=0;i<lis2.length;i++){
                String str = lis2[i];
                if (Arrays.asList(lis).contains(str)==true){
                    answer[ans_idx++] = str;
                }
            }
        }



        for(int i = 0; i<ans_idx ; i++){
            System.out.println(answer[i]);
        }
    }
}

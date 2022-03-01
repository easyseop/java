package BOJ;

import java.util.Scanner;

public class BOJ_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time;
        if(m<45){
            time = 45-m;
            m = 60-time;
            if(h==0){
                h = 23;
            }else{
                h = h-1;
            }
        }else{
            m = m-45;
        }

        System.out.printf("%d %d",h,m);



    }

}

package BOJ;

import java.util.Scanner;

public class BOJ_2525 {
    public static void main(String[] args) {
        int h; int m; int time;
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        m = sc.nextInt();
        time = sc.nextInt();

        h += time/60;
        time=time%60;
        m += time;
        if(m>=60){
            h+=1;
            m-=60;
        }
        if(h>=24){
            h-=24;
        }
        System.out.printf("%d %d",h,m);
    }
}

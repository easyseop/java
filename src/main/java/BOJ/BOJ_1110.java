package BOJ;

import java.util.Scanner;

public class BOJ_1110 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        int a =  Character.getNumericValue(str.charAt(0));
        int b =  Character.getNumericValue(str.charAt(1));
        int c;
        System.out.println(Integer.parseInt(str));
        int cnt = 0;
        while(true){
            if((a+b)>=10){
                c = (a+b)%10;
                a = b;
                b = c;
            }else{
                c = a+b;
                a = b;
                b = c;
            }

            cnt+=1;
            if(a*10+b == Integer.parseInt(str)) {
                System.out.print(cnt);
                break;
            }
        }
    }
}

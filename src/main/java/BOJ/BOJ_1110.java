package BOJ;

import java.util.Scanner;

public class BOJ_1110 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        int a;
        int b;
        if (str.length()<2){
            a=0;
            b=Character.getNumericValue(str.charAt(0));

        }else{
            a =  Character.getNumericValue(str.charAt(0));
            b =  Character.getNumericValue(str.charAt(1));
        }

        int c;

        int cnt = 0;
        while(true){

            if(str=="0"){
                System.out.println(0);
                break;
            }
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

package 이지섭_2017112513_0331;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int j = sc.nextInt();

        for(int i=32;i<j;i++){
            System.out.print((char)i+" ");
            cnt+=1;
            if(cnt%16 ==0){
                System.out.println();

            }
        }











        }



    }


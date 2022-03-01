package lec02;

import java.util.Scanner;

public class class9 {
    public static void main(String[] args) {
        // for 문
        for(int i=0;i<9;i++){
            System.out.println(i);
        }

        System.out.print("INPUT NUMBER : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<10; i++){
            System.out.printf("%d * %d = %d",num,i,num*i);
            System.out.println();
        }

        // while 문

        int j = 1;
        System.out.print("INPUT NUMBER : ");
        int num2 = sc.nextInt();
        while (j<10){
            System.out.printf("%d * %d  = %d\n",num2,j,j*num2);
            j++;
        }

        // do while 문
        do{
            System.out.println("최초 한번은 무조건 실행");
        }while (false); // do 실행 후 while문이 참이면 계속 실행
    }
}

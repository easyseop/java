package practice.이지섭_2017112513_0331;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
    Scanner sc = new Scanner((System.in));
    int n;
    int[] arr  = new int[10];
    boolean flag = false;

    int cnt=0;
    System.out.println("[menu]");
    System.out.println("0 : exit");
    System.out.println("1 : input (array)");
    System.out.println("2 : show (array)");
    System.out.println("3 : menu ");

    while(true){
        n = sc.nextInt();
        if(n==1){
            System.out.print("정수 (개수,값) > ");

            cnt = sc.nextInt();
            for(int i=0; i<cnt;i++){
                arr[i] = sc.nextInt();
            }

            flag = true;

            System.out.println("입력 완료");
        }else if(n==2){
            if(flag){
                for(int i=0;i<cnt;i++){
                    System.out.print(arr[i]+" ");

                }
                System.out.println();
            }else{
                System.out.println(" ");
            }
        }else if(n==3){
            System.out.println("[menu]");
            System.out.println("0 : exit");
            System.out.println("1 : input (array)");
            System.out.println("2 : show (array)");
            System.out.println("3 : menu ");
        }else{
            System.out.println("종료 되었습니다.");
            break;
        }

    }












        }



    }


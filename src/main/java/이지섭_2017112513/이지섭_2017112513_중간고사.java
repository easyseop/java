package 이지섭_2017112513;

import java.util.Scanner;

public class 이지섭_2017112513_중간고사 {
    public static void main(String[] args) {
        System.out.println("201711513 이지섭");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("개수 입력>");
        int star = sc.nextInt();



        for(int i=1;i<star+1;i++){
            for(int j=star;j>0;j--){
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        System.out.println("양의 정수(개수,값) 입력 : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int max_idx = 0;
        int max = 0;
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max= arr[i];
                max_idx = i;
            }
        }

        arr[max_idx] = arr[size-1];
        arr[size-1] = max;

        System.out.println("max= "+max);
        for(int i=0; i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int len = 0;
        System.out.print("정수(1~100,000) 입력>");
        int number = sc.nextInt();
        int array[] = {100000, 10000, 1000, 100, 10, 1};
        for (int i = 0; i < 6; i++) {
            if (number != number % array[i]) {
                len = array[i];
                break;
            }

        }
        int ans = -1;
        int cnt = 0;
        while(true){
            int s = 0;

            while (true){

                int a = number/len;
                s+=a;

                if(len==1){
                    break;
                }
                number = number%len;
                len = len/10;


            }
            cnt+=1;

            System.out.println(s);


            if (1<=s && s<10){
                ans = s;
                break;
            }else{
                number = s;
                for (int i = 0; i < 6; i++) {
                    if (number != number % array[i]) {
                        len = array[i];
                        break;
                    }

                }
            }
        }

        if(cnt==1){
            System.out.println(ans);
        }

    }
}

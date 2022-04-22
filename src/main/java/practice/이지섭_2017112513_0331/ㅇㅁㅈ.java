package practice.이지섭_2017112513_0331;

import java.util.Arrays;
import java.util.Scanner;

public class ㅇㅁㅈ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[50];
        int cnt = 0;
        System.out.print("0을 입려ㅑㄱ하며 ㄴ종료 > ");
        for (int i = 0; i < 40; i++) {
            int n = sc.nextInt();
            cnt += 1;
            if (n == 0) {
                break;
            }
            arr[i] = n;
        }
        int max = 0; //현재 최대값
        int index =0;
        for (int i = 0; i < cnt; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }

        }
//        arr[cnt-1] -> 33
        arr[index] = arr[cnt-1];
        arr[cnt-1] = max;


    }
}





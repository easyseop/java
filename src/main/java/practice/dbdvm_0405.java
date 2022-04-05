package practice;

import java.util.Arrays;
import java.util.Scanner;

public class dbdvm_0405 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner((System.in));
//
//        int A[] = new int[5];
//
//        int max = 0;
//        for(int i=0;i<5;i++){
//            A[i] = sc.nextInt();
//            if(A[i]>max){
//                max = A[i];
//            }
//        System.out.println(max);
//        }


        int size; // 입력할 정수의 개수

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();

        int arr[] = new int[size+1]; // 한 칸씩 뒤로 밀기 때문에 1큰 배열 생성
        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println("배열 입력 끝");

        int idx = sc.nextInt();
        int value = sc.nextInt();
        //for 문에서 범위를 size로 두고 배열 입력 후 size++로 size를 증가시키는 방법도 있음
        int index  = size-1;
        while(true){

            if(index!=idx){
                arr[index+1] = arr[index];
            }else{
                arr[index+1] = arr[index];
                arr[idx] = value;
                break;
            }
            index -=1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

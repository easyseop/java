package practice.이지섭_2017112513_0331;

import java.util.Scanner;

public class midterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int cnt = 0;
//        for(int i=0;i<n;i++){
//            System.out.print("이지섭"+" ");
//            cnt+=1;
//            if(cnt%5==0){
//                System.out.println();
//            }
//        }   1번 문제
//        int idx= 0;
//        int[] arr = new int[100];
//        while(true){
//            int N = sc.nextInt();
//            if(N == 0){
//                break;
//            }
//            arr[idx] = N;
//            idx +=1; // 반복문이 끝나면 idx는 마지막 값이 된다
//
//        }
//        for(int i=0;i<idx;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        int max = 0;
//        for(int i=0;i<idx;i++){
//            if (arr[i]>max) {
//                max = arr[i];
//            }
//        }
//        int max_idx = 0;
//
//        for(int i = 0 ; i<idx;i++){
//            if(arr[i]==max){
//                max_idx = i;
//            }
//        }
//
//        arr[max_idx] = arr[idx-1];
//        arr[idx-1]  = max;
//        for(int i=0;i<idx;i++){
//            System.out.print(arr[i]+" ");
//        }

        System.out.println("=== menu ===");
        System.out.println("1. 좌표 입력 ");
        System.out.println("2. 사각형 영역 안에 있는가? ");
        System.out.println("3 . 메뉴");
        System.out.println("4 . 종료");
        int x=0;
        int y=0;

        while(true){
            int num = sc.nextInt();
            switch(num) {
                case 1:
                    System.out.print("x,y 좌표 입력 > ");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    break;
                case 2:
                    if ((x >= 50 && x <= 100) && (y >= 50 && y <= 100)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("NO");
                    }
                    break;
                case 3:
                    System.out.println("=== menu ===");
                    System.out.println("1. 좌표 입력 ");
                    System.out.println("2. 사각형 영역 안에 있는가? ");
                    System.out.println("3 . 메뉴");
                    System.out.println("4 . 종료");
                    break;

                default:
                    break;
            }

            if(num == 4){
                break;
            }

        }




    }
}

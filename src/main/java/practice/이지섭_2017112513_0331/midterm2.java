package practice.이지섭_2017112513_0331;

import java.util.Scanner;

public class midterm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if (num % 6 ==0){
//            System.out.println("이지섭 성공");
//        }else{
//            System.out.println("이지섭 실패");
//        }
//
//        System.out.println("=== menu ===");
//        System.out.println("0. 종료");
//        System.out.println("1. 아스키 번호 입력");
//        System.out.println("2. 아스키 번호 출력");
//        System.out.println("3. 번호의 다음 문자 출력");
//        int number = 0;
//        while(true){
//
//            int n = sc.nextInt();
//
//            switch(n){
//
//                case 1:
//                    System.out.print("번호입력 > ");
//                    number = sc.nextInt();
//                    break;
//
//                case 2:
//                    System.out.println(number);
//                    break;
//
//                case 3:
//                    System.out.println((char)number);
//
//                default:
//                    break;
//
//            }
//            if (n == 0){
//                break;
//            }


        System.out.print("개수, 값 입력 > ");
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];

        for(int i =0;i<cnt;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for(int i=0;i<cnt;i++){
            int count = 0;
            for(int j=i+1;j<cnt;j++){
                if(arr[i]<arr[j]){
                    count+=1;
                }
                if (count == 2) {
                    flag = true;
                    break;
                }

            }
        if (flag == true){
            break;
        }
        }

        if(flag == true){
            System.out.println(0);
        }else{
            System.out.println(1);

        }








        }














    }


package practice.이지섭_2017112513_0331;

import java.util.Scanner;

public class dlgkrrl_wkfqhwk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        if(n%6 ==0){
//            System.out.println("이지섭 성공");
//        }
//        else{
//            System.out.println("이지섭 실패");
//        }
//
//        System.out.println("=== menu ===");
//        System.out.println("1. 아스키 번호 입력");
//        System.out.println("2. 아스키 번호 출력");
//        System.out.println("3. 번호의 다음 문자 출력");
//        int asc = 0;
//        boolean flag = true;
//        while(true){
//
//
//
//            int num = sc.nextInt();
//            if (flag == false){
//                break;
//            }
//            switch(num){
//                case 1:
//                    System.out.println("번호입력> ");
//                    asc = sc.nextInt();
//                    break;
//                case 2:
//                    System.out.println(asc);
//                    break;
//                case 3:
//                    System.out.println((char)(asc+1));
//                    break;
//                default:
//                    flag = false;
//                    break;
//
//            }
//
//
//        }




        int len = sc.nextInt();
        int[] arr = new int [len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();

        }

        int cnt = 0;
        boolean flag2 = false;
        for(int i=0;i<len;i++){
            cnt = 0;
            for(int j=i+1;j<len;j++){
                if (arr[i]<arr[j]){
                    cnt+=1;
                }
                if (cnt>=2){
                    flag2 = true;
                    break;
                }
            }
            if (flag2==true){
                break;
            }
        }

        if (flag2 == true){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}

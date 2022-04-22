package practice.이지섭_2017112513_0331;

import java.util.Arrays;
import java.util.Scanner;

public class wkfqhwk {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        //1
        String name = "이지섭 ";
        int n = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            System.out.print(name);
            count +=1 ;
            if (count % 5==0){
                System.out.println();
            }
        }


        //2
//        System.out.println("===menu===");
//        System.out.println("1. 좌표 입력");
//        System.out.println("2. 사각혀 영역안에 있는가? ");
//        System.out.println("3. 메뉴");
//        System.out.println("4. 종료");
//        int x =0;
//        int y =0;
//        boolean flag = true;
//        while(true){
//            if (flag==false){
//                break;
//            }
//            int num = sc.nextInt();
//            switch(num){
//                case 1:
//                    System.out.print("x,y 좌표 입력 > ");
//                    x = sc.nextInt();
//                    y = sc.nextInt();
//                    break;
//                case 2:
//                    if ((50<=x & x<=100) &(50<=y & y<=100)){
//                        System.out.println("Yes");
//                    }else{
//                        System.out.println("NO");
//                    }
//                    break;
//                case 3:
//                    System.out.println("===menu===");
//                    System.out.println("1. 좌표 입력");
//                    System.out.println("2. 사각혀 영역안에 있는가? ");
//                    System.out.println("3. 메뉴");
//                    System.out.println("4. 종료");
//                    break;
//                default:
//                    flag = false;
//
//            }
//
//
//
//        }

    //3


        int[] arr = new int[100];
        int cnt =0;
        for(int i = 0;i<40;i++){
            n = sc.nextInt();
            if (n==0){
                break;
            }
            arr[i] = n;
            cnt+=1;
        }

        int max = 0;
        int max_idx = -1;
        for(int i=0;i<cnt;i++){
            if (arr[i]>max){
                max=arr[i];
                max_idx = i;

            }
        }

        System.out.println(Arrays.toString(arr));

        arr[max_idx] = arr[cnt-1];
        arr[cnt-1] = max;


        System.out.println(Arrays.toString(arr));


    }
}

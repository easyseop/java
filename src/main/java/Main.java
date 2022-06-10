import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



//중복 없을 떄
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int count = 0;

            boolean flag = true;
            while (count<num){
                int n = (int)(Math.random()*90+10);  // 니가 생각하셈
                for(int j = 0; j<count;j++){
                    if (arr[j]==n){
                        flag = false;
                    }
                }
                if(flag==true){
                    arr[count]=n;
                    count+=1;
                }else{
                    flag = true;
                }
            }

            for(int i=0;i<num;i++){
                System.out.print(arr[i]+" ");
            }


        ArrayList<Integer> arraylist= new ArrayList<>();
        for(int i= 0; i<arr.length; i++){
            arraylist.add(arr[i]);
        }
        Collections.sort(arraylist);
        Collections.reverse(arraylist);
        System.out.println();
        for(int i= 0; i<arr.length; i++){
            System.out.print(arraylist.get(i)+" ");
        }


    }

}

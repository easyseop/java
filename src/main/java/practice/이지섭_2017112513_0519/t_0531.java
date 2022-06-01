package practice.이지섭_2017112513_0519;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;




class Arrlist<E>{ //E는 제네릭함수
    private int[] a;
//    private E[] a; 제네릭 함수일때 이렇게 쓴다
    private int size;

    Arrlist(){
        size = 0;
        a = new int[50];
//        a = (E[]) new Object[50];

    }

    int size(){
        return size;
    }

    int get(int pos){
//    E get(int pos){
            return a[pos];
    }

    void add(int val){
        a[size++]=val;
//        a[size] = val;
//        size+=1;
    }



}






public class t_0531 {
    public static void main(String[] args) {
        // 1. 기본형 배열
        int [] arr = {60,10,5,50,90,7,7,100};

        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }

        Arrays.sort(arr);
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        Arrlist myarr = new Arrlist();



        // 2. 컬렉션

        ArrayList<Integer> arr2 = new ArrayList<>();

        arr2.add(5);
        arr2.add(4);
        arr2.add(-1);
        arr2.add(0,100);
        System.out.println();
        System.out.println("요소의 개수 : "+arr2.size());
        for(int i=0;i<arr2.size();i++){
            System.out.print(arr2.get(i)+" ");
        }
        System.out.println();

        ArrayList<String> srr = new ArrayList<>();
        srr.add("orange");
        srr.add("apple");
        srr.add("banana");
        srr.add("kiwi");

        System.out.println(srr);




    }
}

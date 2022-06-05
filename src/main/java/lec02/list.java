package lec02;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<String>();
        //데이터 추가
        list2.add("hello");
        list2.add("world");
        list2.add("java");


        list2.add(2,"programing");
        list2.set(1,"c");

        //데이터 추출 및 호출
        String str = list2.get(2);

        //데이터 제거
        str = list2.remove(2);

        //데이터 전체 제거
//        list2.clear();

        //데이터 유무
        boolean b = list2.isEmpty();


        for(int i=0; i<list2.size();i++){
            System.out.print(list2.get(i) +" ");
        }
    }
}

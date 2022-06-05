//package practice.이지섭_기말고사대비;
//
//import java.util.Random;
//
//class Examplee{
//
//    void plot(int n){
//        for(int i = 0;i<n;i++){
//            for(int j =n-i;j>=1;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    void plot(char str,int n){
//        for(int i = 0;i<n;i++){
//            for (int k=0;k<i;k++){
//                System.out.print(" ");
//            }
//
//            for(int j =n-i;j>=1;j--){
//                System.out.print(str);
//
//            }
//            System.out.println();
//        }
//
//    }
//
//    void rand_alpha(int n){
//        Random random = new Random();
//        String s = "";
//        for(int i = 0; i<n; i++){
//            int a = random.nextInt(26)+97;
//            System.out.print((char)a);
//        }
//
//
//    }
//
//    void times(int n , String str){
//        int len = str.length();
//        for(int i = 0; i<len;i++){
//            String s = str.substring(i,i+1);
//            for(int j = 0; j<n;j++){
//                System.out.print(s);
//            }
//
//        }
//    }
//
//    static boolean toggle(boolean flag){
//        if(flag==true){
//            return false;
//        }else{
//            return true;
//        }
//
//    }
//
//
//}
//
//class Goods{
//    private int price;
//    Goods(int p){
//        this.price = p;
//    }
//
//    int get_price(){
//        return price;
//     }
//
//}
//class Printer extends Goods{
//
//    private boolean side ;
//    Printer(boolean flag, int p) {
//        super(p);
//        this.side= flag;
//    }
//
//    void show(){
//        System.out.println("양면 출력 기능이 있다 : "+side);
//        System.out.println("책상 가격은 "+get_price()+"원");
//    }
//}
//
//
//
//
//
//public class final_2021 {
//    public static void main(String[] args) {
//        Example ex = new Example();
//        ex.plot(4);
//        System.out.println((int)'z');
//        ex.plot('#', 5);
//        ex.rand_alpha(7);
//        System.out.println();
//        ex.times(3, "ABC");
//        System.out.println();
//        System.out.println( Example.toggle(false) );
//        System.out.println();
//
//        Goods desk = new Goods(300000);
//        System.out.println("책상 가격은 "+desk.get_price()+"원");
//        System.out.println();
//        Printer hp = new Printer(true, 200000);
//        hp.show();
//
//    }
//}

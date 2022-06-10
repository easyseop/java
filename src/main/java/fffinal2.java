//class Example{
//    void plot(int n){
//        for(int i=n;i>=0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }
//    void plot(char c, int n){
//        String s = Character.toString(c);
//        for(int i=n;i>=0;i--){
//
//
//
//            for(int j=0;j<n-i;j++){
//                System.out.print(" ");
//            }
//
//            for(int k= 0; k<i;k++)
//                System.out.print(s);
//            System.out.println();
//
//        }
//    }
//
//    void rand_alpha(int n){
//        for(int i = 0;i<n;i++){
//            int num = (int)(Math.random()*26 + 97);
//            System.out.print((char)num);
//        }
//    }
//
//    void times(int n, String s){
//        for(int i = 0; i<s.length();i++){
//            String sub = s.substring(i,i+1);
//            for(int j=0;j<n;j++){
//                System.out.print(sub);
//            }
//        }
//    }
//
//    static boolean toggle(boolean flag){
//        if (flag==true){
//            return false;
//        }else{
//            return true;
//        }
//
//    }
//
//}
//
//public class fffinal2 {
//    public static void main(String[] args) {
//        Example ex = new Example();
//        ex.plot(4);
//        ex.plot('#',4);
//        ex.rand_alpha(7);
//        System.out.println();
//        ex.times(3, "ABC");
//        System.out.println( Example.toggle(false) );
//
//    }
//
//}
//
//
////int num = 0;
////int sum = 0;
////Scanner sc = new Scaner(system.in);
////num = sc.nextInt();
////
////while(num!=0){
////        //num을 10으로 나눈 나머지를 sum에 더한다.
////    sum+= num%=10;
////        //num을 10으로 나눈 값을 다시 num에 저장한다.
////
////    num/=10;
//
//        }

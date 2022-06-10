//class Practice{
//    void random3(int n ){
//        for(int i=0;i<n;i++){
//            int r = (int)(Math.random()*33 + 1);
//            System.out.print(3*r+" ");
//        }
//    }
//
//    static void div10(int n){
//        System.out.println(n%10);
//    }
//
//    void last_word(String str){
//        String[] arr;
//        arr = str.split(" ");
//        System.out.println(arr[arr.length-1]);
//
//    }
//
//    void max_no(int n){
//        String s = Integer.toString(n);
//        int M = 0;
//        String[] arr = s.split("");
//        for(int i=0;i<s.length();i++){
//            if (Integer.parseInt(arr[i])>M){
//                M = Integer.parseInt(arr[i]);
//            }
//        }
//        System.out.println(M);
//    }
//}
//
//
//
//class TV{
//    private int channel;
//    TV(int n){
//        channel = n;
//    }
//    int get_channel(){
//       return channel;
//    }
//}
//
//
//class AI_TV extends TV{
//    private String name;
//    AI_TV(String name, int n) {
//        super(n);
//        this.name = name;
//
//    }
//
//    void command(String n){
//        if (name.equals(n)){
//            System.out.println("주인님! 현재 채널은 "+get_channel()+"번");
//        }else{
//            System.out.println("주인님 저는 "+n+"가 아니에요.");
//        }
//    }
//}
//
//public class fffinal {
//    public static void main(String[] args) {
//        Practice ex = new Practice();
//        ex.random3(7);
//
//        Practice.div10(2973);
//        System.out.println( lower('H'));
//
//        ex.last_word("What's your name?");
//        ex.last_word("I am a boy");
//
//        ex.max_no(18670725);
//        ex.max_no(20030615);
//
//
//        TV lg = new TV(7);
//        System.out.println("현재채널은 "+lg.get_channel()+"번");
//
//
//        AI_TV siri = new AI_TV("시리야", 7);
//        siri.command("시리야"); // AI의 이름과 같은 경우
//        siri.command("누구");
//    }
//
//    static String lower(char c){
//        String s = Character.toString(c);
//        return s.toLowerCase();
//    }
//
//}


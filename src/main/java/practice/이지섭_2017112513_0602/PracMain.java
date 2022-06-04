package practice.이지섭_2017112513_0602;

public class PracMain {
    public static void main(String[] args) {
        Practice ex = new Practice();
        ex.random3((7));

        System.out.println("--- div10 --- ");
        Practice.div10(2973);

        System.out.println("--- lower ---");
//        System.out.println(lower("H"));

        System.out.println("--- last word --- ");
        ex.last_word("What's your name?");
        ex.last_word("i am a boy");

        System.out.println("--- max_no --- ");
        ex.max_no(18123213);

        System.out.println("2번-----------");
        TV lg = new AI_TV("siri",3);
        System.out.println("현재채널은 "+lg.get_channel()+"번");


        System.out.println("3번------------");
        AI_TV siri = new AI_TV("시리야",7);
        siri.command("시리야");
        siri.command("누구");
    }
}

package practice;



public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        System.out.println("제한속도 = "+ quiz.get_speed_limit()+"km");
        String source = "The old man and the sea";

        System.out.println(quiz.count(source,"he"));
    }



}



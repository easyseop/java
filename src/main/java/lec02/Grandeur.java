package lec02;

public class Grandeur {
        public String color; //멤버변수
        public String gear;
        public int price;

        public Grandeur() {
            System.out.println("Grandeur constructor");
        }
        public void run() { // void는 반환값이 없다는 뜻. 반환값이 필요하면 Public String Int 등
            System.out.println("--run--");
        }

        /*
        public String run(){
            return "Hello world"
        }
         */
        public void stop(){
            System.out.println("--stop--");
        }

        public void info(){
            System.out.println("--info()--");
            System.out.println("color : "+color);
            System.out.println("price : "+price);

    }}


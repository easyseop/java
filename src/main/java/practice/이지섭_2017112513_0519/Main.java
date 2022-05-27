//package practice.이지섭_2017112513_0519;
//
//class Car {
//    public Car(){
//        System.out.println("차");
//    }
//
//    public Car(int fare){
//        System.out.println("차2");
//    }
//    private int speed;
//    void setSpeed(int speed){
//        this.speed = speed;
//    }
//
//    int getSpeed(){
//        return speed;
//    }
//
//}
//
//
//class taxi extends Car{
//    private int fare;
//    public taxi(){
//
//    }
//    public taxi(int fare){
//        super(fare);
//        this.fare = fare;
//        System.out.println("택시");
//    }
//
//    void show(){
//        System.out.println("현재 요금은 "+fare+"원");
//        getSpeed();
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//
//        Car sonota = new Car();
//        sonota.setSpeed(100);
//        System.out.println("현재 자동차의 속도는" +sonota.getSpeed()+"km");
//
//        taxi yellow = new taxi(7000);
//        yellow.setSpeed(70);
//        yellow.show();
//    }
//}

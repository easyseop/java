package practice.이지섭_2017112513_0519;

class Fish extends Animal{
    private double depth;
     Fish(String feed,double depth) {
        super(feed);
        this.depth = depth;
    }


    void show(){
        System.out.print("먹은 것 ");
        get_feed();
        System.out.print(" 수심 "+depth+"m");
    }
}

public class Main_animal{
    public static void main(String[] args) {

    Animal Tiger = new Animal("토끼");
    System.out.print("먹은 것 ");
    Tiger.get_feed();
    System.out.println();



    Fish Shark = new Fish("참치",30);
    Shark.show();

    }
}

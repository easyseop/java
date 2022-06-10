package 이지섭_2017112513;

class Example{
    void plot(int n){
        for(int i=n;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void print10(int n){
        n = n/10;
        System.out.println(n%10);
    }

    int count(String str,char c){
        String s = Character.toString(c);
        int cnt = 0;
        for(int i = 0; i<str.length();i++){
            if (str.substring(i,i+1).equals(s)){
                cnt+=1;
            }
        }
        return cnt;
    }

    void note(String str){
        for(int i=0; i<str.length(); i++){
            if (str.substring(i,i+2).equals("//")){
                System.out.println(str.substring(i+2));
                break;
            }
        }
    }

    }



public class Main {
    public static  void main(String[] args) {
        //1-1번
        Example ex = new Example();
        ex.plot(4);
        //1-2번
        Example.print10(29673);

        //1-3번
        System.out.println(ex.count("I go to school",'o'));

        //1-4번
        ex.note("c=a/b; //divide");
        ex.note("c=a*b; /// multiply");


        //2-1번
        Goods mp3 = new Goods();
        mp3.set_weight(8);
        System.out.println("현재 상품 중량은 "+mp3.get_weight()+"kg");

        //2-2번
        mp3.rand_weight();
        System.out.println("현재 상품 중량은 "+mp3.get_weight()+"kg");

        //3-1번
        Drone DJI = new Drone(5);
        DJI.check_weight(mp3);

    }

}

class Goods{
    private int weight;
    Goods(){

    }
    void set_weight(int w){
        weight = w;
    }
    int get_weight(){
        return weight;
    }

    void rand_weight(){
        int n = (int)(Math.random()*10 + 1);
        weight = n;
    }
}

class Drone{
    private int max_weight;
    Drone(int n){
        max_weight = n;
    }

    void check_weight(Goods g){

        if (g.get_weight()<=max_weight){

            System.out.println("배송 가능");
        }else{
            System.out.println("배송 불가능");
        }

    }
}
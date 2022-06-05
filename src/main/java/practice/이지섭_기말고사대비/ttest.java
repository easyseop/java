package practice.이지섭_기말고사대비;

class Goods{
    private int price;

    Goods(int n){
        price = n;
    }
    int get_price(){
        return price;
    }

}

class Printer extends Goods{
    private boolean t;
    Printer(boolean t , int n) {
        super(n);
        this.t = t;
    }

    void show(){
        System.out.println("양면 출력 기능이 있다 : "+t);
        System.out.println("프린터 가격은 "+get_price()+"원");   }
}






public class ttest {
    public static void main(String[] args) {

        Printer hp = new Printer(true, 200000);
        hp.show();
    }

}

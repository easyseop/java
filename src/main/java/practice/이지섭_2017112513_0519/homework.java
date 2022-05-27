package practice.이지섭_2017112513_0519;
class Car{
    private int curr_oil;

    public void set_Gas(int w){
        curr_oil+=w;
    }
    public void show(){

        System.out.println("현재 주유량 : "+curr_oil+"L");
    }

    public void fill_gas(int gas, GasStation gs){
        curr_oil = curr_oil + gas;
        gs.sell(gas);
    }
}

public class homework {
    public static void main(String[] args) {
        System.out.println("자동차와 주유소");
        Car SM5 = new Car();
        GasStation GS = new GasStation();

        SM5.set_Gas(10);
        GS.set_Gas(500);

        SM5.show();
        GS.show();

        SM5.fill_gas(50,GS);

        SM5.show();
        GS.show();

        SM5.fill_gas(460,GS);










    }
}

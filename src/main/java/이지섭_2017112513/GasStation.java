package 이지섭_2017112513;

class GasStation {

    private int oil_weight;


    public int  sell(int weight){
        if (oil_weight<weight){
            System.out.println("주유 실패");
        }else {
            oil_weight = oil_weight - weight;
        }
        return weight;
    }

     void set_Gas(int w){
        oil_weight = w;
    }

    public void show() {
        System.out.println("현재 재고량 :" + oil_weight + "L");
    }
}

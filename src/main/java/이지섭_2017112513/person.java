package 이지섭_2017112513;

public class person {

    private double temp;
    private int period;

    person(){}
    person(double temp){
        this.temp = temp;
    }

     void set_temp(double t){
        temp = t;
    }


    public boolean judgement() {
        if (temp >= 37.5) {
            return true; //true이면 자가진단키트를 사용해야함
        } else {
            return false;
        }
    }

        public void isolation(Kit kit){
            if (kit.isolation()){
                period = 7;
                kit.set_release("격리");
        }else{
                period = 0;
            }
    }
        public void show_period(Kit kit){
            if (period>0) {
                System.out.println("현재 남은 격리 기간은 "+period+"일 입니다.");
                System.out.println("격리를 해제할 수 없습니다\n");
            }else{
                System.out.println("현재 남은 격리 기간은 0일 입니다.");
                System.out.println("격리를 해제하고 일상 생활이 가능합니다.");
                kit.set_release("해제");
                System.out.println("\n");}

    }
        public void day(){
            period-=3;
        }
        public void day(int time){
        period-=time;
    } //생성자 오버로딩


}



//    public int  sell(int weight){
//        if (oil_weight<weight){
//            System.out.println("주유 실패");
//        }else {
//            oil_weight = oil_weight - weight;
//        }
//        return weight;
//    }
//
//    void set_Gas(int w){
//        oil_weight = w;
//    }
//
//    public void show() {
//        System.out.println("현재 재고량 :" + oil_weight + "L");
//    }
//
//}

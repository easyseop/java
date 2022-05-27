package 이지섭_2017112513_homework;


class Kit {

    private String state;
    private String release;

    Kit(){}
    Kit(String release){
        this.release = release;
    }

    public void set_release(String result){
        release = result;
    }


    public void set_state(String result){
        state =result;
    }
    public boolean isolation(){
        if (state.equals("양성")){
            return true;
        }else{
            return false;
        }
    }

    public boolean definite_state(person p, String result) {
        if (p.judgement() == true) {
            if (result.equals("양성")) {
                System.out.println("자기 진단 키트 결과 양성입니다 7일간 격리를 시작합니다.");
                return true;
            } else {
                System.out.println("자가 진단 키트 결과 음성입니다.");
                return false;
            }
        }else{
            return false;
    }

}


        public boolean truefalse(person p,Kit kit,String result) {
            if (p.judgement()) {
                System.out.println("자기 진단 키트 대상자 입니다.");{
                if(kit.definite_state(p, result)) {
                    kit.set_state("양성");
                    return true;
                }else{
                    return false;
                }}
            } else {
                System.out.println("자가 진단 키드 대상자가 아닙니다.");
                kit.set_state("음성");
                return false;
            }
        }


    public boolean truefalse(person p,Kit kit) {
            System.out.println("자가 진단 키드 대상자가 아닙니다.");
            kit.set_state("음성");
            return false;
        }
    }




public class Main {
    public static void main(String[] args) {

        Kit kit1 = new Kit("정상");

        Kit kit2 = new Kit("정상");

        person p1 = new person(36.5);
        person p2 = new person(36.5);



        p1.set_temp(38);
        p2.set_temp(37.2);
        System.out.println("p1은 열이 있습니다");
        boolean flag = kit1.truefalse(p1,kit1,"양성");

        if (flag==true){
        p1.isolation(kit1);
        p1.show_period(kit1);
        p1.day();
        p1.show_period(kit1);
        p1.day(3);
        p1.show_period(kit1);
        p1.day(3);
        p1.show_period(kit1);
        System.out.println("p2는 열이 있습니다");
        boolean flag2 = kit2.truefalse(p2,kit2);

        if (flag2){
            p2.isolation(kit2);
            p2.show_period(kit2);
            p2.day();
            p2.show_period(kit2);
            p2.day();
            p2.show_period(kit2);
            p2.day();
            p2.show_period(kit2);
        }

    }
}
}

















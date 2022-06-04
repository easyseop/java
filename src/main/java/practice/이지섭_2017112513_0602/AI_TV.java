package practice.이지섭_2017112513_0602;

public class AI_TV extends TV{

    private String name;
    AI_TV(String name, int num){
        super(num);

        this.name = name;
    }

    void command(String n){
        if(name.equals(n)){
            System.out.println("주인님! 현재 채널은 "+get_channel()+"번!");
        }else{
            System.out.println("주인님 ! 저는 누구가 아니에요");
        }

    }




}

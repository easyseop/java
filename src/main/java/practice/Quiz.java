package practice;

import java.util.Arrays;
import java.util.Random;

public class Quiz {
    private int speed;
    private int s;
    private int index;
    private int[] speed_list;
    private int curr_speed_limit;

    private String str;

    Quiz() {
        getlist();
        Random random = new Random();
        index = random.nextInt(3);
        curr_speed_limit = speed_list[index];

    }

    public void getlist() {
        speed_list = new int[3];
        s = 60;
        for (int i = 0; i < 3; i++) {
            speed_list[i] = s;
            s += 10; //바로 정의하는 법은 ㅇㅇㅁ/?
        }
    }

    public int get_speed_limit() {
        return curr_speed_limit;
    }


    public int count(String document, String str) {
        this.str = str;
        String[] docu_list = document.split("");
        String[] str_list = str.split("");
        int len = docu_list.length;
        int str_len = str_list.length;
        int answer=0;

        for(int i = 0;i<len-str_len+1;i++){

            String sub = document.substring(i,str_len);
            if(sub.equals(str)){
                answer+=1;
            }
            str_len+=1;
        }

        return answer;


    }
}

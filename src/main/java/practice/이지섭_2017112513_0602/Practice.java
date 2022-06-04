package practice.이지섭_2017112513_0602;

import java.util.Locale;

class Practice {
    private int n;
    void random3(int num){

        for(int i=0; i<num ; i++){
            n =(int)(Math.random()*33)+ 1;
            System.out.println(n*3);

        }
    }

    static void div10(int num){
        System.out.println(num%10);
    }

    static void lower(String str){
        System.out.println(str.toLowerCase());
    }

    void last_word(String str){
        String[] s = str.split(" ");

        System.out.println(s[s.length-1]);
    }

    void max_no(int num){

        String n = Integer.toString(num);
        int l = n.length();
        int m = 0;
        for(int i=0;i<l;i++){

            int a = Integer.parseInt(n.substring(i,i+1));
            if(m<a){
                m=a;
            }
        }
        System.out.println(m);

    }



}




package practice.이지섭_2017112513_0428;

public class Main {

    public static char next(char c){
        int intc = (int)c;
        char result = (char)(intc+1);
        return result;
    }
    public static void main(String[] args) {
        Example ex = new Example();



        // 1번
        int a=5;
        System.out.print("1번 문제 = ");
        if (ex.odd(a))
            System.out.println("홀수");
        else
            System.out.println("짝수");

        // 2번
        char c = 's';
        c = next(c);
        System.out.println("2번 문제 = "+c);

        //3번
        int[] data = {10,5,8,20,7,3,30,25,15};
        System.out.println("3번 문제 = "+ex.min(data));

    }
}

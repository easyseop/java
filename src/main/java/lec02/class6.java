package lec02;

public class class6 {
    //6강 연산자
    public static void main(String[] args) {

        //대입 연산자
        int x = 10;
        int y = 20;

        System.out.println("x = "+x);
        System.out.println("y = "+y);

        x = y;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println();

        //산술 연산자
        x = 10; y = 20;
        System.out.println("x + y = "+(x+y));
        System.out.println("x - y = "+(x-y));
        System.out.println("x * y = "+(x*y));
        System.out.println("x / y = "+(x/y));
        System.out.println("x % y = "+(x%y));
        System.out.println();

        //복합 대입 연산자
        x = 10;
        System.out.println("x += 10 : "+(x+=10));
        x = 10;
        System.out.println("x -= 10 : "+(x-=10));
        x = 10;
        System.out.println("x *= 10 : "+(x*=10));
        x = 10;
        System.out.println("x /= 10 : "+(x/=10));
        x = 10;
        System.out.println("x %= 10 : "+(x%=10));
        System.out.println();

        //관계 연산자
        System.out.println("x>y : "+(x>y));
        System.out.println("x<y : "+(x<y));
        System.out.println("x>=y : "+(x>=y));
        System.out.println("x<=y : "+(x<=y));
        System.out.println("x==y : "+(x==y));
        System.out.println("x!=y : "+(x!=y));
        System.out.println();

        //증감 연산자
        x = 10;
        System.out.println("++x : "+(++x)); // x = x+1
        x = 10;
        System.out.println("--x : "+(--x));
        x = 10;
        System.out.println("x++: "+(x++));
        System.out.println();

        boolean b1; boolean b2;
        b1 = false; b2 = true;
        System.out.println("b1 && b2 : "+(b1&&b2));
        System.out.println("b1 || b2 : "+(b1||b2));
        System.out.println("!b1 : "+(!b1));
        System.out.println("!b2 : "+(!b2));

        //조건(삼항) 연산자
        x = 10; y = 20;
        int result = 0;
        result = (x>y)? 100 : 200;
        System.out.println("result : "+result);
        result = (x<y)? 100 : 200;
        System.out.println("result : "+result);
        result = (x==y)? 100 : 200;
        System.out.println("result : "+result);

    }
}

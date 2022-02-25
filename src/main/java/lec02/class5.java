package lec02;

public class class5 {
    // 5강 특수문자와 서식문자
    public static void main(String[] args) {
        System.out.println("Good \tMorning~");
        System.out.println("Good \nMorning~");
        System.out.println("Good \'Morning~\'");
        System.out.println("Good \"Morning~\"");
        System.out.println("Good \\Morning~\\");


        //서식문자
        System.out.printf("오늘의 기온은 %d도 입니다.\n",10);

        //숫자
        int num1 = 20;
        System.out.printf("오늘의 기온은 %d도 입니다.\n",num1);
        //문자
        System.out.printf("소문자\'%c\'의 대문자는 \'%c\'입니다.",'a','A');

        //문자열
        System.out.printf("\'%s\'를 대문자로 바꾸면 \'%s\'입니다.","java","JAVA");

        //실수
        float f = 1.23f;
        System.out.printf("f = %f\n",f);

        double d = 1.23456d;
        System.out.printf("d = %f\n",d);

        //서식 문자의 정렬과 소수점 제한 기능
        System.out.printf("%d\n",123);
        System.out.printf("%d\n",1234);
        System.out.printf("%d\n",12345);

        System.out.printf("%5d\n",123); //공간을 확보하여 오른쪽 정렬
        System.out.printf("%5d\n",1234);
        System.out.printf("%5d\n",12345);

        System.out.println();

        System.out.printf("%f\n",1.23); // 소숫점 제한 기능
        System.out.printf("%.0f\n",1.23);
        System.out.printf("%.1f\n",1.23);
        System.out.printf("%.2f\n",1.23);
        System.out.printf("%.3f\n",1.23);

    }
}

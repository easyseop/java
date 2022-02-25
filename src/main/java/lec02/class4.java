package lec02;

public class class4 {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println("c = "+c);

        int i = 10;
        System.out.println("i = "+i);

        double d = 10.259;
        System.out.println("d = "+d);

        boolean b = false;
        System.out.println("b = "+b);

        String s = "Hello Java World";
        System.out.println("s = "+s);

        // 자동(묵시적) 형 변환
        byte by = 10;
        int in = by;

        System.out.println("in="+in);

        //명시적 형 변환:
        // 큰 공간의 메모리에서 작은 공간의 메모리로 이동
        int iVar = 100;
        byte bVar = (byte)iVar;
        System.out.println("bVar = "+bVar);

        iVar = 123456;
        bVar = (byte)iVar;
        System.out.println("bVar = "+bVar);




        
    }
}

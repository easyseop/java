package lec01;

public class ch13 {
    public static void main(String[] args) {
        ChClass c = new ChClass();
        c.name = "Jiseop";
        c.gender = "man";
        c.age = 25;
        c.getInfo();

        System.out.println();




        ChClass c2 = new ChClass();
        c2.setInfo("jiseop","man",25);
        c2.getInfo();
    }


}

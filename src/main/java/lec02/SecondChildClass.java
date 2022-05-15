package lec02;

public class SecondChildClass extends ParentClass{


    public SecondChildClass(){
        System.out.println("ChildClass constructor");
    }

    @Override
    public void makeJJajang() {
        System.out.println("-- Second more makeJJajang--");
    }
}

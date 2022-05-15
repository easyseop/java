package lec02;

public class FirstChildClass extends ParentClass{


    public FirstChildClass(){
        System.out.println("ChildClass constructor");
    }

    @Override
    public void makeJJajang() {
        System.out.println("-- Frist more makeJJajang--");
    }
}

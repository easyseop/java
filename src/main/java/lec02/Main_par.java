package lec02;

public class Main_par {
    public static void main(String[] args) {
        ParentClass arr[] = new ParentClass[2];
        ParentClass fch = new FirstChildClass();
        ParentClass sch = new SecondChildClass();

        arr[0] = fch;
        arr[1] = sch;

        for(int i = 0; i<arr.length; i++){
            arr[i].makeJJajang();
        }








        }
    }

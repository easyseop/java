package practice.이지섭_2017112513_0519;

class Book{
    String title,author ;

    void show(){
        System.out.println("[ "+title+", "+author+" ]");
    }
}





public class test {
    public static void main(String[] args) {
        Book Oldman = new Book();
        Oldman.title = "노인과 바다";
        Oldman.author = "헤밍웨이";

        Oldman.show();
    }
}

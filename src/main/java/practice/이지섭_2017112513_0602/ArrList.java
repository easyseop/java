package practice.이지섭_2017112513_0602;

public class ArrList<E>{

    private E[] a;
    private int size;
    private int index;

    ArrList(){
        a = (E[]) new Object[50];
        size = 0;
        index = 0;

    }

    void add(E val){
        a[size++] =val;
    }
    void add(int index,E val){

        for(int i = size-1; i>=index;i--){
            a[i+1] = a[i];
        }
            a[index] = val;
            size+=1;
    }

    void remove(int index){
        for(int i=index+1;i<size;i++){
            a[i-1] = a[i];
        }
        size-=1;
    }

    E get(int pos) {
        return a[pos];
    }

    void show(){
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }

    }

    int size(){
        return size;
    }





}

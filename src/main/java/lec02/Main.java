package lec02;

class generic_stack<E> {
    int tos;
    Object[] stck;
    public generic_stack(){
        tos = 3;
        stck = new Object[10];
    }

    public void push(E item){
        if(tos==10){
            return;
        }
        stck[tos]=item;
        tos++;
    }

    public E pop(){
        if(tos ==0){

            tos = 3;
        }
        tos--;
        return (E)stck[tos];
    }
}




public class Main {
    public static void main(String[] args) {
        generic_stack<String> gs = new generic_stack<String>();

        gs.push("seoul");
        gs.push("newyork");
        gs.push("La");

//        for(int i=0;i<3;i++) {
//            System.out.println(gs.pop());
//        }
        System.out.println();
        for(int i=0;i<3;i++) {
            System.out.println(gs.pop());
        }
    }
}

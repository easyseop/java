package practice.이지섭_2017112513_0519;

public class Example {
    boolean odd(int n){
        if(n%2==0){
            return false;
        }
        return true;
    }



    int min(int[] arr){
        int m = 2^31-1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]<m){
                m = arr[i];
            }
        }
        return m;


    }
}


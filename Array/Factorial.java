package Array_450;

import java.util.ArrayList;
import java.util.Collections;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> res = factorial(n);
        System.out.println(res);

    }
    public static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        if(N==1){
            return res;
        }
        for(int x=2;x<=N;x++){
            multiply(x,res);
        }
        Collections.reverse(res);
        return res;
    }
    public static void multiply(int x, ArrayList<Integer> res){
        int carry =0;
        for(int i =0;i<res.size();i++){
            int prod = res.get(i)*x+carry;
            res.set(i,prod%10);
            carry = prod/10;
        }
        while(carry>0){
            res.add(carry%10);
            carry/=10;
        }
    }
}

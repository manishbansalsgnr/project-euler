import java.util.*;

public class problem_5 {

    // https://projecteuler.net/problem=5

    public static void main(String args[]) {
        boolean flag =  true;
        int n = 20;
        int count = 0;
        while(!isMatch(n)) {
            n++;
        }
        System.out.println(n);
    }

    private static boolean isMatch(int n) {
        int count = 0;
        for(int i = 1 ; i<21 ; i++) {
            if(n%i==0){
                count++;
            }
            if(count==20) {
                return true;
            }
        }
        return false;
    }
}

import java.util.*;

public class problem_4 {

    // https://projecteuler.net/problem=4

    public static void main(String args[]) {
        Long product = 1L;
        Long max = 1L;
        List<Long> listPalindrome = new ArrayList<>();

        for(Long i = 999L ; i>100 ; i--) {
            for(Long j = 999L ; j>100 ; j--) {
                product = i*j;
                if(isPalindrome(product) && max<product) {
                    max = product;
                }
            }
        }
        
        System.out.println(max);
    }

    private static boolean isPalindrome(Long num) {
        Long reverseNum = 0L;
        Long temp = num;
        Long r=0L;
        while(temp>0) {
            r = temp%10;
            reverseNum = reverseNum*10 + r;
            temp /= 10;
        }
        if(reverseNum.equals(num)) {
            return true;
        }
        return false;
    }

}

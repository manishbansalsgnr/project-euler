public class problem_3 {

    // https://projecteuler.net/problem=3

    public static void main(String args[]) {
        long num = 600851475143L;
        long product = 1;
        boolean x= isPrime(4);
        for(long i = 2 ; i<num ; i++) {
            if(num%i == 0 && isPrime(i)) {
                product *= i;
            }
            if(product == num) {
                System.out.println(i);
                break;
            }
        }
    }
    private static boolean isPrime(long num) {
            for(long i = 2 ; i<num ; i++) {
                if (num % i == 0) {
                    return false;
                }
        }
        return true;
    }
}

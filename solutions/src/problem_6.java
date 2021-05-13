public class problem_6 {

    // https://projecteuler.net/problem=6

    public static void main(String args[]) {
        int n = 100;
        int sum = (n*(n+1)/2)*(n*(n+1)/2) - n*(n+1)*(2*n +1)/6;
        System.out.println(sum);
    }
}

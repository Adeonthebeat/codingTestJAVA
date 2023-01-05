package practice07;

/** $$
 * [피보나치 수열] - fibo[n] > 0 | fibo[n] = fibonacci(n-2) * fibonacci(n-1)
 */
public class Main004 {

    static int[] fibo;

    public int fibonacci(int n) {

        // Check | 가장 중요함!
        if(fibo[n] > 0) {
            return fibo[n];
        }

        if(n == 1) {
            return fibo[n] = 1;
        } else if(n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = fibonacci(n-2) + fibonacci(n-1);
        }

    }

    public static void main(String[] args) {
        Main004 main = new Main004();

        int n = 10;

        fibo = new int[n+1];

        main.fibonacci(n);

        for(int i = 1; i < n; i++) {
            System.out.print(fibo[i] + " ");
        }

    }
}

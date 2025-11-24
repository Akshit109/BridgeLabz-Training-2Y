package elementry;

public class section2 {
    
}
public class SectionB {

    // 1. Is Prime?
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    // 2. Factorial
    public long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    // 3. Nth Fibonacci
    public int nthFibonacci(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        int a = 0, b = 1, c;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // 4. Nth Prime Number
    public int nthPrime(int n) {
        int count = 0, num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) count++;
        }
        return num;
    }

    // 5. Count primes in range
    public int countPrimes(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++)
            if (isPrime(i)) count++;
        return count;
    }

    // 6. Count all digits
    public int countDigits(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // 7. Unique digits
    public int uniqueDigits(int n) {
        n = Math.abs(n);
        boolean[] seen = new boolean[10];

        if (n == 0) seen[0] = true;

        while (n > 0) {
            seen[n % 10] = true;
            n /= 10;
        }

        int count = 0;
        for (boolean x : seen)
            if (x) count++;
        return count;
    }

    // 8. Non-repeated digits
    public int nonRepeatedDigits(int n) {
        n = Math.abs(n);
        int[] freq = new int[10];

        if (n == 0) freq[0]++;

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int count = 0;
        for (int f : freq)
            if (f == 1) count++;

        return count;
    }

    // 9. Sum of digits
    public int digitSum(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // 10. Sum of even digits
    public int digitSumEven(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0) sum += d;
            n /= 10;
        }
        return sum;
    }

    // 11. Sum of odd digits
    public int digitSumOdd(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 != 0) sum += d;
            n /= 10;
        }
        return sum;
    }

    // 12. Sum of digits based on choice
    public int digitSumOpt(int n, String choice) {
        if (choice.equalsIgnoreCase("even"))
            return digitSumEven(n);
        else if (choice.equalsIgnoreCase("odd"))
            return digitSumOdd(n);
        else
            return -1;
    }
}

public class Section1 {

    // 1. Is Even?
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 2. Is Odd?
    public boolean isOdd(int n) {
        return n % 2 != 0;
    }

    // 3. Return last digit
    public int lastDigit(int n) {
        n = Math.abs(n);
        return n % 10;
    }

    // 4. Return second last digit
    public int secondLastDigit(int n) {
        n = Math.abs(n);
        return (n / 10) % 10;
    }

    // 5. Sum of last digits of two numbers
    public int sumOfLastDigits(int a, int b) {
        return Math.abs(a % 10) + Math.abs(b % 10);
    }

    // 6. Is N an exact multiple of M?
    public boolean isExactMultiple(int n, int m) {
        if (m == 0) return false;
        return n % m == 0;
    }

    // 7. Count even numbers from 5 given
    public int countEven(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x % 2 == 0) count++;
        return count;
    }

    // 8. Count odd numbers from 5 given
    public int countOdd(int[] arr) {
        int count = 0;
        for (int x : arr)
            if (x % 2 != 0) count++;
        return count;
    }

    // 9. Count both even and odd
    public int[] countEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int x : arr) {
            if (x % 2 == 0) even++;
            else odd++;
        }
        return new int[]{even, odd};
    }
}

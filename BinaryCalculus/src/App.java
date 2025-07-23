public class App {

    // Function to count the number of set bits (1s) in binary representation
    public static int countSetBits(int n) {
        return Integer.bitCount(n);
    }

    // Function to find the smallest number >= n with all bits set to 1
    public static int smallestAllBitsSet(int n) {
        int bits = Integer.toBinaryString(n).length();
        return (1 << bits) - 1;
    }

    // Main function to count numbers <= f(n) with same set bits as n, excluding n
    public static int countSameSetBits(int n) {
        final int MOD = 1_000_000_007;
        int targetSetBits = countSetBits(n);
        int upperLimit = smallestAllBitsSet(n);
        int count = 0;

        for (int i = 1; i <= upperLimit; i++) {
            if (i != n && countSetBits(i) == targetSetBits) {
                count++;
            }
        }

        return count % MOD;
    }

    public static void main(String[] args) {
        int n = 12;
        int result = countSameSetBits(n);
        System.out.println("Result for n = " + n + " is: " + result);
    }
}

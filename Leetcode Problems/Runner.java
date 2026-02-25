public class Runner {
    public static void main(String[] args) {

        L09_Palindrome_Number.Solution p = new L09_Palindrome_Number.Solution();
        // Method 1
        System.out.println(p.isPalindromeA(121));
        System.out.println(p.isPalindromeA(-121));
        // Method 2
        System.out.println(p.isPalindromeB(123454321));
        System.out.println(p.isPalindromeB(12321));

    }
}
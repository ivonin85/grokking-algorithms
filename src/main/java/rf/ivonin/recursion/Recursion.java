package rf.ivonin.recursion;

public class Recursion {
    public static void main(String[] args) {
        String s = "level";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0){
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)){
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

}

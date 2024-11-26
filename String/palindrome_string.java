package String;


public class palindrome_string {

	public static String isPalindrome(String s)
    {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) 
        {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev))
        {
            return "Palindrome";
        }
        return "Not palindrome";
    }
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("abba"));
    }

}

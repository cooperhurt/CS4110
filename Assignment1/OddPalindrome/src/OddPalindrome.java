//                      CooperHurt
//                      CS 4110 - 5:30 pm
//                      Assignment #1
//                      Dr. Rague
//                      Due: 01/13/20
//                      Version: 1.0
// -----------------------------------------------------------------
// This will use recursion to test if the input is an odd palindrome
//
// -----------------------------------------------------------------
public class OddPalindrome {


    public static void main(String[] args) {
        Boolean isdev = true;

        if(isdev){
            String[] inputs = {"abaaba",  "bbaabbb",  "abababa",  "aabcbaa",  "baabbbaab"};

            if(args.length > 0)
                System.out.println("We are in development mode, input is ignored.\n");

            for(String curr : inputs){
                String result = "X = " + curr + "\t\t\tMember?:\t ";
                result = (isOddPalindrome(curr) ? result + "True" : result + "False");
                System.out.println(result);
            }
            return;
        }

        if (args.length != 1)
        {
            System.err.println("Invalid input, please make sure you enter a valid arugment.");
            System.exit(1);
        }

        String input = args[0];
        String result = "X = " + input + "\t\t\t Member?\t ";
        result = (isOddPalindrome(input) ? result + "True" : result + "False");
        System.out.println(result);
    }

    public static boolean isOddPalindrome(String s)
    {
        if (s.equals("a") || s.equals("b"))
            return true;

        if (s.charAt(0) == s.charAt(s.length() - 1))
        {
            if (s.length() == 1)
                return true;
            else if (s.length() == 2)
                return false; // This is an odd palindrome - there should not be two characters left

            if (s.charAt(0) == 'a' || s.charAt(0) == 'b' || s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'b')
                return isOddPalindrome(s.substring(1, s.length() - 1));
        }

        return false;
    }

}
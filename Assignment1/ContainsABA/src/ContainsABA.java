//                      CooperHurt
//                      CS 4110 - 5:30 pm
//                      Assignment #1
//                      Dr. Rague
//                      Due: 01/13/20
//                      Version: 1.0
// -----------------------------------------------------------------
// This will use recursion to test if a string contains aba in it at all.
//
// -----------------------------------------------------------------
public class ContainsABA {


    public static void main(String[] args) {
        Boolean isdev = true;

        if(isdev){
            String[] inputs = {"abaaba",  "bbaabbb",  "abbababa",  "aabbbbaa",  "baababcab"};

            if (args.length > 0)
                System.out.println("We are in development mode, input is ignored.\n");

            for(String curr : inputs){
                String result = "X = " + curr + "\t\t\tMember?\t ";
                result = (isContainsABA(curr, false) ? result + "True" : result + "False");
                System.out.println(result);
            }
            return;
        }

        if (args.length != 1)
        {
            System.err.println("Please check input, there is not and input.");
            System.exit(1);
        }

        String input = args[0];
        String result = "Input is = " + input + "\t\t\t Contains aba:?\t ";
        result = (isContainsABA(input, false) ? result + "True" : result + "False");
        System.out.println(result);
    }

    public static boolean isContainsABA(String s, boolean contains)
    {
        if (!isValidAlphabet(s))
            return false;

        if (s.length() >= 3)
        {
            if (s.charAt(0) == 'a' && s.charAt(1) == 'b' && s.charAt(2) == 'a' && !contains)
                contains = true;

            return (s.length() == 3) ? contains : isContainsABA(s.substring(1), contains);
        }
        else
        {
            return (s.length() > 1) ? isContainsABA(s.substring(1), contains) : contains;
        }
    }

    public static boolean isValidAlphabet(String s)
    {

        if (s.equals("a") || s.equals("b"))
            return true;

        if (s.length() > 1)
        {
            if (s.charAt(0) == 'a' || s.charAt(0) == 'b')
                return isValidAlphabet(s.substring(1));
        }

        return false;
    }
}
//                      CooperHurt
//                      CS 4110 - 5:30 pm
//                      Assignment #1
//                      Dr. Rague
//                      Due: 01/13/20
//                      Version: 1.0
// -----------------------------------------------------------------
// This will use recursion to test if ABplus is valid or not
//
// -----------------------------------------------------------------
public class ABPlus {

    public static void main(String[] args) {
        
        Boolean isdev = true;

        if(isdev){
            String[] inputs = {"aba+ba",  "b+ba+bb",  "ab++ba+a",  "+aab+bba",  "b+abb+ab+", "a+bbc+bba"};

            if(args.length > 0)
                System.out.println("We are in development mode, input is ignored.\n");
                
            for(String curr : inputs){
                String result = "X = " + curr + "\t\t\tMember?:\t ";
                result = (isABPlus(curr, false) ? result + "True" : result + "False");
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
        String result = "X = " + input + "\t\t\tMember?:\t ";
        result = (isABPlus(input, false) ? result + "True" : result + "False");
        System.out.println(result);
    }

    public static boolean isABPlus(String s, boolean valid)
    {
        if (s.equals("a") || s.equals("b"))
            return true;

        if (s.charAt(0) != 'a' && s.charAt(0) != 'b' && s.charAt(0) != '+')
            return false;

        if (valid == false && s.charAt(0) == '+')
            return false;

        if (s.charAt(s.length() - 1) == '+' && s.length() == 1)
            return false;

        valid = (s.charAt(0) == 'a' || s.charAt(0) == 'b') ? true : false;

        return isABPlus(s.substring(1), valid);
    }

}
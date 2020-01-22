//                      CooperHurt
//                      CS 4110 - 5:30 pm
//                      Assignment #1
//                      Dr. Rague
//                      Due: 01/13/20
//                      Version: 1.0
// -----------------------------------------------------------------
// This will use recursion to test if something is diviible b 7
//
// -----------------------------------------------------------------
public class DivisiblityBy7 {

    public static void main(String[] args) {

        Boolean isdev = true;

        if (isdev) {
            int[] nums = { 382,  749,  2977,  9989, 52878 };

            for (int curr : nums) {
                String result = "X = " + curr + "\t\t\tMember?\t ";
                result = (isDivisibleBy7(curr) ? result + "True" : result + "False");
                System.out.println(result);
            }
        }
        if (args.length != 1 || !isInteger(args[0])) {
            System.err.println("You either didn't enter a parameter or invalid number try again.");
            System.exit(1);
        }

        int num = Integer.valueOf(args[0]);
        String result = "X = " + num + "\t\t\tMember?\t ";
        result = (isDivisibleBy7(num) ? result + "True" : result + "False");
        System.out.println(result);

    }

    public static boolean isDivisibleBy7(int n) {
        if (n < 7)
            return false;

        if (n == 7)
            return true;

        return isDivisibleBy7(n - 7);
    }

    public static boolean isInteger(String s) {
        try {
            Integer.valueOf(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
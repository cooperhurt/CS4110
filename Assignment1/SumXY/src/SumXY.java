//                      CooperHurt
//                      CS 4110 - 5:30 pm
//                      Assignment #1
//                      Dr. Rague
//                      Due: 01/13/20
//                      Version: 1.0
// -----------------------------------------------------------------
// This will use recursion to test if something is sum of x + y
//
// -----------------------------------------------------------------
public class SumXY {

    public static void main(String[] args) {
        Boolean isdev = true;

        if (isdev) {
            int[] nums = {12,  51,  137,  364,  589};

            if (args.length > 0)
                System.out.println("We are in development mode, input is ignored.\n");

            for (int curr : nums) {
                String result = "X = " + curr + "\t\t\tMember?\t ";
                result = (isSumXY(curr) ? result + "True" : result + "False");
                System.out.println(result);
            }
            return;
        }

        if (args.length != 1 || !isInteger(args[0])) {
            System.err.println("Usage: java TestSumXY 12");
            System.exit(1);
        }

        int num = Integer.valueOf(args[0]);
        String result = "X = " + args[0] + "\t\t\t Member?\t ";
        result = (isSumXY(num) ? result + "true" : result + "false");
        System.out.println(result);
    }

    public static boolean isSumXY(int num) {
        if (num < 17)
            return false;

        if (num == 17 || num == 43)
            return true;

        return (isSumXY(num - 17) || isSumXY(num - 43));
    }

    //This will make sure we have an actual number from the input
    //We could use a try catch but this is probably less buggy
    public static boolean isInteger(String num) {
        try {
            Integer.valueOf(num);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
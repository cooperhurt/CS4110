//                      CooperHurt
//                      CS 4110 - 5:30 pm
//                      Assignment #1
//                      Dr. Rague
//                      Due: 01/13/20
//                      Version: 1.0
// -----------------------------------------------------------------
// This will use recursion to test if is a power of 2
//
// -----------------------------------------------------------------
public class PowerOf2 {

    public static void main(String[] args) {
        Boolean isdev = true;

        if (isdev) {

            if (args.length > 0)
                System.out.println("We are in development mode, input is ignored.\n");

            double[] inputs = { 128,  257,  1023,  8192,  65536 };

            for (double curr : inputs) {
                String result = "X = " + curr + "\t\t\tMember?\t ";
                result = (isPowerOf2(curr) ? result + "True" : result + "False");
                System.out.println(result);
            }
            return;
        }

        if (args.length != 1 || !isNumber(args[0])) {
            System.err.println("Either didn't enter a number or valid # arguments");
            System.exit(1);
        }

        double num = Double.valueOf(args[0]);

        String result = "X = " + args[0] + "\t\t\tMember?\t ";
        result = (isPowerOf2(num) ? result + "True" : result + "False");
        System.out.println(result);

    }



    public static boolean isPowerOf2(Double num) {

        if (num == 1)
            return true;

        if (num < 1)
            return false;

        return isPowerOf2((double) num / 2);
    }

    public static boolean isNumber(String num) {
        try {
            Double.valueOf(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
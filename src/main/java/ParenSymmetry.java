import java.util.Arrays;
import java.util.List;

public class ParenSymmetry {

    public Boolean isBalanced(String s) {
        //needs to read a string ensuring amount of "(" and amount of ")" are equal
        //if equal boolean is true

            int amountParen = 0;
            int spot = 0;

            while (spot < s.length()) {
                char  idx = s.charAt(spot);

                if (idx == '(') {
                    amountParen = amountParen + 1;
                }
                if (idx == ')') {
                    amountParen = amountParen - 1;
                }
                if (spot < 0) {
                    return false;
                }
                spot++;
            }

        return amountParen == 0;
        }





    private void checkFile(String filename) {
        // open file named filename

        // for each line in the file
            // read the line
            // print whether or not the line's parenthesis are balanced
            // need to run isBalanced on each line

        // CLOSE the file
    }

    public static void main(String[] args) {
        ParenSymmetry ps = new ParenSymmetry();

        Boolean b0 = ps.isBalanced("()");
        printResult(b0, true);

        String[] falseStrings = {"(", "((", ")", "", "(()())((())))"};
        Boolean falses = true;
        for (String strToTest : falseStrings) {
            falses = ps.isBalanced(strToTest);
        }
        printResult(falses, false);

        String[] trueStrings = {"()", "(())", "(((())))", "", "(()())((()))", "(   )", "( () ( ) )"};
        Boolean trues = false;
        for (String strToTest : trueStrings) {
            trues = ps.isBalanced(strToTest);
        }
        printResult(trues, true);

        // ps.checkfile (TestStrings1);

    }

    private static void printResult(Boolean b0, boolean b) {
        if (b0 == null) {
            System.out.println("Null Failure");
            return;
        }
        if (b0 == b) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}

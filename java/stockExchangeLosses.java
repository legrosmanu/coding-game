import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int loss = 0;
        int maxValue = 0;
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            if (v < maxValue) { // a loss is possible
                loss = Math.max(maxValue - v, loss);
            } else {
                maxValue = v;
            }
        }

        // Loss is displayed as a negative number
        int result = loss * -1;
        System.out.println(result);
    }
}

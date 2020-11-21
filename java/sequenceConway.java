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
        int R = in.nextInt();
        int L = in.nextInt();

        // Build sequence
        ArrayList<Integer> previousLine = new ArrayList<>();
        // -> first line
        previousLine.add(R);
        // -> we start to loop until we don't have the line expected
        // -> the loop check the previous line to build the next line
        for (int i = 1 ; i < L ; i++) { // we start at 1, because, we already have the first line
            ArrayList<Integer> newLine = new ArrayList<>();
            int previousValue = -1;
            int currentValue = -1;
            int count = 0;
            for (int j = 0 ; j < previousLine.size() ; j++){
                currentValue = previousLine.get(j);
                // we count
                if (previousValue == currentValue) {
                    count++;
                } else if (previousValue == -1) {
                    count = 1;
                } else {
                    // We add the line
                    newLine.add(count);
                    newLine.add(previousValue);
                    count = 1;
                }

                // edge case
                if (j == previousLine.size() - 1){
                    newLine.add(count);
                    newLine.add(currentValue);
                }

                previousValue = currentValue;
            }
            previousLine = newLine; // the next line is now the previous line
        }
        
        // Build the result expected
        StringBuilder result = new StringBuilder();
        for (int i = 0 ; i < previousLine.size() ; i++) {
            result.append(previousLine.get(i));
            if (i < previousLine.size()-1) result.append(" ");
        }

        System.out.println(result.toString());
    }
}

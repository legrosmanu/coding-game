import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int buildingWidth = in.nextInt(); // width of the building.
        int buildingHeight = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        int currentX = X0;
        int currentY = Y0;
        int minX = 0;
        int minY = 0;
        int maxX = buildingWidth-1;
        int maxY = buildingHeight-1;

        // game loop
        while (true) {

            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            // update the area
            if (bombDir.startsWith("U")) {
                maxY = currentY - 1;
            }
            if (bombDir.startsWith("D")) {
                minY = currentY + 1;
            }
            if (bombDir.endsWith("L")){
                maxX = currentX - 1;
            }
            if (bombDir.endsWith("R")){
                minX = currentX + 1;
            }

            // Batman moves in the center of the new area
            currentX = minX + (maxX - minX) / 2;
            currentY = minY + (maxY - minY) / 2;

            // the location of the next window Batman should jump to.
            System.out.println(currentX + " " + currentY);

        }
        
    }

}

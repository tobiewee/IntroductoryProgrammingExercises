package DiamondExercises;

import java.util.Scanner;

/**
 * Created by Tobie Wee
 * on 6/5/2016.
 */
public class DiamondWithName {
    public static void drawLine(int width, int startPoint, int endPoint) {
        for (int j=0; j<width; j++) {
            if (j >= startPoint && j <= endPoint)
                System.out.print('*');
            else
                System.out.print(' ');
        }
    }

    public static void printMyName() {
        System.out.print("Tobie");
    }

    public static void printDiamondWithName(int n) {
        int height = n + (n-1);
        int width = n + (n-1);

        for (int i=0; i<height; i++) {
            if(i<(n-1)) {
                int startDraw = (width / 2) - i;
                int endDraw = (width / 2) + i;
                drawLine(width, startDraw, endDraw);
            }
            else if (i==(n-1))
                printMyName();
            else {
                int startDraw = (width / 2) - (width-(i+1));
                int endDraw = (width / 2) + (width-(i+1));
                drawLine(width, startDraw, endDraw);
            }
            System.out.println();
        }
    }

    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 'n': ");
        int n = in.nextInt();

        printDiamondWithName(n);
    }
}

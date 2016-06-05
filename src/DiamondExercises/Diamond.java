package DiamondExercises;

import java.util.Scanner;

/**
 * Created by Tobie Wee
 * on 6/5/2016.
 */
public class Diamond {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 'n': ");
        int n = in.nextInt();

        int height = n+(n-1);
        int width = (n-1)+n;
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                if(i<n) {
                    int startDraw = (width / 2) - i;
                    int endDraw = (width / 2) + i;
                    if (j >= startDraw && j <= endDraw)
                        System.out.print('*');
                    else
                        System.out.print(' ');
                }
                else {
                    int startDraw = (width / 2) - (width-(i+1));
                    int endDraw = (width / 2) + (width-(i+1));
                    if (j >= startDraw && j <= endDraw)
                        System.out.print('*');
                    else
                        System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}

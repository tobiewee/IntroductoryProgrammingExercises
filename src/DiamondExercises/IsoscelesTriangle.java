package DiamondExercises;

import java.util.Scanner;

/**
 * Created by Tobie Wee
 * on 6/5/2016.
 */
public class IsoscelesTriangle {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 'n': ");
        int n = in.nextInt();

        int width = (n-1)+n;
        for (int i=0; i<n; i++){
            for (int j=0; j<width; j++){
                int startDraw = (width/2)-i;
                int endDraw = (width/2)+i;
                if(j>=startDraw && j<=endDraw)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
}

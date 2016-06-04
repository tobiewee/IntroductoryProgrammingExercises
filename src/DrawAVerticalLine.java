import java.util.Scanner;

/**
 * Created by Tobie Wee on 6/4/2016.
 */
public class DrawAVerticalLine {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter number of '*': ");
        int n = in.nextInt();

        for (int i=0; i<n; i++){
            System.out.println('*');
        }
    }
}

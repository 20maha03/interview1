import java.util.*;

public class Exercise1 {

    public static void main (String args[])  {

        Scanner input = new Scanner (System.in);

        System.out.println ("enter array size");

        int size = input.nextInt ();

        int array [] = new int [size];

        System.out.println ("enter array elements:");

        for ( int i = 0; i < size; i ++) {
            array [i] = input.nextInt ();
        }

        System.out.println ("array elements are:"+Arrays.toString(array));

        int sum = 0;
        for (int i = 0; i < size; i ++) {
            sum += array [i];
        }
        int avg = sum / size;

        System.out.println ("average is :"+avg);
        

    }
}
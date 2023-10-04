import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //For task 1
        short max = 24;
        short min = 6;

        //Declaration of Array
        short[] c = new short[((max - min) / 2) + 1];

        //Adding values
        for (int i = 0; i < c.length; i++) {
            c[i] = max;
            max -= 2;
        }

        
        //For task 2

            //Declaration of Array
        float[] x = new float[19];

            //Defining limits of the random values added to the array
        float top = 2.0f;
        float bottom= -4.0f;

            //Adding the values
        for (int i = 0; i < x.length; i++) {
            Random rand = new Random();
            x[i] = rand.nextFloat() * (top - bottom) + bottom;
        }

        //The following line is to check which values will take the x when executing the program
        //System.out.println(Arrays.toString(x));

        //For task 3
        int xdimension = 10;
        int ydimension = 19;
        double y[][] = new double[xdimension][ydimension];

        //To iterate through the bidimensional array
        for (int i = 0; i < xdimension; i++){
            for (int j = 0; j < ydimension; j++){


                //First condition
                if (c[i] == 6){
                    y[i][j] = Math.cbrt(Math.pow((4/(Math.cos(x[j]))), (Math.pow((2*x[j]), x[j]))));

                    /*
                    The following code is to check with number takes place when using "x" in the math expression
                    System.out.print("The number to operate is: ");
                    System.out.println(x[j]);

                    The following code is to check what's the result of the expression
                    System.out.print("The result is: ");
                    System.out.println(y[i][j]);
                     */

                    //Second condition
                } else if (c[i] == 10 || c[i] == 12 || c[i] == 16 || c[i] == 20 || c[i] == 22) {

                    //Math expression
                    y[i][j] = Math.log(Math.pow(Math.cos(Math.pow((2*Math.cbrt(x[j])), Math.exp(x[j]))), 2));

                    /*
                    The following code is to check with number takes place when using "x" in the math expression
                    System.out.print("The number to operate is: ");
                    System.out.println(x[j]);

                    The following code is to check what's the result of the expression
                    System.out.print("The result is: ");
                    System.out.println(y[i][j]);
                     */

                    //Third condition
                } else {


                    //Math expression
                    y[i][j] = Math.exp(Math.pow(((1.0/3.0) * ((Math.pow((0.5/(2*x[j] - 1)), 2)) - 1)), 2));


                    /*
                    The following code is to check with number takes place when using "x" in the math expression
                    System.out.print("The number to operate is: ");
                    System.out.println(x[j]);

                    The following code is to check what's the result of the expression
                    System.out.print("The result is: ");
                    System.out.println(y[i][j]);
                     */
                }
                System.out.printf("%.3f%C ", y[i][j], 59);
            }
            System.out.println();
            System.out.println();
        }
    }
}
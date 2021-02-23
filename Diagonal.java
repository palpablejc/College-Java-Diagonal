import java.util.Scanner;
/**
 *This program calculates the sum in the main diagonal of a 2d array
 * @author John Carter
 * @version 1.0 11/29/2016
 */
public class Diagonal {

    /**main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Main entry point for program
         */
         
        //prompt
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        
        //get array from user
        double [][] userArray = new double[4][4];
        Scanner input = new Scanner(System.in);
        
        //input
        for(int i = 0; i < userArray.length; i++){
            for(int j = 0; j< userArray[i].length; j++){
                //System.out.println("Enter a 4-by-4 matrix row by row: ");
                userArray[i][j] = input.nextDouble();
            }       
        }
       
        double matrix = 0;
        
        //output
        matrix = sumMajorDiagonal(userArray);
        System.out.println("The sum of the elements in the major diagonal is " + matrix);
       
    }
    
    /**
     * processing method
     * @param userArray
     * @return 
     */
    public static double sumMajorDiagonal(double[][] userArray){
        double sum = 0;
        for(int i = 0; i < userArray.length; i ++){

               sum += userArray[i][i];
        }
        return sum;
    }   
}

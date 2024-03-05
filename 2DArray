import java.util.*;
import java.util.Scanner;

public class Array2D {
    public static void inputMatrix(int matrix[][]) {
        // input
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    public static void printMatrix(int matrix [][]) {
        // output
        System.out.println("Given Matrix : ");
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void spiralMatrix(int matrix[][]) {
        int startRow =0;
        int startCol =0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        System.out.print("Spiral Matrix : ");
        while (startRow<=endRow && startCol<=endCol) {

            //top
            for (int j=startCol; j<endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for (int i=startRow; i<endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            //bottom
            for (int j=endCol; j>startCol; j--) {
                System.out.print(matrix[endRow][j] + " ");
            }
            //left
            for (int i = endRow; i > startRow; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void digonalSum(int matrix[][]) {

        System.out.println();
        System.out.print("Digonal Sum = ");
        int sum=0;

//        //Time Complexicity - O(n2)
//        for (int i=0; i<matrix.length; i++) {
//            for (int j=0; j<matrix[0].length; j++) {
//                //primary digonal
//                if (i == j) {
//                    sum += matrix[i][j];
//                }
//                //secondary digonal
//                else if (i+j == matrix.length-1) {
//                    sum += matrix[i][j];
//                }
//            }
//        }

        // Time Complexicity - O(n)
        for (int i=0; i<matrix.length; i++) {
            //primary digonal
            if (i == i) {
                sum += matrix[i][i];
            }
            //secondary digonal
            if (i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-1-i];
            }
        }


        System.out.println(sum);

    }
    public static boolean staircaseSearch(int matrix[][], int key) {
        System.out.println();
        int i=0;
        int j= matrix[0].length-1;
        while (i<= matrix.length-1 && j>=0) {
            if (matrix[i][j] == key) {
                System.out.println("Key found at (" +i+ "," +j + ")");
                return true;
            }
            else if (key<matrix[i][j]) {
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("Key not found!😢");
        return false;
    }

    public static void main(String[] args) {
//        int matrix [][] = new int [3][4];
//        int n= matrix.length; // length of row = 3
//        int m = matrix[0].length; // length of column = 4\

          int matrix [][] = { {10,20,30,40},
                              {15,25,35,45},
                              {27,29,37,48},
                              {33,34,39,50}};
          int key = 34;

          printMatrix(matrix);
          spiralMatrix(matrix);
          digonalSum(matrix);
          staircaseSearch(matrix,key);





    }
}

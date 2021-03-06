import java.util.Scanner;                                                        // importing scanner class.

 /*Scanner is a class in java.util package used for obtaining the input of the primitive types like int, double, etc. and strings. 
 It is the easiest way to read input in a Java program,though not very efficient if you want an input method for scenarios where time
 is a constraint like in competitive programming.*/
 
public class MatrixProgram {
  public static void main(String[] args) {

      System.out.println("\n*********** WELCOME TO PROGRAMMING ***********\n");

      int inc=1;                                                                  // incremental variable
      int[][] a ={{1,3,4},{2,4,3},{3,4,5}};                                       // first two-dimensional array...
      int[][] b ={{1,3,4},{2,4,3},{1,2,4}};                                       // Second two-dimensional array...
      int[][] c =new int[3][3];                                                   // third two-dimensional array...
      int[][] resultarry = new int [3][3];


      System.out.println("Your First Matrix is ");
     
//  loop of the first matrix.
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              System.out.print(a[i][j] + " " );
          }
          System.out.println();
      }

      System.out.println("Your Second Matrix is ");

//  loop of the Second matrix.
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              System.out.print(b[i][j] + " " );
          }
          System.out.println();
      }

      System.out.println("\t\t Menu");
      System.out.println("\n\t1.Addition of two matrices");
      System.out.println("\t2.Multiplication of matrices.\n");

      while(inc<3){
          System.out.println("\nEnter your Choice.");
          Scanner sc = new Scanner(System.in);
          int choice = sc.nextInt();

          switch (choice) {
              case 1:
                  System.out.println("\n(:____Your Choice is Matrix Addition____:)\n");
                  System.out.println("\nAddition of two matrices....! \n");
                  for (int i = 0; i < 3; i++) {
                      for (int j = 0; j < 3; j++) {
                          resultarry[i][j] = a[i][j] + b[i][j];
                          System.out.print(resultarry[i][j] + " ");
                      }
                      System.out.println();
                  }
                  break;
              case 2:
                  System.out.println("\n(:____your choice is matrix multiplication____:)\n");
                  System.out.println("\nMultiplication of matrices....!");
                  for (int i = 0; i < 3; i++) {
                      for (int j = 0; j < 3; j++) {
                          c[i][j] = 0;
                          for (int k = 0; k < 3; k++) {
                              c[i][j] += a[i][k] * b[k][j];
                          }
                          System.out.print(c[i][j] + " ");
                      }
                      System.out.println();
                  }
                  break;
              default:
                  System.out.println("Invalid");
                  break;
          }
          inc++;
      }
  }
}

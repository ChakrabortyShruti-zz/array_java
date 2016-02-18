import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;


public class TestMatrix{
    @Test
    public void initialize_matrix_should_initialize_the_matrix_with_values(){
        Matrix matrix = new Matrix(4,3);

        matrix.initializeValue(0,0,12);
        matrix.initializeValue(0,1,1);
        matrix.initializeValue(0,2,11);
        matrix.initializeValue(1,0,13);
        matrix.initializeValue(1,1,19);
        matrix.initializeValue(1,2,23);
        matrix.initializeValue(2,0,3);
        matrix.initializeValue(2,1,30);
        matrix.initializeValue(2,2,5);
        matrix.initializeValue(3,0,7);
        matrix.initializeValue(3,1,22);
        matrix.initializeValue(3,2,92);

        assertEquals(12,matrix.getMatrixValue(0,0));
        assertEquals(30,matrix.getMatrixValue(2,1));
        assertEquals(92,matrix.getMatrixValue(3,2));

    }

     @Test
     public void add_matrices_should_add_two_matrices(){
         Matrix firstMatrix = new Matrix(2,2);

         firstMatrix.initializeValue(0,0,12);
         firstMatrix.initializeValue(0,1,1);
         firstMatrix.initializeValue(1,0,13);
         firstMatrix.initializeValue(1,1,19);

         Matrix secondMatrix = new Matrix(2,2);

         secondMatrix.initializeValue(0,0,20);
         secondMatrix.initializeValue(0,1,11);
         secondMatrix.initializeValue(1,0,17);
         secondMatrix.initializeValue(1,1,9);

         Matrix result = firstMatrix.addWith(secondMatrix);

         assertEquals(32,result.getMatrixValue(0,0));
         assertEquals(28,result.getMatrixValue(1,1));
     }

     @Test
     public void multiply_matrices_should_multiply_two_matrices(){
         Matrix firstMatrix = new Matrix(1,2);

         firstMatrix.initializeValue(0,0,1);
         firstMatrix.initializeValue(0,1,1);

         Matrix secondMatrix = new Matrix(2,1);

         secondMatrix.initializeValue(0,0,1);
         secondMatrix.initializeValue(1,0,1);

         Matrix result = firstMatrix.multiplyWith(secondMatrix);

         assertEquals(2,result.getMatrixValue(0,0));

     }
}

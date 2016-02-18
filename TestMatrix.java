import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;


public class TestMatrix{
    Matrix m;
    @Before
    public void beforeEach(){
        this.m = new Matrix();
    }

    @Test
    public void createMatrix(){
        int matrix[][] = this.m.createMatrix(4,3);
        assertEquals(4,matrix.length);
        assertEquals(3,matrix[0].length);
    }

    @Test
    public void initializeMatrix(){
        int matrix[][] = this.m.createMatrix(4,3);
        this.m.initializeMatrix(0,matrix);
        assertEquals(0,matrix[0][0]);
        assertEquals(3,matrix[1][0]);
     }

     @Test
     public void addMatrix(){

     }
}

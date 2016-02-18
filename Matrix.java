class Matrix{
    private int rows;
    private int columns;
    private int[][] matrixElements;

    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.matrixElements = new int[rows][columns];
    }

    public void initializeValue(int row,int column,int value){
        this.matrixElements[row][column] = value;
    }

    public int getMatrixValue(int row,int column){
        return this.matrixElements[row][column];
    }

    public Matrix addWith(Matrix matrix1){
        for (int i=0;i<this.rows;i++) {
            for (int j=0;j<this.columns;j++) {
                int sum = this.getMatrixValue(i,j) + matrix1.getMatrixValue(i,j);
                this.initializeValue(i,j,sum);
            }
        }
        return this;
    }

    public Matrix multiplyWith(Matrix matrix1){
        for (int i=0;i<this.rows;i++) {
            int sumOfProduct = 0;
            for (int j=0;j<matrix1.rows;j++ ) {
                sumOfProduct += this.getMatrixValue(i,j) * matrix1.getMatrixValue(j,i);
            }
            for(int k=0;k<this.rows;k++){
                this.initializeValue(i,k,sumOfProduct);
            }
        }
        return this;
    }
}

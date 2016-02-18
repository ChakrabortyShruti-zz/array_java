class Matrix{
    // int matrix[][];
    public Matrix(){
    }

    public int[][] createMatrix(int rows, int columns){
        return new int[rows][columns];
    }

    public int[][] initializeMatrix(int value, int[][] matrix){
        // System.out.println(matrix.length);
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[i].length;j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }
}

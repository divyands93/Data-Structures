import java.util.*; 
  
public class Islands { 
    static int Row = 5;
    static int Col = 5;
    boolean isSafe(int[][] M, int row, int col, boolean[][]visited) {
        return row>=0 && row<Row && col>=0  &&  col<Col && (M[row][col]==1 && !visited[row][col]);
    }
    void DFS(int[][] M, boolean[][] visited, int row, int col) {
        visited[row][col] = true;
        int[] rowNbr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] colNbr = {-1, 0, 1, -1, 1, -1, 0, 1};
        for(int i=0; i<8; i++) {
            if(isSafe(M, row+rowNbr[i], col+colNbr[i], visited)) {
               DFS(M, visited, row+rowNbr[i], col+colNbr[i]);
            }
        }
    }
    int countIslands(int[][] M) {
        boolean visited[][]  = new boolean[Row][Col];
        int count = 0;
        for(int i=0;i<Row;i++) {
            for(int j=0; j<Col; j++) {
                if(M[i][j]==1 && visited[i][j]!= true ) {
                    DFS(M, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) throws java.lang.Exception 
    { 
        int M[][] = new int[][] { { 1, 1, 0, 0, 0 }, 
                                  { 0, 1, 0, 0, 1 }, 
                                  { 1, 0, 0, 1, 1 }, 
                                  { 0, 0, 0, 0, 0 }, 
                                  { 1, 0, 1, 0, 1 } }; 
        Islands I = new Islands(); 
        System.out.println("Number of islands is: " + I.countIslands(M)); 
    } 
}

public class Task1 {
    public static int[][] nextGeneration(int inputGrid[][]) {
        int m = 10, n = 10;
        int[][] future = new int[m][n];

        // iterate over each row (start with 0 because an array index is 0 based)
        for (int x = 0; x < m; x++) {
            // iterate over each column (start with 0 as well)
            for (int y = 0; y < n; y++) {
                int aliveNeighbours = 0;
                int rowAbove = Math.max(x - 1, 0); // the row above is x-1 but never less than 0 because that row doesn't exist
                int rowBelow = Math.min(x + 1, m - 1); // the row below is never greater than the last row in the array (height - 1)
                int colLeft = Math.max(y - 1, 0); // go to the left one column, unless we are at the edge, then don't go past 0
                int colRight = Math.min(y + 1, n - 1); // ... continuing the same logic as above
                for (int rowToCheck = rowAbove; rowToCheck <= rowBelow; rowToCheck++)
                    for (int colToCheck = colLeft; colToCheck <= colRight; colToCheck++)
                        aliveNeighbours += inputGrid[rowToCheck][colToCheck];


                aliveNeighbours -= inputGrid[x][y];


                if (aliveNeighbours == 3)
                    future[x][y] = 1;

                else if (aliveNeighbours < 2)
                    future[x][y] = 0;

                else if (aliveNeighbours >= 4)
                    future[x][y] = 0;

                else if (aliveNeighbours == 2)
                    future[x][y] = inputGrid[x][y];
                else
                    throw new RuntimeException("Unhandled neighbor condition");
            }
        }
        return future;
    }

    public static void main(String[] args) {
        int[][] game =
                {{0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
                        {0, 0, 0, 0, 0, 0, 0, 0, 1, 0}
                };

        var nextGen = nextGeneration(game);

        for (var row : nextGen) {
            for (var cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
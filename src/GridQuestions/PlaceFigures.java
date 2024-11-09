package GridQuestions;

import java.util.Arrays;

public class PlaceFigures {

    public static void main(String[] args) {

        int n = 4;
        int m = 4;
        char[] figures = {'D', 'B', 'A', 'C'};

        System.out.println(Arrays.deepToString(solution(n, m, figures)));
    }

    // Define shapes for each figure as 2D arrays
    private static final int[][][] FIGURES = {
            // 'A' Shape
            {{1, 1, 1, 1}},
            // 'B' Shape
            {{1, 1}, {1, 1}},
            // 'C' Shape
            {{1, 0}, {1, 0}, {1, 1}},
            // 'D' Shape
            {{0, 1}, {1, 1}, {0, 1}},
            // 'E' Shape
            {{0, 1, 0}, {1, 1, 1}}
    };

    public static int[][] solution(int n, int m, char[] figures) {
        int[][] grid = new int[n][m];

        for (int i = 0; i < figures.length; i++) {
            char figureType = figures[i];
            int figureIndex = figureType - 'A';
            int[][] figureShape = FIGURES[figureIndex];

            // Find the placement for the current figure
            int[] position = findPlacement(grid, figureShape, i + 1);
            int row = position[0];
            int col = position[1];

            // Place the figure on the grid
            placeFigure(grid, figureShape, row, col, i + 1);
        }

        return grid;
    }

    // Helper method to find the placement position for the figure
    private static int[] findPlacement(int[][] grid, int[][] shape, int figureIndex) {
        int n = grid.length, m = grid[0].length;
        int shapeHeight = shape.length, shapeWidth = shape[0].length;

        for (int r = 0; r <= n - shapeHeight; r++) {
            for (int c = 0; c <= m - shapeWidth; c++) {
                if (canPlace(grid, shape, r, c)) {
                    return new int[]{r, c}; // Return the first valid position
                }
            }
        }

        return null; // Should never happen as per problem constraints
    }

    // Helper method to check if the figure can be placed at (row, col)
    private static boolean canPlace(int[][] grid, int[][] shape, int row, int col) {
        int shapeHeight = shape.length;
        int shapeWidth = shape[0].length;

        for (int r = 0; r < shapeHeight; r++) {
            for (int c = 0; c < shapeWidth; c++) {
                if (shape[r][c] == 1 && grid[row + r][col + c] != 0) {
                    return false; // Cannot place if any cell is already occupied
                }
            }
        }
        return true;
    }

    // Helper method to place the figure on the grid
    private static void placeFigure(int[][] grid, int[][] shape, int row, int col, int figureIndex) {
        int shapeHeight = shape.length;
        int shapeWidth = shape[0].length;

        for (int r = 0; r < shapeHeight; r++) {
            for (int c = 0; c < shapeWidth; c++) {
                if (shape[r][c] == 1) {
                    grid[row + r][col + c] = figureIndex;
                }
            }
        }
    }

}

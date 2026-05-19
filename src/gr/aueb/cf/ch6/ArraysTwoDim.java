package gr.aueb.cf.ch6;

/**
 * Ορίζει ένα 2D array και το κάνει
 * populate. Arrays ορίζονται ως [γραμμή][στήλη].
 */

public class ArraysTwoDim {

    public static void main(String[] args) {
        int [][] grid = new int[2][3];

        int[][] grid2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        grid[0][0] = 5;
        grid[0][1] = 10;
        grid[0][2] = 20;
        grid[1][0] = 15;
        grid[1][1] = 20;
        grid[1][2] = 25;

        for (int i = 0; i < grid.length; i++) { // Το grid.length σου δίνει τον αριθμό των γραμμών (εδώ είναι 2).
            for (int j = 0; j < grid[i].length; j++) { // Το grid[i].length σου δίνει τον αριθμό των στηλών(κουτάκια) για τη συγκεκριμένη γραμμή i (εδώ είναι 3).
                System.out.print(grid[i][j] + " "); // Για i & j να είναι 0, τυπώνει το grid[0][0]. Εδώ το 5.
            }
            System.out.println();
        }

        for (int[] row : grid) { // Πάρε μία-μία τις ΓΡΑΜΜΕΣ
            for (int el : row) { // Πάρε ένα-ένα τα ΣΤΟΙΧΕΙΑ της γραμμής
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}

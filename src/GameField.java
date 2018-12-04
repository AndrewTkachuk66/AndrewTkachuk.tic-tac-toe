import java.util.ArrayList;
import java.util.List;

class GameField {
    public int i, j;
    private int[][] array;
    public boolean win;

    public int[][] getArray() {
        return array;
    }

    public GameField() {
        array = new int[3][3];
    }

    //printing gameField
    public void print() {
        for (i = 0; i < 3; i++) {
            System.out.println(" -------------");
            for (j = 0; j < 3; j++) {
                System.out.print(" | ");
                if (array[i][j] == 0)
                    System.out.print(" ");
                else if (array[i][j] == 1)
                    System.out.print("O");
                else if (array[i][j] == 2)
                    System.out.print("X");

            }
            System.out.println(" | ");
        }
        System.out.println(" -------------");
        System.out.println();
    }

    // user go
    public void putO(int i, int j) {
        array[i][j] = 1;
    }

    // boot go
    public void putX(int i, int j) { array[i][j] = 2; }

    public void clean() {
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                array[i][j] = 0;
            }
        }
    }
    // finding free cell
    public List<Cell> freeCell() {
        List<Cell> cells = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == 0) {
                    cells.add(new Cell(i, j));
                }
            }
        }
        return cells;
    }

    public boolean whoWin() {
        //user win
        if (array[0][0] == 1 && array[0][1] == 1 && array[0][2] == 1) {
            System.out.println("User win");
            win = true;
        }
        if (array[0][0] == 1 && array[1][0] == 1 && array[2][0] == 1) {
            System.out.println("User win");
            win = true;
        }
        if (array[1][0] == 1 && array[1][1] == 1 && array[1][2] == 1) {
            System.out.println("User win");
            win = true;
        }
        if (array[2][0] == 1 && array[2][1] == 1 && array[2][2] == 1) {
            System.out.println("User win");
            win = true;
        }
        if (array[0][1] == 1 && array[1][1] == 1 && array[2][1] == 1) {
            System.out.println("User win");
            win = true;
        }
        if (array[0][2] == 1 && array[1][2] == 1 && array[2][2] == 1) {
            System.out.println("User win");
            win = true;
        }
        if (array[0][0] == 1 && array[1][1] == 1 && array[2][2] == 1) {
            System.out.println("User win");
            win = true;
        }
        if (array[2][0] == 1 && array[1][1] == 1 && array[0][2] == 1) {
            System.out.println("User win");
            win = true;
        }
        // boot win
        if (array[0][0] == 2 && array[0][1] == 2 && array[0][2] == 2) {
            System.out.println("Bot win");
            win = true;

        }
        if (array[0][0] == 2 && array[1][0] == 2 && array[2][0] == 2) {
            System.out.println("Bot win");
            win = true;
        }
        if (array[1][0] == 2 && array[1][1] == 2 && array[1][2] == 2) {
            System.out.println("Bot win");
            win = true;
        }
        if (array[2][0] == 2 && array[2][1] == 2 && array[2][2] == 2) {
            System.out.println("Bot win");
            win = true;
        }
        if (array[0][1] == 2 && array[1][1] == 2 && array[2][1] == 2) {
            System.out.println("Bot win");
            win = true;
        }
        if (array[0][2] == 2 && array[1][2] == 2 && array[2][2] == 2) {
            System.out.println("Bot win");
            win = true;
        }
        if (array[0][0] == 2 && array[1][1] == 2 && array[2][2] == 2) {
            System.out.println("Bot win");
            win = true;

        }
        if (array[2][0] == 2 && array[1][1] == 2 && array[0][2] == 2) {
            System.out.println("Bot win");
            win = true;
        }
        return win;
    }
}
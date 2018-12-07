import java.util.List;

public class Bot {
    int pos;
    public static GameField gameField;
    List<Cell>  cells;


    public Bot(GameField gameField){
        this.gameField = gameField;
        cells = gameField.freeCell();

    }

    public void goBot(){
        cells = gameField.freeCell();
        if (cells.size() > 0) {
            pos = Bot.smartBot();
            Cell cell = cells.get(pos);
            gameField.putX(cell.x, cell.y);
        }
    }

    public static int smartBot(){
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                int array[][];
                array = gameField.getArray();
                // victorious combinations
                if (array[0][0]== 2 && array[0][2]== 2)  return 0;
                if (array[0][0]== 2 && array[0][1]== 2)  return 0;
                if (array[2][2]== 2 && array[1][1]== 2)  return 0;

                // defense
                if (array[1][1]== 1 && array[2][2]== 1 && array[0][0]== 2 && array[0][2]== 2)  return 3;
                if (array[1][0]== 1 && array[2][0]== 1 && array[0][2]== 1 && array[2][2]== 1 && array[0][0]== 2 && array[1][1]== 2 && array[1][2]== 2)  return 1;
                if (array[2][1]== 1 && array[2][2]== 1 && array[0][2]== 1 && array[1][1]== 2 && array[2][0]== 2 )  return 0;
                if (array[1][2]== 1 && array[2][2]== 1 && array[2][0]== 1 && array[1][1]== 2 && array[0][2]== 2 && array[0][1]== 1 )  return 0;
                if (array[1][2]== 1 && array[2][2]== 1 && array[2][0]== 1 && array[1][1]== 2 && array[0][2]== 2 )  return 3;
                if (array[1][0]== 1 && array[0][1]== 1 && array[0][2]== 1 && array[2][2]== 1 && array[1][1]== 2 && array[1][2]== 2 && array[2][1]== 2 )  return 0;
                if (array[1][0]== 1 && array[2][0]== 1 && array[0][2]== 1 && array[1][1]== 2 && array[1][2]== 2 && array[1][2]== 2 )  return 0;
                if (array[1][0]== 1 && array[2][0]== 1 && array[0][2]== 1 && array[1][1]== 2 && array[2][2]== 1 )  return 1;
                if (array[1][1]== 1 && array[1][0]== 1 && array[1][0]== 1 && array[0][0]== 2 && array[1][2]== 2 )  return 1;
                if (array[0][1]== 1 && array[1][1]== 1 && array[2][0]== 1 && array[0][0]== 2 && array[2][1]== 2)  return 0;
                if (array[1][1]== 1 && array[0][2]== 1 && array[0][0]== 2 && array[2][0]== 2 && array[0][1]== 1 )  return 0;
                if (array[1][1]== 1 && array[0][2]== 1 && array[0][0]== 2 && array[2][0]== 2 )  return 1;
                if (array[1][0]== 1 && array[1][1]== 1 && array[0][0]== 2 && array[0][2]== 2 && array[2][1]== 2 )  return 0;
                if (array[0][1]== 1 && array[1][1]== 1 && array[0][0]== 2 && array[0][2]== 2 )  return 2;
                if (array[1][1]== 1 && array[2][2]== 1 && array[0][0]== 2)  return 1;
                if (array[0][0]== 1 && array[0][1]== 1)  return 0;
                if (array[2][0]== 1 && array[1][1]== 1)  return 1;
                if (array[1][1]== 1 && array[0][2]== 1)  return 3;
                if (array[0][1]== 1 && array[1][1]== 1)  return 4;
                if (array[1][1]== 1 && array[1][2]== 1)  return 2;
                if (array[1][1]== 1 && array[1][0]== 1)  return 2;
                if (array[1][2]== 1 && array[2][2]== 1)  return 2;
                if (array[2][1]== 1 && array[2][2]== 1)  return 5;
                if (array[0][0]== 1 && array[0][2]== 1)  return 0;
                if (array[0][0]== 1 && array[2][0]== 1)  return 2;
                if (array[2][2]== 1 && array[2][0]== 1)  return 5;
                if (array[0][0]== 1 && array[1][0]== 1)  return 2;
                if (array[0][2]== 1 && array[1][2]== 1)  return 5;
                if (array[0][1]== 1 && array[2][1]== 1)  return 2;

                // first step
                if (array[1][1] == 1) return 0;
                if (array[0][0]== 1 || array[0][2]== 1)  return 3;
                if (array[2][0]== 1 || array[2][2]== 1)  return 4;
                if (array[1][0]== 1 || array[0][1]== 1)  return 0;
                if (array[2][1]== 1 || array[1][2]== 1)  return 2;

            }
        }
        return 0;
    }
}

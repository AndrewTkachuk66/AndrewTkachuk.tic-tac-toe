import java.util.List;
import java.util.Random;

public class Bot {
    int pos;
    GameField gameField;
    List<Cell>  cells;

    public Bot(GameField gameField){
        this.gameField = gameField;
        cells = gameField.freeCell();
    }

    public void goBot(){
        cells = gameField.freeCell();
        if (cells.size() > 0) {
            pos = new Random().nextInt(cells.size());
            Cell cell = cells.get(pos);
            gameField.putX(cell.x, cell.y);
        }
    }
}

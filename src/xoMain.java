import java.util.Scanner;

public class xoMain {
    public static void main(String[] args) {
       boolean win =  false;
       GameField gameField = new GameField();
       Bot bot = new Bot(gameField);
       gameField.print();
       System.out.println("Start game");
       Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5 ; i++) {
            if (win == true)
                break;
            System.out.println("Enter сoordinates from 0 to 2:");
            int x;
            int y;
            do {
                x = scanner.nextInt();
                y = scanner.nextInt();
            } while (x > 2 || y > 2);
            gameField.putO(x, y);
            gameField.print();
            System.out.println("Boot goes");
            bot.goBot();
            gameField.print();
            win = gameField.whoWin();
        }
        if(win == false) System.out.println("A draw");
    }
}

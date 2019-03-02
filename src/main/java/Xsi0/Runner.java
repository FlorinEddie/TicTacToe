package Xsi0;

public class Runner {

    public static void main(String[] args) {


        Player player1 = new Player("Florin", Board.Mark.MARK_X);
        Player player2 = new Player("Mihai",Board.Mark.MARK_0);


        TicTacToeConsole console = new TicTacToeConsole(player1, player2);
        console.start();


        }
    }


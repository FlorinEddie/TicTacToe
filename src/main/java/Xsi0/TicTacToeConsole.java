package Xsi0;

import java.util.Scanner;

public class TicTacToeConsole extends Arbitru {

    Scanner sc;

    public TicTacToeConsole(Player a, Player b)
    {
        super(a,b);
        sc = new Scanner(System.in);
    }


    public int[] getCoord() {
        int row = sc.nextInt();
        int col = sc.nextInt();

        return new int[]{row, col};

    }
}





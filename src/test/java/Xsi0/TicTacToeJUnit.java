package Xsi0;

public class TicTacToeJUnit extends Arbitru {

    int[][] coord;
    int currentMove;

    public TicTacToeJUnit(Player a, Player b, int[][] coord)
    {
        super(a,b);
        this.coord = coord;
        currentMove = 0;
    }


    public int[] getCoord() {
        return coord[currentMove++];
    }
}

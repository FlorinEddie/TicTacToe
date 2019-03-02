package Xsi0;

import org.junit.Assert;

public class Test {

    @org.junit.Test
    public void testWinX()
    {
        int [][] coord = new int[][]{{0,0},{1,1},{0,1},{2,2},{0,2}};
        Player a = new Player("Gandalf", Board.Mark.MARK_0);
        Player b = new Player("Dumbeldore", Board.Mark.MARK_X);
        TicTacToeJUnit obj = new TicTacToeJUnit(a,b,coord);
        Assert.assertEquals(b, obj.start());
    }

    @org.junit.Test
    public void testWin0()
    {
        int [][] coord = new int[][]{{1,0},{0,0},{1,1},{0,1},{2,2},{0,2}};
        Player a = new Player("Gandalf", Board.Mark.MARK_0);
        Player b = new Player("Dumbeldore", Board.Mark.MARK_X);
        TicTacToeJUnit obj = new TicTacToeJUnit(a,b,coord);
        Assert.assertEquals(a, obj.start());
    }
}
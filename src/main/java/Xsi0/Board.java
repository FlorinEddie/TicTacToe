package Xsi0;

public class Board {



    public enum Mark {
        MARK_X {
            @Override
            public String toString() {
                return "X";
            }


        },
        MARK_0{
            @Override
            public String toString(){
                return "0";
            }

        },
        MARK_EMPTY{
            @Override
            public String toString(){
                return "E";
            }
        }
    }




    private Mark table [][];

    Board(){
        table = new Mark[3][3];
        for( int  i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = Mark.MARK_EMPTY;
            }
        }
    }

    public void move(int row, int col, Mark mark) {
        table[row][col]=mark;
    }

    @Override
    public String toString (){
        StringBuilder aux = new StringBuilder("");
        for( int  i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                aux.append(table[i][j].toString() + "   ") ;
            }

            aux.append("\n");

        }
        return aux.toString();
    }

    Mark getWinner( int row, int col){
        if ( table[row][0] != Mark.MARK_EMPTY &&
        table [row][0] == table[row][1]&&
        table [row][0] == table[row][2])
        {
            return  table[row][col];
        }

        if ( table[0][col] != Mark.MARK_EMPTY &&
        table [0][col] == table [1][col] &&
        table [0][col] == table [2][col])
        {
            return table [row][col];
        }

        if ( table [0][0] != Mark.MARK_EMPTY &&
                table [0][0] == table [1][1] &&
                table [1][1] == table [2][2])
        {
            return table [1][1];

        }

        if ( table [2][0] != Mark.MARK_EMPTY &&
        table [2][0] == table [1][1] &&
        table [1][1] == table [0][2])
        {
            return table [2][0];
        }

        return Mark.MARK_EMPTY;
    }

    boolean isGameOver( int row, int col){
        if ( getWinner( row, col)!= Mark.MARK_EMPTY){
            return true;
        }

        return false;

    }

}

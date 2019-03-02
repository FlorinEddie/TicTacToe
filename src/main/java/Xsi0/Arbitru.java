package Xsi0;

abstract class Arbitru implements Readable {

    Board c;
    Player p1;
    Player p2;
    boolean xTurn;

    Arbitru(Player a, Player b){

        c = new Board();
        this.p1 = a;
        this.p2 = b;
        this.xTurn = true;

    }

    @Override
    public String toString(){
       return p1 + "  " + p2;


    }

    public Player start(){
        int coord[];
        while (true){
            coord = getCoord();
            c.move(coord[0], coord[1], xTurn ? Board.Mark.MARK_X : Board.Mark.MARK_0);
            if ( xTurn == true ){
                xTurn = false;
            }
            else if (xTurn == false){
                        xTurn = true;

                    }
                    if ( c.isGameOver( coord[0], coord[1])) {
                        break;
                    }

                    System.out.println(c);
        }

        Board.Mark aux = c.getWinner(coord[0], coord[1]);

        if ( aux == p1.getSimbol()){
            return p1;
        }
        System.out.println(" Felicitari, ai castigat  "  +p1);


        if ( aux == p2.getSimbol()){
            return p2;
        }
        System.out.println(" Felicitari, ai castigat  "  +p2);

        return null;


    }





}

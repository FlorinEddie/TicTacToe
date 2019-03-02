package Xsi0;


public class Player {

    private String name;
    private Board.Mark simbol;

    Player(String name, Board.Mark simbol) {

        this.name = name;
        this.simbol = simbol;
    }

    public Board.Mark getSimbol(){
        return simbol;

    }
    @Override
    public String toString(){
        return name + simbol;
    }

}

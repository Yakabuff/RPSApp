package eecs1022.lab3;

public class Game {

    String name1;
    String name2;
    int p1Wins = 0;
    int p2Wins = 0;
    int roundNumber = 0;
    String result;

    boolean p1IsWinner = false;
    boolean p2IsWinner = false;
    public Game() {


    }

    @Override
    public String toString() {
        getWinner();
        String s = "";
        if(roundNumber>0) {
            if(p1IsWinner==true || p2IsWinner==true) {
                s = "Round" + roundNumber + " finished: " + result + "\n" + "Game is over";

            }else if( p1Wins<2 && p2Wins <2){
                s = "Round" + roundNumber + " finished: " + result;
            }
        }else{

           s = "New game started."+ "\n"+ "Enter Names of players";
        }

        return s;
    }

    void setIdentity(String name1, String name2){
        this.name1 = name1;
        this.name2 = name2;
    }

    void player1Win() {
        p1Wins = p1Wins+1;

    }

    void player2Win() {

        p2Wins = p2Wins+1;
    }

    void roundCounter(){
        if(hasReachedMaximum()==false){
            roundNumber = roundNumber+1;
        }else{
            roundNumber = roundNumber;
        }

    }

    boolean hasReachedMaximum(){
        boolean max= false;
        if(roundNumber==3){
            max = true;
        }
        return max;
    }

    void finishRound(String p1Choice, String p2Choice){


    if(roundNumber<3) {
        if(p1IsWinner ==false && p2IsWinner==false) {
            if (p1Choice.equals("Rock") && p2Choice.equals("Scissors")) {
                player1Win();
            } else if (p1Choice.equals("Rock") && p2Choice.equals("Rock")) {

            } else if (p1Choice.equals("Rock") && p2Choice.equals("Paper")) {
                player2Win();
            } else if (p1Choice.equals("Paper") && p2Choice.equals("Paper")) {

            } else if (p1Choice.equals("Paper") && p2Choice.equals("Scissors")) {
                player2Win();
            } else if (p1Choice.equals("Paper") && p2Choice.equals("Rock")) {
                player1Win();
            } else if (p1Choice.equals("Scissors") && p2Choice.equals("Paper")) {
                player1Win();
            } else if (p1Choice.equals("Scissors") && p2Choice.equals("Scissors")) {

            } else if (p1Choice.equals("Scissors") && p2Choice.equals("Rock")) {
                player2Win();

            }
            roundCounter();
            checkFinalWinner();
        }


    }else if(roundNumber==3){
        roundNumber= roundNumber+0;
        checkFinalWinner();

    }

    }



    String getWinner(){


        if (p1Wins > p2Wins) {
            result = "Winner is "+this.name1;

        } else if (p2Wins > p1Wins) {
            result = "Winner is "+this.name2;

        } else {
            result = "Tie between "+this.name1+" and "+this.name2;
        }

        return result;
    }

    void checkFinalWinner(){
        if(p1Wins==2){
            p1IsWinner = true;

        }else if(p2Wins==2){
            p2IsWinner = true;
        }
    }

}
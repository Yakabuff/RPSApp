package eecs1022.lab3;

public class GameTester {
    public static void main(String args[]){
        //Create new game with names
        Game game = new Game();
        game.setIdentity("bob", "jon");

        //Complete round 1. Update round counter and player score
        game.finishRound("Paper", "Paper");

        System.out.println(game.toString());

        //Complete round 2. Update round counter and player score
        game.finishRound("Paper", "Paper");

        System.out.println(game.toString());

        //Complete round 2. Update round counter and player score
        game.finishRound("Paper", "Paper");

        System.out.println(game.toString());
    }
}
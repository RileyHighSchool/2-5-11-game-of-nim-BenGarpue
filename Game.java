import java.util.Scanner;

public class Game {



  private Player player1;
  private Player currentPlayer;
  private Player player2;


    public Game(){
        player1 = new Player();
        player2 = new Player();
        
    }

    public void setFirstPlayer(){

        if (Math.random() < .5){
          currentPlayer = player1;
        }
          else{
            currentPlayer = player2;
          }
    }

    public void endGame(){

        if (currentPlayer == player1){
            System.out.println("Congratulations " + player2.getName() + " you win");
            player2.updateScore(1);
          } else {
            System.out.println("Congratulations " + player1.getName() + " you win");
            player1.updateScore(1);
          }
          System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

           Scanner sc = new Scanner(System.in);
           System.out.println("Do you want to play again? (y/n)");
           String input = sc.nextLine();

           if (input.equals("y")){
            Board.populate();
            play();

        
           }



    }

    public void switchPlayer(){
      if (currentPlayer == player1){
        currentPlayer = player2;
      } else{
        currentPlayer = player1;
      }

    }

    public void play(){

        setFirstPlayer();

        while (Board.getPileSize() > 1 ) {
          
        
          System.out.println(currentPlayer.getName() + "'s turn: ");
          System.out.println("There are " + Board.getPileSize() + " pieces.");

          Board.takePieces();
          switchPlayer();
        }
        endGame();
    }
  }
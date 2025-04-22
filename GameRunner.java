/**
 * Project 2.5.11
 *
 * GameRunner Class for the Game of Nim 
*/
public class GameRunner
{
  private static Player player1;
  private static Player player2;
  private  Board board;
  
  
  
    public static void main(String[] args)
    {
      System.out.println("Welcome to the Game of Nim!");
  
      Board.populate(); // static method call
      
      Game nim = new Game(); 
      nim.play();

    
  }
}
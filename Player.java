import java.util.Scanner;

public class Player {

    private int score;
    private String name;

    public Player(){
  Scanner sc = new Scanner(System.in);
  System.out.println("what is your name");
  name = sc.nextLine();
  score = 0;
}

 public Player(String n ){
  name = n;
  score = 0;
 }

 public String getName(){
  return name;
 }

 public int getScore(){
  return score;
 }
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
  public void updateScore(int s){
      score += s;
  }
  public void setName(String n){
    name = n;
  }
}


import java.util.Scanner;


public class Board {
    private  static int pileSize;
    
    public static void populate(){
        int randomInt = (int)(Math.random() * 40) + 10; 
        pileSize = randomInt;
    }


    public static void takePieces(){
            Scanner sc = new Scanner(System.in);
            System.out.println("how many pieces do you want to take?");
            int pieces = sc.nextInt();

            while (pieces > pileSize/2 || pieces < 1){
                System.out.println("Try again");
                pieces = sc.nextInt();
            }
            pileSize -= pieces;
    }

    public static int getPileSize(){
        return pileSize;
    }


}

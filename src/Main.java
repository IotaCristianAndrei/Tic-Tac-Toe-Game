import java.util.Scanner;

public class Main {

    private static boolean gameOver = false;
    public static void setGameOver(boolean val){
        gameOver=val;
    }

    public static void main(String[] args) {
        Board board = new Board();
        int move= 1;
        int movesDone=0;
        String value="";

        board.printBoard();

        System.out.println("Welcome to the tic tac toe game! Player 1 is first.");

        while (gameOver==false){

            // Checks which player's move is. If the move is an even number, it's player 1, if it's an odd number,it's player 2.

            if (move%2!=0){
                System.out.println("Player 1 turn. Please select a move between 1-9.");
                value="X";
                move++;
            }else if (move%2==0){
                System.out.println("Player 2 turn. Please select a move between 1-9.");
                value="O";
                move++;
            }

            Scanner scanner = new Scanner(System.in);
            int pick = scanner.nextInt();

            //Checks if the player's move is valid
            try {
                //Checks if the number that the player chose is within the range
                if (!(pick>=0 && pick<=8)){
                    System.out.println("Invalid move. Please choose again.");
                    move--;
                    continue;
                }
                //Checks if the position the player chose is already occupied by another move
                if (board.getValue(pick)=="X" || board.getValue(pick)=="O"){
                    System.out.println("Invalid move. Please choose again.");
                    move--;
                    continue;
                }
            }catch (Exception e){
                System.out.println("Invalid move. Please choose again.");
            }
            board.setValue(value,pick);
            movesDone++;
            board.printBoard();
            board.checkWinner();

            if(movesDone==9){
                System.out.println("The game has ended as a draw.");
                gameOver=true;
            }

        }

    }
}

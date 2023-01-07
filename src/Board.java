public class Board {
    private String [] board = {"0","1","2","3","4","5","6","7","8"};
    public void printBoard(){
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | "
                + board[1] + " | " + board[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | "
                + board[4] + " | " + board[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | "
                + board[7] + " | " + board[8]
                + " |");
        System.out.println("|---|---|---|");
        System.out.println();
        }

       public void setValue(String value, int index){

        board[index]=value.toUpperCase();
       }

       public String getValue(int index){

        return board[index];
       }


       public void checkWinner(){
        for (int i=0;i<8;i++){
            String result=null;
            switch (i) {
                case 0:
                    result = board[0] + board[1] + board[2];
                    break;
                case 1:
                    result = board[3] + board[4] + board[5];
                    break;
                case 2:
                    result = board[6] + board[7] + board[8];
                    break;
                case 3:
                    result = board[0] + board[3] + board[6];
                    break;
                case 4:
                    result = board[1] + board[4] + board[7];
                    break;
                case 5:
                    result = board[2] + board[5] + board[8];
                    break;
                case 6:
                    result = board[0] + board[4] + board[8];
                    break;
                case 7:
                    result = board[2] + board[4] + board[6];
                    break;
            }
            if (result.equals("XXX")){
                System.out.println("3 X in line. Player 1 won.");
                Main.setGameOver(true);
            }else if(result.equals("OOO")){
                System.out.println("3 O in line. Player 2 won.");
                Main.setGameOver(true);
            }
        }
       }
}

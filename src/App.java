import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        boolean playing = true;
        Scanner scn = new Scanner(System.in);
        int turn = 1;
        String a = "A";

        while(playing == true){
            outboard(board);
            System.out.println("It is Player " + turn + "'s turn. ");
            System.out.println("Select an x value (1-9): ");
            int x = scn.nextInt();
            System.out.println("Select a y value (1-9): ");
            int y = scn.nextInt();

            if (y > 9 || y < 1 || x > 9 || x < 1){
                System.out.println("That position is out of the board's boundaries. Please select a valid position.");
                continue;
            }
            if(board[y-1][x-1] == "A" || board[y-1][x-1] == "0"){
                System.out.println("Someone has already played there. Please select a valid position.");
                continue;
            }

            if (turn == 1){
                a = "A";
                board[y-1][x-1] = a;
                turn = 2;
            } else {
                a = "0";
                board[y-1][x-1] = a;
                turn = 1;  
            }

            System.out.println("You selected position (" + x + ", " + y + ") and placed " + a);
        }
    }
    static String[][] board = {
        {"+", "+", "+", "+", "+", "+", "+", "+", "+"},
        {"+", "+", "+", "+", "+", "+", "+", "+", "+"},
        {"+", "+", "+", "+", "+", "+", "+", "+", "+"},
        {"+", "+", "+", "+", "+", "+", "+", "+", "+"},
        {"+", "+", "+", "+", "+", "+", "+", "+", "+"},
        {"+", "+", "+", "+", "+", "+", "+", "+", "+"},
        {"+", "+", "+", "+", "+", "+", "+", "+", "+"},
        {"+", "+", "+", "+", "+", "+", "+", "+", "+"},
        {"+", "+", "+", "+", "+", "+", "+", "+", "+"},
        
    };

    static void outboard(String[][]board){
        boolean empt = true;
        String tempt = " ";
        

        for(int i = 0; i < board.length; i++){
            //System.out.println(" _ _ _ _ _ _ _ _ _");
            System.out.println();
            for(int j = 0; j < board[i].length; j++){
                tempt = board[i][j];
                System.out.print(tempt);
                };
                //System.out.print("|");
            System.out.println();
        };
    };
}



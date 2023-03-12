import java.util.ArrayList;

public class Board {

    char[][] board = {{'#', '#', '#', '#', '#'},
            {'#', '1', '2', '3', '#'},
            {'#', '4', '5', '6', '#'},
            {'#', '7', '8', '9', '#'},
            {'#', '#', '#', '#', '#'}
    };

    ArrayList<Character> guessed = new ArrayList<>();

    public void print() {
        for (int i = 0; i < this.board.length; i++) {
            System.out.println();
            for (int j = 0; j < this.board[i].length; j++) {
                System.out.print(this.board[i][j]);

            }

        }
        System.out.println();
    }

    public void move(char sign, char move) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == move) {
                    board[i][j] = sign;
                }
            }
        }
    }

    public boolean checkIfTaken(char move) {
        if (guessed.contains(move)) {
            alredyTaken();
        }
        return true;
    }

    public void alredyTaken() {
        System.out.println("Den rutan är redan tagen!");
    }

    public boolean checkIfWon(char sign) {
        for (int i = 0; i < board.length; i++) {
            for (int j = i + 1; j < board.length; j++) {
                for (int k = i + 2; k < board.length; k++) {
                    if (board[1][1] == sign && board[1][2] == sign && board[1][3] == sign) { //rad 1
                        return true;
                    }
                    if (board[2][1] == sign && board[2][2] == sign && board[2][3] == sign) { //rad 2
                        return true;
                    }
                    if (board[3][1] == sign && board[3][2] == sign && board[3][3] == sign) { //rad 3
                        return true;
                    }
                    if (board[1][1] == sign && board[2][1] == sign && board[3][1] == sign) { //kolumn 1
                        return true;
                    }
                    if (board[1][2] == sign && board[2][2] == sign && board[3][2] == sign) { //kolumn 2
                        return true;
                    }
                    if (board[1][3] == sign && board[2][3] == sign && board[3][3] == sign) { //kolumn 3
                        return true;
                    }
                    if (board[1][1] == sign && board[2][2] == sign && board[3][3] == sign) { //diagonal 1
                        return true;
                    }
                    if (board[1][3] == sign && board[2][2] == sign && board[3][1] == sign) { //diagonal 2
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

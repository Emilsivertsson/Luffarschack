import java.util.Arrays;

public class Board {

    char[][] board = {{'#','#','#','#','#'},
            {'#','1','2','3','#'},
            {'#','4','5','6','#'},
            {'#','7','8','9','#'},
            {'#','#','#','#','#'}
            };


    public void print(){
        for (int i = 0; i < this.board.length ; i++) {
            System.out.println();
            for (int j = 0; j <this.board[i].length ; j++) {
                System.out.print(this.board[i][j]);

            }

        }
        System.out.println();
    }

    public char[][] getboard (){
        return this.board;
    }

    public void setBoard(int row, int col,char move) {
        board[row] [col] = move;
    }

    public boolean checkIfTaken(int row, int col){
        if (board[row][col] == 'P' || board[row][col] == 'O' ){
            alredyTaken();
            return false;
        }
        else {
            return true;
        }

    }


    private static void alredyTaken() {
        System.out.println("Den rutan är redan tagen!");
    }
}

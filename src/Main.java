import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Board board = new Board();
        Menu menu = new Menu();

        Player player1 = new Player("Player one");
        Player player2 = new Player("Player two");



        while (true) {
            menu.menu();

            int choice = 0;
            int move = 0;
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    menu.onePlayer();
                    scanner.nextLine();
                    player1.setName(scanner.nextLine());
                    board.print();
                    menu.makeYourMove();
                    move = scanner.nextInt();

                    //Arrays.asList(board.getboard()).indexOf(move);

                    switch (move){
                        case 1:
                            if (board.checkIfTaken(1,1)){
                                board.setBoard(1,1,'P');
                            //fortsätt här!!!
                        }
                            break;
                        case 2:
                            board.checkIfTaken(1,2);
                            break;
                        case 3:
                            board.checkIfTaken(1,3);
                            break;
                        case 4:
                            board.checkIfTaken(2,1);
                            break;
                        case 5:
                            board.checkIfTaken(2,2);
                            break;
                        case 6:
                            board.checkIfTaken(2,3);
                            break;
                        case 7:
                            board.checkIfTaken(3,1);
                            break;
                        case 8:
                            board.checkIfTaken(3,2);
                            break;
                        case 9:
                            board.checkIfTaken(3,3);
                            break;
                        default:
                            menu.invalid();
                            break;

                    }
                    break;
                case 2:
                    menu.onePlayer(true);
                    scanner.nextLine();
                    player1.setName(scanner.nextLine());
                    menu.twoPlayers();
                    scanner.nextLine();
                    player2.setName(scanner.nextLine());
                    board.print();

                    break;
                case 3:
                    menu.exitGame();
                    System.exit(0);
                    break;
                default:
                    menu.invalid();
                    break;
            }




            }

        }
    }
}
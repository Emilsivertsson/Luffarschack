
import java.util.Scanner;

public class Logic {

    Scanner scanner = new Scanner(System.in);


    Board board = new Board();
    Menu menu = new Menu();

    Player player1 = new Player("Player one", 'P');
    Player player2 = new Player("Player two", 'X');
    Computer computer = new Computer('C');


    public void startGame() {


        while (true) {
            menu.menu();

            int choice;

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    menu.onePlayer();
                    scanner.nextLine();
                    player1.setName(scanner.nextLine());
                    while(true){
                        board.print();
                        menu.makeYourMove(player1);
                        moveSwitch(player1);
                        if (board.checkIfWon(player1.getSign())){
                            menu.winner(player1.getName());
                            playAgain();
                        }

                        board.print();

                        char computerRound = computer.getComputerMove();
                        if (!board.guessed.contains(computerRound)) {
                            board.move(computer.getSign(), computerRound);
                            menu.computerMove();
                        } else {
                            computerRound = computer.getComputerMove();
                            board.move(computer.getSign(), computerRound);
                        }
                        if (board.checkIfWon(computer.getSign())){
                            menu.lose();
                            playAgain();
                        }

                    }
                }
                case 2 -> {
                    boolean twoPlayers = true;
                    menu.onePlayer(twoPlayers);
                    scanner.nextLine();
                    player1.setName(scanner.nextLine());
                    menu.twoPlayers();
                    player2.setName(scanner.nextLine());
                    scanner.nextLine();

                    while(true) {
                        board.print();
                        menu.makeYourMove(player1);
                        moveSwitch(player1);
                        if (board.checkIfWon(player1.getSign())) {
                            menu.winner(player1.getName());
                            playAgain();
                        }
                        board.print();
                        menu.makeYourMove(player2);
                        moveSwitch(player2);
                        if (board.checkIfWon(player2.getSign())) {
                            menu.winner(player2.getName());
                            playAgain();
                        }
                    }
                }
                case 3 -> {
                    menu.exitGame();
                    System.exit(0);
                }
                default -> menu.invalid();
            }
        }


    }

    private void moveSwitch(Player player) {
        char move;
        Scanner scanner = new Scanner(System.in);
        move = scanner.next().charAt(0);

        switch (move) {
            case '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
                if (board.checkIfTaken(move)) {
                    board.move(player.getSign(), move);
                    board.guessed.add(move);
                }
                else {
                    board.alredyTaken();
                }

            }

            default -> menu.invalid();
        }
    }

    public void playAgain(){
        while (true){
            menu.playAgain();
            String choice;
            choice = scanner.nextLine();
            choice = choice.toLowerCase();
            switch (choice){
                case "j" -> {
                    board.guessed.clear();
                    board.board = new char[][]{{'#', '#', '#', '#', '#'},
                            {'#', '1', '2', '3', '#'},
                            {'#', '4', '5', '6', '#'},
                            {'#', '7', '8', '9', '#'},
                            {'#', '#', '#', '#', '#'}
                    };
                    startGame();
                }
                case "n" -> {
                    menu.exitGame();
                    System.exit(0);
                }
                default -> menu.invalid();
            }
        }
    }

}

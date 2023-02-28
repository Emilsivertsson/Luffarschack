import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void menu(){
        System.out.println("Välkommen att spela en omgång luffarschack!");
        System.out.println("1 . Vill du starta ett spel för en spelare?");
        System.out.println("2 . Vill du starta ett spel för två spelare?");
        System.out.println("3 . Vill du avsluta spelet?                 ");
        System.out.println("            Gör ditt val:                   ");

    }


    public void onePlayer(){
        System.out.println("Vad är ditt namn?");
    }

    public void onePlayer(boolean two){
        System.out.println("Vad är ditt namn, Spelare Ett?");
    }


    public void twoPlayers(){
        System.out.println("Och vad är ditt namn Spelare Två? ");
    }

    public void exitGame(){
        System.out.println("Tack för att du spelade!");
    }

    public void invalid(){
        System.out.println("Det valet finns tyvärr inte, försök igen!");
    }

    public void makeYourMove(){
        System.out.println("Ange vilken ruta du vill ta!");
    }
}

package se.robinstrang;

import static com.diogonunes.jcolor.Ansi.*;
import static com.diogonunes.jcolor.Attribute.*;

//int width = Integer.parseInt(System.console().readLine());
//String game = (System.console().readLine());


public class BankSystem {

    //Loggar in
    public void LogOn(){
        System.out.println(colorize("Välkommen till bankens inloggning.", YELLOW_TEXT()));
        System.out.println(colorize("Skriv in din email:", YELLOW_TEXT()));
        String account = (System.console().readLine());
        System.out.println(colorize("Skriv in lösenord:", YELLOW_TEXT()));
        String password = (System.console().readLine());

    }

    //Skapar konto
    public void Create(){
        System.out.println(colorize("Tryck 1 för att skapa konto, eller 2 för att gå tillbaka", YELLOW_TEXT()));
        int conOrExit = Integer.parseInt(System.console().readLine());
        if (conOrExit == 2){
            System.out.println(colorize("Går tillbaka till huvudmeny", YELLOW_TEXT()));
        }
        else if ( conOrExit == 1){
            System.out.println(colorize("Skriv in din email:", YELLOW_TEXT()));
            String account = (System.console().readLine());
            System.out.println(colorize("Skriv in lösenord:", YELLOW_TEXT()));
            String password = (System.console().readLine());
            }
    }
    //Huvudmeny
    public void Run(){
        
        while (true){

            String account = "";
            String password = "";

            System.out.println(colorize("*** Huvudmeny ***", YELLOW_TEXT()));
            System.out.println(colorize("1. Logga in", BLUE_TEXT()));
            System.out.println(colorize("2. Skapa konto", BLUE_TEXT()));
            System.out.println(colorize("3. Avsluta", RED_TEXT()));
            System.out.println(colorize("Välj något alternativ:", YELLOW_TEXT()));
            int selection = Integer.parseInt(System.console().readLine());

            if (selection == 3){
                System.out.println(colorize("Välkommen åter!", YELLOW_TEXT()));
                break;
            }
            if (selection == 2){
                Create();
            }
            if (selection == 1){
                LogOn();
            }
        }
    }
}

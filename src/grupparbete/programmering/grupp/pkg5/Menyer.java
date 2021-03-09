/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupparbete.programmering.grupp.pkg5;

/**
 *
 * @author Bax Musik
 */
public class Menyer {
    private static int val;
    //Boolean för felaktigt val i menyn
    private static boolean felaktigInput = false;
    
    public static int HuvudMeny(){
             
        // Huvudmenyn som presenteras.
        do {            
            System.out.println("");
            System.out.println("Hej och välkommen till vår Bilhall!");
            System.out.println("_______________________________________");
            System.out.println("Vad vill du göra idag?");
            System.out.println("_______________________________________");
            System.out.println("");
            System.out.println("För att serva din bil - Tryck 1");
            System.out.println("För att få din bil tvättad - Tryck 2");
            System.out.println("För att titta på bil - Tryck 3");
            System.out.println("För att köpa bil - Tryck 4");
            System.out.println("För att sälja din bil till oss - Tryck 5");
            
            // Användaren/kunden får göra sitt val (vad som ska göras i bilhallen idag).
            try {
                val = BilHall.GetInput();
                if(val < 1 || val > 5){
                    System.out.println("Välj en siffra 1 till 5 !");
                    felaktigInput = true;
                }
            } catch (Exception e) {
                System.out.println("Felaktigt val, försök igen.");
                felaktigInput = true;
            }            
        } while (felaktigInput);
        return val ;
    }
    
    public static int VerkstadsMenyn(){
        do {            
            System.out.println("Välkommen till verkstaden!");
            System.out.println("____________________________");
            System.out.println("Vi erbjuder följande service");
            System.out.println("____________________________");
            System.out.println("Tryck 1 för Bromsservice");
            System.out.println("Tryck 2 för Motorservice");
            System.out.println("Tryck 3 för Däckservice");
            System.out.println("");
            System.out.print("Val: ");
            
            // Användaren/kunden får göra sitt val
            try {
                val = BilHall.GetInput();
                if(val < 1 || val > 3){
                    System.out.println("Välj en siffra 1 till 3 !");
                    felaktigInput = true;
                }
            } catch (Exception e) {
                System.out.println("Felaktigt val, försök igen.");
                felaktigInput = true;
            } 
            
        } while (felaktigInput);
        return val;
    }
    
}

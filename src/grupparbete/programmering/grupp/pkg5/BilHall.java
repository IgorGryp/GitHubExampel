/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupparbete.programmering.grupp.pkg5;

import java.util.ArrayList;

/**
 *
 * @author lilja
 */
public class BilHall {

   
    public static void main(String[] args) {
       
        // Skapar bilar/objekt/instanser av klassen Bilar
        Bilar bil1 = new Bilar("Volvo", "V70", "2008", "Silvermetallic", 9000, 95000, "Manuell");
        Bilar bil2 = new Bilar("Honda", "Accord", "2005", "Vit", 20000, 45000, "Manuell");
        Bilar bil3 = new Bilar("Volkswagen", "Golf", "2013", "Svart", 5000, 105000, "Automat");
        
        // Huvudmenyn som presenteras
        System.out.println("Hej och välkommen till våran Bilhall!");
        System.out.println("_______________________________________");
        System.out.println("Vad vill du göra idag?");
        System.out.println("_______________________________________");
        System.out.println("");
        System.out.println("För att serva din bil - Tryck 1");
        System.out.println("För att få din bil tvättad - Tryck 2");
        System.out.println("För att titta på bil - Tryck 3");
        System.out.println("För att köpa bil - Tryck 4");
        System.out.println("För att sälja din bil till oss - Tryck 5");
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupparbete.programmering.grupp.pkg5;

import java.util.Scanner;

/**
 *
 * @author lilja
 */
public class BilHall {

   
   
    public static void main(String[] args) { 
    
        // Skapar person/instans av klassen Köpare.    
        Kund Kalle = new Kund("Kalle Andersson", "901005-2936", 0, true, 100000);
    
        // Lägger till Kalle till listan.    
        Kund.ListaKunder.add(Kalle);
    
        //Fyller på listaBilar med bilar från lagret
        Lager.SkapaListaBilar();

        // Menystrukturen ligger inne i en While-loop med vilkoret true (vilket den alltid är) för att "börja om" 
        // när användaren är klar i respektive undermeny           
        while (true){

        //Användaren/kunden får göra sitt val (vad som ska göras i bilhallen idag).
        int menyVal = Menyer.HuvudMeny();
    
        System.out.println("");//Kosmetisk rad
            //TODO snyggare att ändra dessa if-satser till switchcase
            if (menyVal == 1){
                menyVal = Menyer.VerkstadsMenyn();
                Service.ServiceVal(menyVal);
            }       
            else if (menyVal == 2){
                Tvatt.TvattVal();
            }     
            else if (menyVal == 3){
                Lager.BilarILager();
            }
            else if (menyVal == 4){
                Lager.KopaBil();
            }   
            else if (menyVal == 5){
                Kund.KundSaljaBil();
            }    
            else {
                //Detta allternativ kommer aldrig att kunna nås valet begränsas till 1-5 i huvudmenyns inputssäkrare
                // Om kunden inte vill ha "hjälp" får kunden säga till och tas automatiskt tillbaka till startmenyn.
                System.out.println("Säljare: Jag förstår om du vill fundera. Säg till om du vill ha hjälp!");
            }
        }//While loopens slut
    }
    
        //GetInput funktion integer
        public static int GetInput(){
            Scanner scan = new Scanner(System.in);
            int input = Integer.parseInt(scan.next());//Parse to int för att säkerställa exception om inte tolkbart till integer
            return input;
        }
        //GetInputString funktion String
        public static String GetInputString(){
            Scanner scan = new Scanner(System.in);//Försäkra om inget slask i buffertminnet
            String input = scan.next().trim(); //Trimmar bort tomrum innan och efter text
            return input;
        }
}

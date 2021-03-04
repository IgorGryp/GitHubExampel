/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupparbete.programmering.grupp.pkg5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lilja
 */
public class BilHall {

   
   
    public static void main(String[] args) { 
        
    // Skapar en metod som genererar en slumpmässig boolean "random".
    // Vid service genereras olika utfall beroende på om denna är sann eller falsk.

    Random randBoolean = new Random ();
    boolean random = randBoolean.nextBoolean();

    // Skapar objektet scan för att kunna läsa av användarens val/input.
    
    Scanner scan = new Scanner (System.in);
    
    // Skapar person/instans av klassen Köpare.
    
    Kopare Kalle = new Kopare("Kalle Andersson", "901005-2936", 0, true, 100000);
    
    // Lägger till Kalle till listan.
    
    Kopare.listaKopare.add(Kalle);
    
    // Skapar bilar/objekt/instanser av klassen Bilar
    Bilar bil1 = new Bilar("Volvo", "V70", "2008", "silver metallic", 9000, 95000, "manuell");
    Bilar bil2 = new Bilar("Honda", "Accord", "2005", "vit", 20000, 45000, "manuell");
    Bilar bil3 = new Bilar("Volkswagen", "Golf", "2013", "svart", 5000, 105000, "automat");
    Bilar bil4 = new Bilar("Kia", "Ceed", "2004","Vit", 2400, 56000, "manuell");
    
    // Lägger till olika bilar till listan över tillgängliga bilar i bilhallen.
    
    Bilar.listaBilar.add(bil1);
    Bilar.listaBilar.add(bil2);
    Bilar.listaBilar.add(bil3);
    Bilar.listaBilar.add(bil4);
    Bilar.listaBilar.add(new Bilar("BMW", "320i", "2009", "grå metallic", 9800, 150000, "automat"));
    
    
    // Menystrukturen ligger inne i en While-loop med vilkoret true (vilket den alltid är) för att "börja om" 
    // när användaren är klar i respektive undermeny
    
    while (true){
    // Huvudmenyn som presenteras.
    
    System.out.println("");
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
    
    // Användaren/kunden får göra sitt val (vad som ska göras i bilhallen idag).
    
    int menyval = scan.nextInt();
    System.out.println("");
       
        if (menyval == 1){
            System.out.println("Välkommen till verkstaden!");
            System.out.println("____________________________");
            System.out.println("Vi erbjuder följande service");
            System.out.println("____________________________");
            System.out.println("Tryck 1 för Bromsservice");
            System.out.println("Tryck 2 för Motorservice");
            System.out.println("Tryck 3 för Däckservice");
            System.out.println("");
            System.out.print("Val: "); int verkstadsval = scan.nextInt();
            
            // Random-metoderna nedanför i den "nästlade" IF-satsen ger slumpmässiga utfall om verkstaden behöver göra något arbete eller ej.
            
            if (verkstadsval == 1){
                System.out.println("Bromsservice. Nu kollar vi dina bromsar.");
                    if (random == true){
                        Service.BromsService();
                    }
                    else {
                        System.out.println("Bromsarna ser bra ut och behöver inte bytas!");
                    }               
            }          
            if (verkstadsval == 2){
                System.out.println("Motorservice. Nu kollar vi motorns skick.");
                    if (random == true){
                        Service.MotorService();
                    } 
                    else {
                        System.out.println("Motoroljan ser bra ut, behöver inte bytas. Motorn är OK.");
                    }       
            }            
            if (verkstadsval == 3)
                System.out.println("Däckservice. Nu kollar vi skicket på däcken");
                if (random == true){
                    Service.DackService();
                }
                else {
                    System.out.println("Däcken behöver inte bytas. Mönsterdjupet är bra.");
                }             
        }
        
        else if (menyval == 2){
            System.out.println("Välkommen till våran tvättavdelning!");
        }
        
        else if (menyval == 3){
            System.out.println("Vad roligt att du vill titta på en av våra bilar i lager");
            System.out.println("Vi har följande bilar att erbjuda");
            System.out.println("");
            
            // Skapar en räknare för att visa rätt indexposition i ArrayListan för bilar (börjar på 0, d.v.s. samma som index i listan)
            int j = 0;
            
            // En forEach-loop går igenom listan med bilar och anropar medtoden Beskrivning () i klassen bilar som skriver ut information
            // Samtidigt så räknas räknaren upp och skrivs ut för varje varv. På så vis får varje bil ett nummer man kan hänvisa till.
            // När första indexet i listan skrivs ut kommer räknaren dock ha värde 1, så detta behöver man hålla koll på längre ned när.
            // kunden sen ska välja bil.
            
            for (Bilar i: Bilar.listaBilar)
            {
                j++;
                System.out.print("Alternativ " + j);
                i.Beskrivning();                   
            }
        }
    
        else if (menyval == 4){
            System.out.println("Säljare: Jag har förstått att du har bestämt dig för en bil. Vilken föll valet på?");
            System.out.println("Det blir får bli bil nummer: "); int kopval = scan.nextInt();
            
            // Kund gör ett val mot bakgrund av listan som presenterades i menyn ovan (valet scannas av). Observera att vi behöver "backa" kundens val 
            // med -1 p.g.a. att räknaren och Arrayen inte riktigt stämmer överens när vi anropar vilket objekt/bil som ska köpas i metoden Kopa (). Köpet genomförs. 
            // Objektet/bilen tas sedan bort ifrån ArrayListan med metoden remove.
            
            Bilar.listaBilar.get(kopval-1).Kopa();
            Bilar.listaBilar.remove(kopval-1);
            System.out.println("Stort GRATTIS till din nya fina bil!");
            System.out.println("");
            
            System.out.println("Till bilen INGÅR dessutom en försäkring i 3 månader!");
            System.out.println("");
            
            // Beroende på hur långt bilen/objektet har gått så ingår en hel eller halvförsäkring i köpet.
            // Detta kollar vi genom att anropa objektets attribut för antal mil och anropar olika metoder i
            // klassen för försäkring beroende på utfall.
            
            System.out.print("Eftersom bilen har gått " + Bilar.listaBilar.get(kopval-1).mil + " mil så ingår det en ");
            
            if (Bilar.listaBilar.get(kopval-1).mil < 8000){
                Forsakring.tecknaHelForsakring();
            } 
            else {
                Forsakring.tecknaHalvForsakring();
            }
            
            // En nyligen köpt bil behöver tvättas innan leverans. Tvättavdelningen och deras metod för Stor tvätt anropas.
            // Även serviceavdelningen involveras. Tyvärr visar det sig att bilen inte är i det bästa skicket :)
            
            System.out.println("Jag ska bara ringa till våran tvättavdelning och be dem tvätta av bilen innan leverans. ");
            System.out.println("Likaså kommer vi göra en avstämning av bromsarna, däck och motorn på service-avdelningen innan leverans.");
            System.out.println("");
            System.out.println("Protokollet från dessa genomgångar syns nedanför: ");
            System.out.println("");
            Tvatt.StorTvatt();
            Service.BromsService();
            Service.DackService();
            Service.MotorService();
            
            System.out.println("Vi hörs av och stämmer av en passande dag för leverans framöver!");
        }
            
        else if (menyval == 5){
            // Kunden vill sälja bilen till bilhallen. Denna behöver komma in i listan över bilar och för att få all information
            // om bilen som vi behöver så ställer vi några frågor om bilen som kunden får svara på. Svaren scannas av och sparas i
            // relevanta variabler. 
            
            System.out.println("Köpa in bil. Vänligen ange mer information om din modell.");
            System.out.println("Vad är det för bilmärke?"); 
            String inkopTillverkare = scan.next();
            System.out.println("Vad är det för modell?");
            String inkopModell = scan.next();
            System.out.println("Vad är det för årsmodell?");
            String inkopArsmodell = scan.next();
            System.out.println("Vad är det för färg på bilen?");
            String inkopFarg = scan.next();
            System.out.println("Hur många mil har bilen gått?");
            int inkopMil = scan.nextInt();
            System.out.println("Hur mycket vill ni ha för bilen?");
            int inkopPris = scan.nextInt();
            System.out.println("Vad är det för typ av växellåda på bilen?");
            String inkopVaxellada = scan.next();
            System.out.println("");
            
            // När all information är sparad i variabler används dessa i metoden KopaInBil som ligger i Bilar-klassen. 
            // Variablerna används som in-parametrar för metoden och så att rätt information kommer in i listan över bilar.
            
            Bilar.KopaInBil(inkopTillverkare, inkopModell, inkopArsmodell, inkopFarg, inkopMil, inkopPris, inkopVaxellada);
            
            System.out.println("Tack för informationen! Vi köper in din bil för " + inkopPris + " kr och den finns nu i vårat lager");
            System.out.println("Ha en trevlig dag och titta gärna på de andra bilarna vi har i lager!");           
        }
        
        else {
            // Om kunden inte vill ha "hjälp" får kunden säga till och tas automatiskt tillbaka till startmenyn.
            System.out.println("Jag förstår om du vill fundera. Säg till om du vill ha hjälp!");
        }



  }
}
}

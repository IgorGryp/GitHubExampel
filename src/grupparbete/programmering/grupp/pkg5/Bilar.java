/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupparbete.programmering.grupp.pkg5;

import java.util.ArrayList;

/**
 *
 * @author schum
 */
public class Bilar {
    
    // Attribut för klassen bilar
    String arsmodell;
    String farg;
    String modell;
    String tillverkare;
    int mil;
    int pris;
    String vaxellada;
    
    // Skapar en ArrayList för bilarna som finns i lager
    public static ArrayList <Bilar> listaBilar = new ArrayList<>();
    
    
    // Skapar konstruktor för klassen Bilar
    public Bilar (String tillverkare, String modell, String arsmodell, String farg, int mil, int pris, String vaxellada){
        this.tillverkare = tillverkare;
        this.modell = modell;
        this.arsmodell = arsmodell;
        this. farg = farg;
        this.mil = mil;
        this.pris = pris;
        this.vaxellada = vaxellada;
        }
    
    public void Beskrivning(){
        System.out.println(": " +this.tillverkare + " " + this.modell + " årsmodell " +this.arsmodell + " i färgen " + this.farg + " som har gått " + this.mil + " mil" + " och kostar " + this.pris + ":- " + "Växellådan är " + this.vaxellada +".");
    }
    
    public void Kopa (){
        System.out.println("Säljare: Vad roligt att du vill köpa denna " + this.tillverkare + " " + this.modell + " för " + this.pris + " kr av oss!");
    }
    
    public static void KopaInBil (String inkopTillverkare, String inkopModell, String inkopArsmodell, String inkopFarg, int inkopMil, int inkopPris, String inkopVaxellada){
       Bilar.listaBilar.add(new Bilar(inkopTillverkare, inkopModell, inkopArsmodell, inkopFarg, inkopMil, inkopPris, inkopVaxellada));
    }
}

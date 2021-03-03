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
    public static ArrayList <Bilar> Bilar = new ArrayList<>();
    
    
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
}

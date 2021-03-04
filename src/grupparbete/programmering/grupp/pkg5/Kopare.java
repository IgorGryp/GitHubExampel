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
public class Kopare {
    
    
    // Attribut för klassen Köpare
    String namn;
    String personnummer;
    int telefonnummer;
    boolean korkort;
    int pengar;
    
    // Skapar en ArrayList för bilarna som finns i lager
    public static ArrayList <Kopare> listaKopare = new ArrayList<>();
    
    // Konstruktor för klassen Köpare
    public Kopare (String namn, String personnummer, int telefonnummer, boolean kortkort, int pengar){
        this.namn = namn;
        this.personnummer = personnummer;
        this.telefonnummer = telefonnummer;
        this.korkort = kortkort;
        this.pengar = pengar;
    }
}

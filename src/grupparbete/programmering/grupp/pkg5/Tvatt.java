/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupparbete.programmering.grupp.pkg5;

/**
 *
 * @author schum
 */
public class Tvatt {
    
    String avspolad;
    String schamponerad;
    String dammsugen;
    String glasputs;
    
// Konstruktor för klassen för att kunna skapa olika "tvättpaket"    
public Tvatt (String avspolad, String schamponerad, String dammsugen, String glasputs){
    this.avspolad = avspolad;
    this.schamponerad = schamponerad;
    this. dammsugen = dammsugen;
    this.glasputs = glasputs;
}


public void LitenTvatt () {
    System.out.println("Nu är bilen" + this.avspolad + "och en liten tvätt är utförd");
}

public void MellanTvatt () {
    System.out.println("Nu är bilen" + this.avspolad + " och " + this.schamponerad + "och en mellanstor tvätt är utförd");
}

public void StorTvatt () {
    System.out.println("Nu är bilen" + this.avspolad + " och " + this.schamponerad + " samt " + this.dammsugen + " och en " + this.glasputs + " är utförd. En stor tvätt");
}  

}





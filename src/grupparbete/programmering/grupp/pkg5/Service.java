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
public class Service {
    
    // Attribut för serviceverkstaden. Dessa arbeten kan utföras på bilen.
    boolean bromsar;
    boolean dack;
    boolean motor;
    

// Skapar metoder för de olika servicealternativen som erbjuds
public void BromsService (){
    if (bromsar == true){
        System.out.println("Nu är bromsarna på bilen okej!");
    }
    else{
        System.out.println("Bromsarna är slut och behöver bytas");
    }
}

public void DackService () {
    if (dack == true){
        System.out.println("Nu har vi bytt till nya fina däck på bilen!"); 
    }
    else{
        System.out.println("Däcken är dåliga och behöver bytas");
    }
}

public void MotorService (){
    if (motor == true){
        System.out.println("Motoroljan är bytt och motorn är OK!");
    }
    else{
        System.out.println("Oljan har gått många mil och motorn behöver en översyn");
    }
}

}

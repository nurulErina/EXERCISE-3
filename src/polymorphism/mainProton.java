/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;


public class mainProton {

    public static void main(String[] args) {
   
       
        protonPersona p = new protonPersona();
        System.out.println("Proton Persona features:- ");
        p.boot();
        p.fuels();
        p.printProton();
        p.run();
        p.colour("\nOncean Blue \nRed \nYellow Mustard \nBlack");
       
       
        protonSaga s = new protonSaga();
        System.out.println("\nProton Saga features:- ");
        s.fuel();
        s.printProton();
        s.sum(30000,45000);
        s.run();
        s.colour("\nWhite \nSilver \nPurple \nRed Velvet");
        
        protonX50 x5 = new protonX50();
        System.out.println("\nProton X50 features:- ");
        x5.autoPark();
        x5.sum(79000,85000,103000);
        x5.run();
        x5.colour("\nWhite \nBlack \nSilver \nYellow");
        
        protonX70 x7 = new protonX70();
        System.out.println("\nProton X70 features:- ");
        x7.drive();
        x7.run();
        x7.colour("\nWhite \nBlack \nRed \nPink");
          
    }
    
    
}

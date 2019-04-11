/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author fernando
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        fabricaDeAviao exemplo = new fabricaDeAviao();
       
        
        exemplo = fabricaDeAviao.getInstancia();
         exemplo.modelo = "AIRBUS A320";
        System.out.println(exemplo.modelo);
        
        fabricaDeAviao exemplo2 = new fabricaDeAviao();
         exemplo2 = fabricaDeAviao.getInstancia();
         exemplo2.modelo = "AIRBUS A380";
        System.out.println(exemplo2.modelo);
        System.out.println(exemplo.modelo);
        
        
    }
    
}

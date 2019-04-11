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
public class fabricaDeAviao {
    
    public static fabricaDeAviao instancia;
    
    public String modelo;
    
    protected fabricaDeAviao(){
    
        
        
    }
    
     public static fabricaDeAviao getInstancia() {
        if (instancia == null){
            instancia = new fabricaDeAviao();
        }
        return instancia;
    }
    
    
}

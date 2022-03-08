/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancegemink;

/**
 *
 * @author ASUS A455L
 */
public class Inheritorgemink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Sapi inheritence1 =  new Sapi();
       Cicak inheritence2 = new Cicak();
       
        System.out.println(inheritence1.makan());
        System.out.println(inheritence1.berkembangbiak());
        
        System.out.println("=====================");
        System.out.println(inheritence2.makan());
        System.out.println(inheritence2.berkembangbiak());
    }
    
}

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
public class Sapi extends hewan{
    @Override
            
    String makan (){
        System.out.println(super.makan());
        return "Rumput";
        
    }
    @Override
  String berkembangbiak(){
        System.out.println(super.berkembangbiak());
        return "Beranak";
    }
}

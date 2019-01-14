/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persoa per = new Persoa();
       Canario car = new Canario();
       Galo gal = new Galo();
       
       per.cantar();
       car.cantar();
       gal.cantar();
       IPodeCantar obx = new Persoa();
       per.cantar();
        System.out.println("**********");
       Tenor te = new Tenor();
       te.cantar();
       car.cantar();
    }
    
}

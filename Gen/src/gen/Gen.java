/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gen;

/**
 *
 * @author Administrator
 */
public class Gen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Studpair<String, Integer> obj1 = new Studpair<String, Integer>("Ismail", 17);
        System.out.println(obj1.StudN());
        System.out.println(obj1.StudRN());
        
    }
    
}

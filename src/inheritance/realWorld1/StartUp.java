/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.realWorld1;

/**
 *
 * @author Carson Schultz
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beer b = new SpottedCow();
        System.out.println(b.getBrandName());
    }
    
}
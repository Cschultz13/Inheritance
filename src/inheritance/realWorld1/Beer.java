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
public abstract class Beer implements Beverage{
    private String brandName;
    private String name;
    
    
    public abstract String getAlcoholPercent();
    
    public abstract String getBrandName();
    
}

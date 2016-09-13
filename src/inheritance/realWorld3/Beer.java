/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.realWorld3;

/**
 *
 * @author Carson Schultz
 */
public class Beer extends Beverage{
    private String brand;
    private String alcoholPercent;

    
    public String getAlcoholPercent() {        
       String p ="The Alcohol Content is 4.5%";
        return alcoholPercent = p;
    }

    
    public String getBrandName() {
        String b = "The brand is New Glarus";
        return brand = b;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAlcoholPercent(String alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }

    
}

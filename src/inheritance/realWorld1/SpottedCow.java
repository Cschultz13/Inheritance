
package inheritance.realWorld1;

/**
 *
 * @author Carson Schultz
 */
public class SpottedCow extends Beer{
    private String brand;
    private String alcoholPercent;

    @Override
    public String getAlcoholPercent() {        
       String p ="The Alcohol Content is 4.5%";
        return alcoholPercent = p;
    }

    @Override
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

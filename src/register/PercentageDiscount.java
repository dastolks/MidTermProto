/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;

/**
 *
 * @author aschindler1
 */
public class PercentageDiscount implements DiscountStrategy{
    private double discount = 0;
    
    public PercentageDiscount(double d){
        discount = d;
    }
    
    @Override
    public double getDiscount() {
        return discount;
    }
    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
}

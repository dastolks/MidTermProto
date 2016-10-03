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
public class BuyAmountGetFree implements DiscountStrategy{
    public double discount = 0;
    public double amountNeeded = 0;

    public BuyAmountGetFree(double d, double a) {
        discount = d;
        amountNeeded = a;
    }   
    @Override
    public double getDiscount() {
        return discount;
    }
    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getAmountNeeded() {
        return amountNeeded;
    }

    public void setAmountNeeded(double amountNeeded) {
        this.amountNeeded = amountNeeded;
    }
    
    
}

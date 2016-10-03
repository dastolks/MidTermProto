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
public interface DiscountStrategy {
    //getting the discount, but note that while it will return a double,
    //the double is relative to the calculation needed in it.
    double getDiscount();

    void setDiscount(double discount);
    
}

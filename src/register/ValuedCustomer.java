/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;

/**
 *
 * @author Alec
 */
public class ValuedCustomer implements Customer {
    private double timeActive = 0;
    private String name = "";
    private double id = 0;
    private double deal = 0;
    
    public ValuedCustomer(String n, double i, double t){
        timeActive = t;  
        name = n;
        id = i;
    }
    @Override
    public final double getTimeActive() {
        return timeActive;
    }
    @Override
    public final void setTimeActive(double timeActive) {
        this.timeActive = timeActive;
    }
    @Override
    public final String getName() {
        return name;
    }
    @Override
    public final void setName(String name) {
        this.name = name;
    }
    @Override
    public final double getId() {
        return id;
    }
    @Override
    public final void setId(double id) {
        this.id = id;
    }

    public double getDeal() {
        return deal;
    }

    public void setDeal(double deal) {
        this.deal = deal;
    }
    
    
}

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
public class NewCustomer implements Customer {
    private double timeActive = 0;
    private String name = "";
    private double id = 0;
    
    public NewCustomer(String n, double i){
        timeActive = 0;
        name = n;
        id = i;
    }

    @Override
    public double getTimeActive() {
        return timeActive;
    }

    @Override
    public void setTimeActive(double timeActive) {
        this.timeActive = timeActive;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getId() {
        return id;
    }

    @Override
    public void setId(double id) {
        this.id = id;
    }
    
    
}

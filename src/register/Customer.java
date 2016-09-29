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
public interface Customer {

    double getId();

    String getName();

    double getTimeActive();

    void setId(double id);

    void setName(String name);

    void setTimeActive(double timeActive);
    
}

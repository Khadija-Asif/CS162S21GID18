/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author KHADIJA
 */
public class ManagingDirector extends Person{
    private String loginID;
    
    /**
     * Function to set ID
     *
     * @param ID
     */
    public void setID(String ID) {
        this.loginID = ID;
    }
    
    /**
     * getter function to get ID
     *
     * @return
     */
    public String getID() {
        return this.loginID;
    }
}

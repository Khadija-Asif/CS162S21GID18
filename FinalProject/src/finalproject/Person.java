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
public class Person {

    //Common Attributes of EmailID, Password, and Contact Number for Customer/Managing Director

    private String EmailID;
    private String pass;
    private String contactNumber;


    /**
     * Function to set Email
     *
     * @param email
     */
    public void setEmailId(String email) {
        this.EmailID = email;
    }

    /**
     * Function to set Number
     *
     * @param number
     */
    public void setContactNumber(String number) {
        this.contactNumber = number;
    }

    /**
     * Function to set password
     *
     * @param pass
     */
    public void setPassword(String pass) {
        this.pass = pass;
    }

    /**
     * Function to get Email Id
     *
     * @return
     */
    public String getEmailId() {
        return this.EmailID;
    }

    /**
     * Function to get Contact Number
     *
     * @return
     */
    public String getContactNumber() {
        return this.contactNumber;
    }

    /**
     * Function to get Password
     *
     * @return
     */
    public String getPassword() {
        return this.pass;
    }

    /**
     * Function to get class type
     *
     * @return
     */
    public String getType() {
        return "Person";
    }

    /**
     * toString function
     *
     * @return
     */
    @Override
    public String toString() {
        return this.EmailID + this.pass + this.contactNumber ;
    }

    /**
     * Function to set email, password, number
     *
     * @param email
     * @param password
     * @param num
     */
    public void setter(String email, String password, String num) {
        this.EmailID = email;
        this.pass = password;
        this.contactNumber = num;
    }

}

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

    //Common Attributes of name, EmailID, Password, and Contact Number for Customer/Managing Director
    private String name;
    private String EmailID;
    private String pass;
    private String contactNumber;

    /**
     * Function to set Name
     *
     * @param Name
     */
    public void setName(String Name) {
        this.name = Name;
    }

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
     * getter function to get Name
     *
     * @return
     */
    public String getName() {
        return this.name;
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
        return this.contactNumber + this.name + this.EmailID + this.pass;
    }

    /**
     * Function to set email , name , number
     *
     * @param name
     * @param num
     * @param email
     * @param password
     */
    public void setter(String name, String num, String email, String password) {
        this.name = name;
        this.contactNumber = num;
        this.EmailID = email;
        this.pass = password;
    }

}

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
public class Customer extends Person {

    private String name;
    private String Address;
    private String CityName;
    private String PostalCode;

    /**
     * Function to set Name
     *
     * @param Name
     */
    public void setName(String Name) {
        this.name = Name;
    }
    
    /**
     * Function to set Customer Address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.Address = address;
    }

    /**
     * Function to set City Name of a Customer/Client
     *
     * @param city
     */
    public void setCityName(String city) {
        this.CityName = city;
    }

    /**
     * Function to set postal Code
     *
     * @param code
     */
    public void setCustomerPostalCode(String code) {
        this.PostalCode = code;
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
     * Function to get Address
     *
     * @return
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Function to get City Name
     *
     * @return
     */
    public String getCityName() {
        return this.CityName;
    }

    /**
     * Function to get Postal Code
     *
     * @return
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Function to get class type
     *
     * @return
     */
    public String getType() {
        return "Customer";
    }

    /**
     * toString function
     *
     * @return
     */
    @Override
    public String toString() {
        return this.name + this.Address + this.CityName + this.PostalCode;
    }

    /**
     * Function to set name, set Address , City Name , Postal Code
     *
     * @param name
     * @param address
     * @param city //City Name of a Customer/Client
     * @param code //Postal Code
     */
    public void setter(String name, String address, String city, String code) {
        this.name = name;
        this.Address = address;
        this.CityName = city;
        this.PostalCode = code;
    }

}

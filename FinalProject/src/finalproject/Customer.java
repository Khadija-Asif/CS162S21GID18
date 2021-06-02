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

    private String Address;
    private String CityName;
    private String PostalCode;

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
        return this.Address + this.CityName + this.PostalCode;
    }

    /**
     * Function to set Address , City Name , Postal Code
     *
     * @param address
     * @param city //City Name of a Customer/Client
     * @param code //Postal Code
     */
    public void setter(String address, String city, String code) {
        this.Address = address;
        this.CityName = city;
        this.PostalCode = code;
    }

}

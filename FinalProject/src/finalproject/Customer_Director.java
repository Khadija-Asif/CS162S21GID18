/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;



import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author KHADIJA
 */
public class Customer_Director extends Person implements PersonInterface {

    // Attributes for Director
    private String loginID;
    // Attributes for Customer
    private String name;
    private String Address;
    private String CityName;
    private String PostalCode;

    //Create objects for Product class and 
    static ArrayList<Products> prod = new ArrayList<Products>();

// Function for Director
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

// Function for Customer
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

    //Add Function For products
    public void add(Products pro)
    {
        
        if (pro.getType().equals("Products")) {
            prod.add(pro);
            System.out.println("Products");
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    //Function to add sales for Sales
    public void addSales(LinkedList<Products> list , Products pro )
    {
        if(pro.getType().equals("Sales"))
        {
            System.out.println("Sales");
            list.add(pro);
        }
    }

    @Override
    public String getType() {
        return "Customer_Director";
    }
}

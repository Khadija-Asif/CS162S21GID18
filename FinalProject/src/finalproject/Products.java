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
public class Products {

    private String ProductID;
    private String ProductName;
    private int ProductPrice;
    private int ProductQuantity;
    private String ProductType;

    /**
     * Function to set Product ID
     *
     * @param ID
     */
    public void setProductID(String ID) {
        this.ProductID = ID;
    }

    /**
     * Function to set Product Name
     *
     * @param name
     */
    public void setProductName(String name) {
        this.ProductName = name;
    }

    /**
     * Function to set Product Price
     *
     * @param price
     */
    public void setProductPrice(int price) {
        this.ProductPrice = price;
    }

    /**
     * Function to set Product Quantity
     *
     * @param quantity
     */
    public void setProductQuantity(int quantity) {
        this.ProductQuantity = quantity;
    }

    /**
     * Function to set Product Type
     *
     * @param type
     */
    public void setProductType(String type) {
        this.ProductType = type;
    }

    /**
     * getter function to get Product ID
     *
     * @return
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Function to get Product Name
     *
     * @return
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Function to get Product Price
     *
     * @return
     */
    public int getProductPrice() {
        return this.ProductPrice;
    }

    /**
     * Function to get Product Quantity
     *
     * @return
     */
    public int getProductQuantity() {
        return this.ProductQuantity;
    }

    /**
     * Function to get Product Type
     *
     * @return
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Function to get class type
     *
     * @return
     */
   
    public String getType() {
        return "Products";
    }

    /**
     * toString function
     *
     * @return
     */
    @Override
    public String toString() {
        return this.ProductID + this.ProductName + this.ProductPrice + this.ProductQuantity + this.ProductType;
    }

    /**
     * Function to set Product ID , name , Price , Quantity , Type
     *
     * @param ID
     * @param name
     * @param price
     * @param quantity
     * @param type
     */
    public void setter(String ID, String name, int price, int quantity, String type) {
        this.ProductID = ID;
        this.ProductName = name;
        this.ProductPrice = price;
        this.ProductQuantity = quantity;
        this.ProductType = type;

    }

}

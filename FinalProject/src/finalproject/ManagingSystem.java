/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author KHADIJA
 */
public class ManagingSystem {

    public static ArrayList<Person> Customer_Information_List = new ArrayList<Person>();
    public static ArrayList<Person> ProductsList = new ArrayList<Person>();
    public static ArrayList<Person> SalesList = new ArrayList<Person>();
    public static ArrayList<Person> ReceiptList = new ArrayList<Person>();
    private static ManagingSystem smpl;

    private ManagingSystem() {

    }

    public static ManagingSystem getInstance() {
        if (smpl == null) {
            smpl = new ManagingSystem();
            return smpl;
        }
        return smpl;
    }

    public void add(Person p , PersonInterface P) {
        
        if (P.getType().equals("Customer_Director")) {
            ProductsList.add(p);
            System.out.println("Products");
        } else if (P.getType().equals("Sales")) {
            SalesList.add(p);
            System.out.println("Sales");
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    /**
     * Function to get Customer Information List
     *
     * @return
     */
    public ArrayList<Person> getCustomer_Information_List() {
        return Customer_Information_List;
    }

    /**
     * Function to get Product List
     *
     * @return
     */
    public ArrayList<Person> getProductList() {
        return ProductsList;
    }

    /**
     * Function to get Sales List
     *
     * @return
     */
    public ArrayList<Person> getSalesList() {
        return SalesList;
    }

    /**
     * Function to get Receipt List
     *
     * @return
     */
    public ArrayList<Person> getReceiptList() {
        return ReceiptList;
    }

    /**
     * @param list
     */
    public void setCustomerInformationList(ArrayList<Person> list) {
        list = this.Customer_Information_List;
    }

    /**
     * @param list
     */
    public void setProductList(ArrayList<Person> list) {
        list = this.ProductsList;
    }

    /**
     * @param list
     */
    public void setSalesList(ArrayList<Person> list) {
        list = this.SalesList;
    }

    /**
     * @param list
     */
    public void setReceiptList(ArrayList<Person> list) {
        list = this.ReceiptList;
    }

}

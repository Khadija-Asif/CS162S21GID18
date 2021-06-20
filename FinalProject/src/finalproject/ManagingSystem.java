/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/**
 *
 * @author KHADIJA
 */
public class ManagingSystem {

    public static ArrayList<Person> Customer_Information_List = new ArrayList<Person>();
    public static ArrayList<Products> productList = new ArrayList<Products>();
    public static LinkedList<Products> SalesList = new LinkedList<Products>();
    public static ListIterator<Products> iter = SalesList.listIterator();
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

    public void add(Products pro, Customer_Director c) {
        c.add(pro);
    }

    public void addProductsSales(Products pro) {
        Customer_Director c = new Customer_Director();
        c.addSales(SalesList, pro);

    }

    public void removeSales(String ID) {
       iter = SalesList.listIterator();
        while(iter.hasNext())
       {
           String s = iter.next().getProductID();
           if(s.equals(ID))
           {
               iter.remove();
           }
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
     * Function to get Sales List
     *
     * @return
     */
    public LinkedList<Products> getSalesList() {
        return SalesList;
    }

    public ListIterator<Products> getListIterator() {
        return iter;
    }

    public void setListIterator(ListIterator<Products> list) {
        iter = list;
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
        Customer_Information_List = list;
    }

    /**
     * @param list
     */
    public void setSalesList(LinkedList<Products> list) {
        SalesList = list;
    }

    /**
     * @param list
     */
    public void setReceiptList(ArrayList<Person> list) {
        ReceiptList = list;
    }

}

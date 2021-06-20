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
public class Sales extends Products {

    private int newPrice;
    private String timeDuration;
    private String salesPercentage;
   public Sales()
   {
       
   }
    //Function to set values
    public void setNewPrice(int price) {
        this.newPrice = price;
    }
    public void setSalesTimeDuration(String time) {
        this.timeDuration = time;
    }

    public void setSalesPercentage(String per) {
        this.salesPercentage = per;
    }

    //Function to get Values
    public int getNewPrice() {
        return this.newPrice;
    }

    public String getSalesTimeDuration() {
        return this.timeDuration;
    }

    public String getSalesPercentage() {
        return this.salesPercentage;
    }

    public String getType() {
        return "Sales";
    }
}

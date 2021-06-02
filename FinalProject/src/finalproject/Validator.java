/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Hafsa Rashid
 */
public class Validator {

    boolean Name(String name) {
        boolean flag = false;
        int length = name.length();
        for (int i = 0; i < length; i++) {
            if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) == ' ')) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    boolean Email(String email) {
        boolean flag = true;
        int size = email.length();
        if ((email.charAt(0) == '@') || (email.charAt(0) == '.') || (email.charAt(0) >= '0' && email.charAt(0) <= '9')) {
            JOptionPane.showMessageDialog(null, "Invalid Email");
            flag = false;
        } else {
            for (int i = 0; i <= size - 1; i++) {
                if ((email.charAt(i) >= 'A' && email.charAt(i) <= 'Z') || (email.charAt(i) >= 'a' && email.charAt(i) <= 'z') || email.charAt(i) == '@' || email.charAt(i) == '.' || (email.charAt(i) >= '0' && email.charAt(i) <= '9')) {
                    flag = true;
                } else {
                    flag = false;
                    JOptionPane.showMessageDialog(null, "Invalid Email");
                    break;
                }

            }
        }
        return flag;
    }

    boolean Password(String password
    ) {
        boolean flag = false;
        int length = password.length();
        if (length == 8) {
            for (int i = 0; i < length; i++) {
                if ((password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') || (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') || (password.charAt(i) >= '0' && password.charAt(i) <= '9') || (password.charAt(i) == '.') || (password.charAt(i) == '_')) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    boolean contactNo(String number
    ) {
        boolean flag = false;
        int length = number.length();
        if (length == 11) {
            for (int i = 0; i < length; i++) {
                if ((number.charAt(i) >= '0' && number.charAt(i) <= '9')) {
                    flag = true;

                } else {
                    flag = false;
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Entered Contact Number must be of 11 Digits");
        }
        return flag;
    }

    boolean Address(String address
    ) {
        boolean flag = false;
        int length = address.length();
        for (int i = 0; i < length; i++) {
            if ((address.charAt(i) >= 'A' && address.charAt(i) <= 'Z') || (address.charAt(i) >= 'a' && address.charAt(i) <= 'z') || (address.charAt(i) >= '0' && address.charAt(i) <= '9') || (address.charAt(i) == ' ')) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    boolean City(String city
    ) {
        boolean flag = false;
        int length = city.length();
        for (int i = 0; i < length; i++) {
            if ((city.charAt(i) >= 'A' && city.charAt(i) <= 'Z') || (city.charAt(i) >= 'a' && city.charAt(i) <= 'z')) {
                flag = true;

            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    boolean PostalCode(String postalCode
    ) {
        boolean flag = false;
        int length = postalCode.length();
        if (length == 4) {
            for (int i = 0; i < length; i++) {
                if ((postalCode.charAt(i) >= '0' && postalCode.charAt(i) <= '9')) {
                    flag = true;

                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    boolean loginID(String ID
    ) {
        boolean flag = false;
        int length = ID.length();
        if (length == 11) {
            if ((ID.charAt(0) == 'D') && (ID.charAt(1) == 'i') && (ID.charAt(2) == 'r') && (ID.charAt(3) == 'e') && (ID.charAt(4) == 'c') && (ID.charAt(5) == 't') && (ID.charAt(6) == 'o') && (ID.charAt(7) == 'r')) {
                if (ID.charAt(8) == '-') {
                    if (ID.charAt(9) >= '0' && ID.charAt(9) <= '9') {
                        if (ID.charAt(10) >= '0' && ID.charAt(10) <= '9') {
                            flag = true;
                        } else {
                            flag = false;
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Entered Login ID must have length of 11 characters (Director-##)");
        }
        return flag;
    }
    boolean ProductID(String productID)
    {
        boolean flag = false;
        int length = productID.length();
        if(length == 11)
        {
            if(productID.charAt(0) == 'P' && productID.charAt(1) == 'r' && productID.charAt(2) == 'o' && productID.charAt(3) == 'd' && productID.charAt(4) == 'u' && productID.charAt(5) == 'c' && productID.charAt(6) == 't')
            {
                if(productID.charAt(7) == '-')
                {
                   if(productID.charAt(9) >= '0' && productID.charAt(9) <= '9')
                   {
                        if(productID.charAt(10) >= '0' && productID.charAt(10) <= '9')
                        {
                            flag = true;
                        }
                        else
                        {
                            flag = false;
                        }
                   }
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Product ID must consist of 11 characters (Product-##)");
        }
        return flag;
    }
    
    boolean ProductName(String productName) {
        boolean flag = false;
        int length = productName.length();
        for (int i = 0; i < length; i++) {
            if ((productName.charAt(i) >= 'A' && productName.charAt(i) <= 'Z') || (productName.charAt(i) >= 'a' && productName.charAt(i) <= 'z') || (productName.charAt(i) == ' ')) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    boolean ProductPrice(int productPrice)
    {
        boolean flag = false;
        if(productPrice >= '0' && productPrice <= '9')
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        return flag;
    }
    
    boolean ProductQuantity(int productQuantity)
    {
        boolean flag = false;
        if(productQuantity >= '0' && productQuantity <= '9')
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        return flag;
    }
}

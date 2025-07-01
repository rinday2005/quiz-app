/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author ADMIN
 */
public class ChangeBaseNumber {
    public ChangeBaseNumber() {
    }

    int binaryToDecimal(String binary) {                  
        int decimal = 0;                                   
        int length = binary.length();                      
        for (int i = 0; i < length; i++) {                  
            if (binary.charAt(length - i - 1) == '1') {     
                decimal += Math.pow(2, i);                 
            }
        }
        return decimal;
    }

    String decimalToBinary(String decimal) {
        int dec = Integer.parseInt(decimal);                
        if (dec == 0) {                                    
            return "0";
        }
        StringBuilder result = new StringBuilder();         
        while (dec != 0) {                                  
            result.insert(0, dec % 2);                      
            dec /= 2;                                       
        }
        return result.toString();
    }

    String decimalToHexa(String decimal) {
        int dec = Integer.parseInt(decimal);
        if (dec == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        char[] hexa = "0123456789ABCDEF".toCharArray();
        while (dec > 0) {
            result.insert(0, hexa[dec % 16]);
            dec /= 16;
        }
        return result.toString();
    }
}

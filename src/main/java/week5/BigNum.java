/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author ADMIN
 */
public class BigNum {
    static String plus(String str1, String str2) {
        String result = "";
        if (str1.length() < str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        while (str1.length() != str2.length()) {
            str2 = "0" + str2;
        }
        int temp = 0;
        for (int i = str1.length() - 1; i >= 0; i--) {
            int num1 = str1.charAt(i) - '0', num2 = str2.charAt(i) - '0';
            int res = temp + num1 + num2;
            temp = res / 10;
            res %= 10;
            result = (char) (res + '0') + result;
        }
        if (temp > 0) {
            result = (char) (temp + '0') + result;
        }
        return result;
    }

    static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    static int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    static String multiplication(String str1, String str2) {
        String result = "";
        int n = str1.length() - 1, m = str2.length() - 1;
        int carry = 0;
        for (int i = 0; i <= m + n || carry != 0; i++) {
            for (int j = max(0, i - m); j <= min(i, n); j++) {
                carry += (str1.charAt(n - j) - '0') * (str2.charAt(m - i + j) - '0');
            }

            result = (char) (carry % 10 + '0') + result;
            carry /= 10;
        }
        return result;
    }
}

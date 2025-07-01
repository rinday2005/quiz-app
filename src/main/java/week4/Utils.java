/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Calendar;
import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public class Utils {
      public static boolean isValidId(int id) {
        return String.valueOf(id).length() == 6;
    }

    public static boolean isValidName(String name) {
        return Pattern.matches("[a-zA-Z ]+", name);
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return Pattern.matches("\\d{12}", phoneNumber);
    }

    public static boolean isValidYearOfBirth(int yearOfBirth) {
        return yearOfBirth < Calendar.getInstance().get(Calendar.YEAR);
    }

    public static boolean isValidMajor(String major) {
        return major.length() <= 30;
    }

    public static boolean isValidYearInProfession(int yearInProfession, int yearOfBirth) {
        return yearInProfession >= 0 && yearInProfession < (Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth);
    }

    public static boolean isValidContractType(String contractType) {
        return contractType.equals("Long") || contractType.equals("Short");
    }

    public static boolean isValidSalaryCoefficient(double salaryCoefficient) {
        return salaryCoefficient >= 0;
    }

    public static boolean isValidYearOfAdmission(int yearOfAdmission, int yearOfBirth) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return yearOfAdmission >= yearOfBirth && yearOfAdmission <= currentYear;
    }

    public static boolean isValidEntranceEnglishScore(int score) {
        return score >= 0 && score <= 100;
    }
     public static boolean isNumber(String number) {
        return number != null && number.matches("\\d+");
    }
}

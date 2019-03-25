/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author bhosaman
 */
public class StringEquals {
//Operaytions can't do done on variable directly in class,need to be done in method body or main method

//    public static void main(String[] args) {
//        String str1 = "I";
//        str1 = str1 + " Love Java";
//
//        String str2 = "I";
//        str2 = str2 + " Love Java";
//
//        System.out.println("Equals====" + str1 == str2);
//
//    }
    String str1 = "I";

    public void setString1() {
        str1 = str1 + " Love Java";

    }

    String str2 = "I";

    public void setstring2() {
        str2 = str2 + " Love Java";

    }

    public void print1() {
        System.out.println("Equals====" + str1 == str2);

    }

}

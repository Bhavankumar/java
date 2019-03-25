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
public class WrapperEqual {

    public static void main(String[] args) {

        Integer i = 100 * 10;

        Integer j = 10 * 10 * 10;

        Integer k = 4 * 2;

        Integer l = 2 * 2 * 2;

        if (i == j) {
            System.out.println("==");
        }

        if (i.equals(j)) {
            System.out.println("Equals");
        }

        if (k == l) {
            System.out.println("==");
        }

        if (k.equals(l)) {
            System.out.println("Equals");
        }

    }

}

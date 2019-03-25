/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.lang.*;

/**
 *
 * @author bhosaman
 */
public class Anagram {

    public boolean isAnagram(String a, String b) {

        String a1 = a.toLowerCase();
        char[] st1 = a1.toCharArray();
        java.util.Arrays.sort(st1);
        String s1 = String.valueOf(st1);

        String b1 = b.toLowerCase();
        char[] st2 = b1.toCharArray();
        java.util.Arrays.sort(st2);
        String s2 = String.valueOf(st2);

        boolean res = s1.equalsIgnoreCase(s2);

        return res;

    }

    public static void main(String[] args) {
        Anagram angram = new Anagram();
        String x = new String("abc");
        String y = new String("abC");
        boolean res = angram.isAnagram(x, y);
        System.out.println("result===" + res);
    }

}

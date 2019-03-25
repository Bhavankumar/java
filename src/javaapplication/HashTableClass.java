/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.LinkedHashMap;

/**
 *
 * @author bhosaman
 */
public class HashTableClass {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hashTable = new LinkedHashMap<>();

        hashTable.put(1, "Abc");

        hashTable.put(2, "def");

        hashTable.put(3, "ghi");

        int hashCode = hashTable.hashCode();

        System.out.println("Hashcode==" + hashCode);

        hashTable.forEach((key, val) -> {

            System.out.println("Key==" + key + "value" + val);

        });

    }

}

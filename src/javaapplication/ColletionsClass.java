/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author bhosaman
 */
public class ColletionsClass {

    public static void main(String[] args) {

        List<String> str = new ArrayList<>();

        str.add("abc");

        str.add("xyz");

        str.add("asdf");

        Iterator<String> ir = str.iterator();

        while (ir.hasNext()) {

            String res = ir.next();

            System.out.println(res);

        }

        for (String s : str) {

            System.out.println(s);

        }

        str.forEach(s -> System.out.println(s));

    }
}

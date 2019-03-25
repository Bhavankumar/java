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
public class PassByReference {

    public static void swap(ReferenceClass ob1, ReferenceClass ob2) {

        ob1.setA(ob2.getA() + 1);

        ob2 = ob1;
    }

    public static void swapStrings(String st1, String st2) {

        st1 = st1 + "123";

        System.out.println("s1==" + st1);

        st2 = st2 + "456";

    }

    public static void main(String[] args) {

        ReferenceClass obj1 = new ReferenceClass(10);

        ReferenceClass obj2 = new ReferenceClass(20);

        System.out.println("Obj1=" + obj1);

        System.out.println("Obj2=" + obj2);

        swap(obj1, obj2);

        System.out.println("Obj1=" + obj1);

        System.out.println("Obj2=" + obj2);

        String s1 = new String("abc");

        String s2 = new String("xyz");

        swapStrings(s1, s2);

        System.out.println("s1==" + s1);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.ArrayList;

/**
 *
 * @author bhosaman
 */
public class ObjectEqualsImpl {

    public static void main(String[] args) {

        ObjectWquals obj = new ObjectWquals("Bhavan", 1);

        ObjectWquals obj1 = new ObjectWquals("Bhavank", 2);

        //boolean res = obj.equals(obj1);
        //System.out.println("result==" + res);
        ArrayList<ObjectWquals> list = new ArrayList<>();

        list.add(obj);

        list.add(obj1);

        System.out.println(list.contains(obj));

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author bhosaman
 */
public class CollectionsSortImpl {

    public static void main(String[] args) {

        ArrayList<CollectionsSort> list = new ArrayList<>();

        CollectionsSort col = new CollectionsSort("1", "Bhavan");
        list.add(col);

        CollectionsSort co2 = new CollectionsSort("2", "Hosamanu");
        list.add(co2);

        CollectionsSort co3 = new CollectionsSort("3", "Kumar");
        list.add(co3);

        Collections.sort(list);

        System.out.println("Sorting==" + list);

    }

}

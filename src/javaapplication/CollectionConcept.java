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
public class CollectionConcept {

    public static void main(String args[]) {

        List<Product> products = new ArrayList<>();

        Product table = new Product(30, "Table");

        Product chair = new Product(20, "chair");

        Product woodenChair = new Product(40, "Wooden");

        List<Product> products1 = new ArrayList<>();

        products1.add(table);

        products1.add(chair);

        products1.add(woodenChair);

        products.addAll(products1);

        System.out.println(products1);

        System.out.println(products);

        for (Product p : products) {

            System.out.println(p);

        }

        Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

    }

}

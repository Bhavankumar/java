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
public class Product {

    int weight;

    String name;

    public Product(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return ("Name=" + this.getName() + " and" + "Weight=" + this.getWeight());
    }

}

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
public class CollectionsSort implements Comparable<CollectionsSort> {

    String name;

    String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(CollectionsSort t) {

        return (this.getName().compareTo(t.getName()));

    }

    public CollectionsSort(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     *
     */
    public String toString() {

        return ("name=" + this.getName() + "Id==" + this.getId());
    }
}

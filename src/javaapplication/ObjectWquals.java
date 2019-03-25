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
public class ObjectWquals {

    String name;

    public ObjectWquals(String name, int id) {
        this.name = name;
        this.id = id;
    }

    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object o) {
//
//        if (o instanceof ObjectWquals) {
//            return (this.name.equals(((ObjectWquals) o).name) && ((ObjectWquals) o).id == this.id);
//        } else {
//            return false;
//        }
//    }
}

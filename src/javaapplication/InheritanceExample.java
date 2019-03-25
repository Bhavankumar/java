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
class SuperClass {

    public void displayShape() {
        System.out.println("Super class");
    }

    public void display() {
        System.out.println("Super class");
    }
}

class SubClass extends SuperClass {

    public void display() {
        System.out.println("Sub class");
    }

}

public class InheritanceExample {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.display();//-------------------------------sub
        subClass.displayShape();//--------------------------super
        SuperClass superClass = new SuperClass();
        superClass.displayShape();//---------------------------super
        SuperClass superSub = new SubClass();
        superSub.display();//--------------------------------sub because of RUN TIME POLYMORPHISM
        superSub.displayShape();
        // superClass.display():------------this wil give error

    }
}

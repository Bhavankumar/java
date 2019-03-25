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
public class GenericClassImpl {

    public static void main(String[] args) {

        GenericClass<String>[] str = new GenericClass[5];

        str[0].setRes("abc");

        System.out.println("string==" + str[0].getRes());

        GenericClass<Integer> in = new GenericClass<>();

        in.setRes(100);

        System.out.println("Integer==" + in.getRes());

    }
}

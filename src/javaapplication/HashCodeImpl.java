/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.HashSet;

/**
 *
 * @author bhosaman
 */
public class HashCodeImpl {

    public static void main(String[] args) {
        HashcCdeForHash employee = new HashcCdeForHash("rajeev", 24);
        HashcCdeForHash employee1 = new HashcCdeForHash("rajeev", 25);
        HashcCdeForHash employee2 = new HashcCdeForHash("rajeev", 24);

        HashSet<HashcCdeForHash> employees = new HashSet<HashcCdeForHash>();
        employees.add(employee);
        System.out.println(employees.contains(employee2));
        System.out.println("employee.hashCode():  " + employee.hashCode()
                + "  employee2.hashCode():" + employee2.hashCode());
    }
}

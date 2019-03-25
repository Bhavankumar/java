/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author bhosaman
 */
public class ForEach {

    public static void main(String args[]) {

        try {

            int count = 0;

            FileReader inputFile = new FileReader("newfile.txt");

            Scanner sc = new Scanner(inputFile);

            while (sc.hasNext()) {

                String line = sc.next();

                count++;

                System.out.println(line);
            }
            System.out.println(count);

        } catch (FileNotFoundException ex) {

            System.out.println("Error" + ex.getMessage());
        }

    }

}

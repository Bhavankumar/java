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
public class FindSampleGeneAndTest {

    public String find(String dna) {

        int start = dna.indexOf("ATG");

        if (start == -1) {

            System.out.println("Start");

            return "NO START";
        }

        int end = dna.indexOf("TAA", start + 3);

        if (end == -1) {

            System.out.println("End");

            return "NO END";

        }

        String sub = dna.substring(start, end);

        return sub;
    }

    public static void main(String args[]) {

        String dna = "GCGTAATATGGT";

        FindSampleGeneAndTest obj1 = new FindSampleGeneAndTest();

        String result = obj1.find(dna);

        System.out.println("result1==" + result);

//        String dna1 = "FSDFGATG";
//        
//        FindSampleGeneAndTest obj2 = new FindSampleGeneAndTest();
//        
//        String result2 = obj2.find(dna1);
//        
//        System.out.println("result2==" + result2);
//
//        String dna2 = "FSDFGTAA";
//        
//        FindSampleGeneAndTest obj3 = new FindSampleGeneAndTest();
//        
//        String result3 = obj3.find(dna2);
//        
//        System.out.println("result3==" + result3);
    }
}

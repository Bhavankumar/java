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
class ListNodes {
    
    int val;
    ListNodes next;
    
    ListNodes() {
    }
    
    ListNodes(int x) {
        val = x;
    }
    
}

class Solution {
    
    public ListNodes addTwoNumbers(ListNodes L1, ListNodes L2) {
        ListNodes ls = new ListNodes();
        int sum = 0;
        if (L1.next == null && L2.next != null) {
            return L2;
        }
        if (L2.next == null && L1.next != null) {
            return L1;
        } else {
            while (L1.next != null && L2.next != null) {
                sum = L1.val + L2.val;
            }
            if (sum > 10) {
                ls.val = sum / 10;
                ls.next.val = sum % 10;
                
            } else {
                ls.val = sum;
            }
            
            ls = ls.next;
            L1 = L1.next;
            L2 = L2.next;
            if (L1.next == null) {
                ls.next = L2.next;
            }
            if (L2.next == null) {
                ls.next = L1.next;
            }
            
        }
        
        return ls;
        
    }
}

public class LLSum {
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNodes res = new ListNodes();
        ListNodes Ls1 = new ListNodes();
        ListNodes Ls2 = new ListNodes();
        Ls1.val = 2;
        Ls1.next.val = 4;
        Ls1.next.next.val = 3;
        
        Ls2.val = 5;
        Ls2.next.val = 6;
        Ls2.next.next.val = 4;
        res = sol.addTwoNumbers(Ls1, Ls2);
        System.out.print("result" + res);
        
    }
    
}

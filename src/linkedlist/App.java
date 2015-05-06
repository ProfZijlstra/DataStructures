/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.ArrayList;

/**
 *
 * @author mzijlstra
 */
public class App {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.append("This");
        words.append("is");
        words.append("a");
        words.append("test");
        
        //java.util.LinkedList<String> stuff = new java.util.LinkedList<>();
        
        for (String s : words) {
            System.out.println(s);
        }
        
        //System.out.println(words.toString());
    }
    
}

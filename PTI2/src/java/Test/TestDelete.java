/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.LinkedList;

/**
 *
 * @author Kirizu
 */
public class TestDelete {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        for (String data : linkedList) {
            System.out.println(data.toString());
        }
        linkedList.removeAll(linkedList);
        for (String data : linkedList) {
            System.out.println("a");
            System.out.println(data.toString());
        }
        
    }
            
}

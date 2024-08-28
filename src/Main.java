/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Menuk Fernando
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        
        b.Insert(25);
        b.Insert(43);
        b.Insert(23);
        b.Insert(76);
        b.Insert(34);
        b.Insert(12);
        b.Insert(98);
        b.Insert(54);
        
        b.printTree();
    }
}

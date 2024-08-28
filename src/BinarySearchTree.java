/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Menuk Fernando
 */
public class BinarySearchTree {
    Node root;
    
    public BinarySearchTree(){
        root = null;
    }
    
    public void Insert(int data){
        root = InsertRec(root, data);
    }
    
    public Node InsertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }else{
            if(data < root.data){
                root.left = InsertRec(root.left, data);
            }else if(data > root.data){
                root.right = InsertRec(root.right, data);
            }
        }
        return root;
    }
    
      // Method to print the tree structure
    public void printTree() {
        printTreeRec(root, "", true);
    }

    // Recursive function to print the tree structure
    private void printTreeRec(Node root, String indent, boolean last) {
        if (root != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R---- ");
                indent += "   ";
            } else {
                System.out.print("L---- ");
                indent += "|  ";
            }
            System.out.println(root.data);
            printTreeRec(root.left, indent, false);
            printTreeRec(root.right, indent, true);
        }
    }
}

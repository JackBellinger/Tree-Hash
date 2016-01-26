package treehash;


import java.awt.Color;

public class BST {
    Node root;
    
    public boolean add(double v){
        //System.out.println(v);
        if(root == null){
            root = new Node(v);
        }
        else{
            Node current = root;
            while(true){
                if(current == null){
                    current = new Node(v);
                    return true;
                }
                if(v < current.data){
//                    if(current.left == null){
//                        //System.out.println(v + " added left");
//                        current.left = new Node(v);
//                        return true;
//                    }else
                    current = current.left;
                }
                if(v > current.data){
//                    if(current.right == null){
//                        //System.out.println(v + " added left");
//                        current.right = new Node(v);
//                        return true;
//                    }else
                        current = current.right;
                }
                if(v == current.data){
                    return false;
                }
            }
        }
        return true;
    }

    public String toString(){
        return printTree(root);
    }
    private String printTree(Node current){
        String s = "";
        if(current != null){
            if(current.left != null)
                s += printTree(current.left);
            s += "\n"+current.data;
            if(current.right != null)
                s += printTree(current.right);
        }
        return s;
    }
}

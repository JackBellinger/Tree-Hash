package treehash;

public class HashTable {

    private BST[] data;

    public HashTable(int size) {
        data = new BST[size];
        for(int i = 0; i < size; i++)
            data[i] = new BST();
    }

    public boolean add(double x) {
        boolean added = false;
        int loc = hash(x);
//
        data[loc].add(x);
        return added;
    }

    private int hash(double x) {
        int loc = Math.round((float) x);
        return loc % data.length;
    }

   
    public String toString() {
        String s = "";
        for (int i = 0; i < data.length; i++)
            s += "\ndata #" + i + ": " + data[i];
        return s;
    }
}
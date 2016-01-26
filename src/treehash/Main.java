package treehash;

public class Main {

    public static void main(String[] args) {
       HashTable h = new HashTable(20);
       for(int i = 1; i < 100; i++){
           //for(int j = 0; j < 5; j++){
               double d = i + Math.random();
               h.add(d);
            //}
       }
        System.out.println(h);
    }
    
}

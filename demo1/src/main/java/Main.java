
import java.util.Random;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // Тестирование MyHashTable
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>(50);
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(1000000);
            String name = "Name" + rand.nextInt(1000);
            MyTestingClass key = new MyTestingClass(id, name);
            table.put(key, "Student" + i);
        }
        table.printBucketSizes();

        System.out.println("\n==== Now BST Test ====\n");

        // Тестирование BST
        BST<Integer, String> tree = new BST<>();
        tree.put(5, "Five");
        tree.put(2, "Two");
        tree.put(7, "Seven");
        tree.put(1, "One");
        tree.put(3, "Three");

        for (var elem : tree.iterator()) {
            System.out.println("Key is " + elem.getKey() + " and Value is " + elem.getValue());
        }
    }
}

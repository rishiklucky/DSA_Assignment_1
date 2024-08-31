/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayoperations;
import java.util.ArrayList;
/**
 *
 * @author nalla
 */
class ArrayOperations {

    private ArrayList<Integer> arr;

    public ArrayOperations() {
        arr = new ArrayList<>();
    }

    // Method to insert an element at the end
    public void insert(int value) {
        arr.add(value);
    }

    // Method to remove an element from the array
    public void remove(int value) {
        if (arr.contains(value)) {
            arr.remove((Integer) value);
        } else {
            System.out.println("Element not found.");
        }
    }

    // Method to insert an element at a specific index
    public void insertAt(int index, int value) {
        if (index >= 0 && index <= arr.size()) {
            arr.add(index, value);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Method to remove an element from a specific index
    public void removeAt(int index) {
        if (index >= 0 && index < arr.size()) {
            arr.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Method to print the array
    public void print() {
        System.out.println(arr);
    }

    public static void main(String[] args) {
        ArrayOperations arrayOps = new ArrayOperations();

        arrayOps.insert(10);
        arrayOps.insert(20);
        arrayOps.insert(30);

        System.out.println("Array after insertion:");
        arrayOps.print();

        arrayOps.insertAt(1, 15);
        System.out.println("Array after inserting 15 at index 1:");
        arrayOps.print();

        arrayOps.remove(20);
        System.out.println("Array after removing 20:");
        arrayOps.print();

        arrayOps.removeAt(0);
        System.out.println("Array after removing element at index 0:");
        arrayOps.print();
    }
}

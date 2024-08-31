/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

/**
 *
 * @author nalla
 */
import java.util.ArrayList;

class Stack {

    private ArrayList<Integer> stack;

    // Constructor to initialize the dynamic array
    public Stack() {
        stack = new ArrayList<>();
    }

    // Method to push an element onto the stack
    public void push(int value) {
        stack.add(value);
        System.out.println(value + " pushed to stack.");
    }

    // Method to pop an element from the stack
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty, cannot pop.");
            return -1; // return an invalid value
        }
        int value = stack.remove(stack.size() - 1);
        System.out.println(value + " popped from stack.");
        return value;
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty, cannot peek.");
            return -1; // return an invalid value
        }
        return stack.get(stack.size() - 1);
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Method to print the current state of the stack
    public void printStack() {
        System.out.println("Stack: " + stack);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        stack.pop();
        stack.printStack();

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop(); // Attempt to pop from an empty stack
    }
}

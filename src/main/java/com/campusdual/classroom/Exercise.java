package com.campusdual.classroom;

import java.util.Stack;

public class Exercise {
    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");
        return stack;

    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    public static void main(String[] args) {
        Stack<String> stack = createStack();

        System.out.println("Elemento en la cima de la pila: " + stack.peek());

        printAndEmptyStack(stack);

        System.out.println("¿Pila vacia?: " + stack.isEmpty());

    }



}

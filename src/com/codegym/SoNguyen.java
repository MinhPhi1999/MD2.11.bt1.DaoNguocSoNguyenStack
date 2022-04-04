package com.codegym;

import java.util.Stack;

public class SoNguyen {
    public static void main(String[] args) {
    int[] array = {1,2,3,4,5,6};
    Stack<Integer> soNguyen = new Stack<>();
        for (int i = 0; i < array.length ; i++) {
            soNguyen.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = soNguyen.pop();
        }
//        for (int element:array) {
//            System.out.print(element);
//        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
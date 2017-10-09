package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random(System.nanoTime());
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        
}
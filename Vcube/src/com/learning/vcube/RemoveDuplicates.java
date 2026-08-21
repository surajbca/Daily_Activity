package com.learning.vcube;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();
        
        for (int num : arr) {
            uniqueSet.add(num);
        }
        
        System.out.print("Unique Elements: ");
        for (int num : uniqueSet) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

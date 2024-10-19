package com.ua.algorithmsanddatastructures.lesson3;

public class DynamicArray {

    private int[] arr;
    private int size;


    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    // O(1)
    public void add(int value) {
        this.add(this.size, value);
    }

    // O(n)
    public void add(int idx, int value) {
        // [1,2,3,4]
        if (this.size == this.arr.length) {
            int[] newArr = new int[this.size * 2];
            // [<>,<>,<>,<>,<>,<>,<>,<>]
            for (int i = 0; i < this.arr.length; i++) {
                newArr[i] = this.arr[i];
            }
            // [1,2,3,4,<>,<>,<>,<>]
            this.arr = newArr;
        }
        //[1,2,3,4,<>,<>,<>,<>]
        for (int i = this.size; i > idx; i--) {
            this.arr[i] = this.arr[i - 1];
        }
        //[1,2,2,3,4,<>,<>,<>]
        this.arr[idx] = value;
        size++;
        //[1,value,2,3,4,<>,<>,<>]
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return arr[index];
    }

}

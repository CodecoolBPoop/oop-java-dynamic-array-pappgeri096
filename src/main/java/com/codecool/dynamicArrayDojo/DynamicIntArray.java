package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {
    private int size = 11;
    private int[] array;
    private int nextIndex = 0;

    public DynamicIntArray() {
        this.array = new int[this.size];
    }

    public DynamicIntArray(int size) {
        this.size = size;
        this.array = new int[this.size];
    }

    public void add(int value) {
        if(nextIndex >= array.length) resizeArray();
        array[nextIndex] = value;
        nextIndex++;
    }

    private void resizeArray() {
        int[] newArray = new int[array.length*2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public void remove(int value) {
        int itemIndex = findItemIndex(value);
        if(itemIndex==-1) throw new ArrayIndexOutOfBoundsException();
        int[] newArray = new int[array.length-1];
        System.arraycopy(array, 0, newArray, 0, itemIndex);
        System.arraycopy(array, itemIndex+1, newArray, itemIndex, array.length-1-itemIndex);
        array = newArray;
        nextIndex--;
    }

    private int findItemIndex(int value) {
        for (int i = 0; i < nextIndex; i++) {
            if(array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public void insert(int index, int value) {
        int[] newArray = new int[array.length+1];
        int checkedIndex = index > array.length ? newArray.length-1 : index;
        System.arraycopy(array,0,newArray,0,checkedIndex);
        newArray[checkedIndex] = value;
        System.arraycopy(array,checkedIndex,newArray,checkedIndex+1,array.length-checkedIndex);
        array=newArray;
        nextIndex++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nextIndex; i++) {
            stringBuilder.append(" ");
            stringBuilder.append(array[i]);
        }
        return stringBuilder.toString();
    }
}

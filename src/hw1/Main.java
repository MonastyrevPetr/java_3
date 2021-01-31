package hw1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static <T> void swap(T[] arr, int index1,int index2){
        T a=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=a;
    }

    public static <T>ArrayList<T> arrayToArrayList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}



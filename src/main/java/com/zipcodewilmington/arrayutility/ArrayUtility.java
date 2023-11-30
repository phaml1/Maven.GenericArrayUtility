package com.zipcodewilmington.arrayutility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T[] t;

    public ArrayUtility(T[] inputArray) {
        this.t = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        T[] temp = mergeArray(arrayToMerge);
        int count =0;
        for(int i = 0; i < temp.length; i++){
            for(int j =0; j <temp.length; j++){
                if(temp[i].equals(valueToEvaluate) && temp[j].equals(valueToEvaluate)){
                    count++;
                }
            }
        }
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return null;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        return null;
    }

    public T[] removeValue(T valueToRemove) {
        return null;
    }

    public T[] mergeArray(T[] arrayToMerge){
        T[] newArr = Arrays.copyOf(t, t.length-1+arrayToMerge.length-1);
        System.arraycopy(arrayToMerge, 0, t, t.length-1, arrayToMerge.length-1);
        return newArr;
    }
}

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
        for (T value : temp) {
            if (value.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        T temp = t[0];
        T[] tempArr = mergeArray(arrayToMerge);
        int common = 0;
        for (T o : tempArr) {
            int count = 0;
            for (T object : tempArr) {
                if (o == object) {
                    count = getNumberOfOccurrences(o);
                    break;
                }
            }
            if (count > common) {
                temp = o;
            }
        }
        return temp;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int count =0;
        for (T value : t) {
            if (value.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        int numOfRemove = getNumberOfOccurrences(valueToRemove);
        T[] temp = Arrays.copyOf(t, t.length - numOfRemove);
        for(int i = 0, k = 0; i < t.length; i++){
            if(t[i] != valueToRemove){
                temp[k] = t[i];
                k++;
            }
        }
        return temp;
    }

    public T[] mergeArray(T[] arrayToMerge){
        T[] newArr = Arrays.copyOf(t, t.length+arrayToMerge.length);
        System.arraycopy(arrayToMerge, 0, newArr, t.length, arrayToMerge.length);
        return newArr;
    }
}

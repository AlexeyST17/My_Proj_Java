package by.bsu.eduphys;

import com.sun.source.doctree.SummaryTree;

import java.util.Arrays;

public class ArraysWeight {
    private int n;
    private int[] arr;
    private int[] weight;
    public ArraysWeight(int[] arr, int[] weight){
        this.n = arr.length;
        this.weight = new int[n];
        this.arr = new int[n];
        for(int i = 0; i<n; i++){
            this.arr[i] = arr[i];
            this.weight[i] = weight[i];
        }
    }
    public int mostProbableElement(){
        int[] probableArr;
        int count=0;
        for(int i = 0; i<n; i++){
            count += weight[i];
        }
        probableArr = new int[count];
        int i = 0;
        for(int j = 0; j < n; j++) {
            for (int k = 1; k <= weight[j]; k++) {
                probableArr[i] = arr[j];
                i++;
            }
        }
        int randomIter = (int)(Math.random()*(count+1));
        return probableArr[randomIter];
    }
}

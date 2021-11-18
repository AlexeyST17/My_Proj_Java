package by.bsu.eduphys;

public class Main {
    public static void main(String[] args){
        int[] arr = {-1,2,3};
        int[] weight = {10,20,10};
        ArraysWeight a = new ArraysWeight(arr, weight);
        for(int i = 0; i < 26; i++ ) {
            System.out.println(a.mostProbableElement());
        }
    }
}

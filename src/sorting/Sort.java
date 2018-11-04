package sorting;

import java.util.Arrays;
import java.util.Random;

public class Sort {
     private int[] arr;
     private int size;

    public Sort(int size) {
        this.size = size;
        arr = new int[size];
        Random time = new Random(System.currentTimeMillis());
        Random rand = new Random(time.nextInt());
        for(int i=0;i<size;i++){
            arr[i] = rand.nextInt(178);
        }
    }

    public Sort(int[] arr) {
        this.arr = arr;
        size = arr.length;
    }

    public int[] getArr() {
        return arr;
    }

    public int getSize() {
        return size;
    }

    public void bubleSort(){
        for(int i=0;i< size;i++){
            for(int j= 1;j< size - i;j++){
                if(arr[j-1] > arr[j]){
                    arr[j-1]+=arr[j];
                    arr[j] = arr[j-1] - arr[j];
                    arr[j-1] -= arr[j];
                }
            }
        }
    }
    public void insertSort(){
        for(int i=1; i < size;i++){
            int j = i;
            while(j!=0){
                if(arr[j]<arr[j-1]){
                    arr[j]+=arr[j-1];
                    arr[j-1] = arr[j] - arr[j-1];
                    arr[j] -= arr[j-1];
                    j--;
                }
                else{
                    break;
                }
            }
        }
    }

    public void compareAllSort(){

        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();
        Sort obj = new Sort(arr1);
        long startTime = System.nanoTime();
        this.bubleSort();
        System.out.println(this.toString());
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Buble sort: " + estimatedTime);
        startTime = System.nanoTime();
        obj.insertSort();
        System.out.println(this.toString());
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Insertion sort: " + estimatedTime);
        startTime = System.nanoTime();
        Arrays.sort(arr2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Quick sort: " + estimatedTime);


    }

    @Override
    public String toString() {
        String result = "{";
        for(int i =0; i< arr.length - 1;i++){
            result +=" " + arr[i] + " ,";
        }
        result +=" " + arr[arr.length - 1] + " }";
        return result;
    }
}

import java.util.*;
public class recurssionPractice {
    static void mergeSort(int[] arr, int i,  int j){
        if(i == j){
            return;
        }
        int mid = (i+j)/2;
        mergeSort(arr, i, mid);
        mergeSort(arr,mid+1, j);
        merger(arr, i, mid, j);
    }
    static void merger(int [] arr,  int i, int mid, int j){
        List<Integer> li = new ArrayList<>();
        int l = i;
        int r = mid+1;
        while(l <= mid && r <= j){
            if(arr[l] <= arr[r]){
                li.add(arr[l]);
                l++;
            }else{
                li.add(arr[r]);
                r++;
            }
        }
        while(l <= mid){
            li.add(arr[l]);
            l++;
        }
        while( r <= j){
            li.add(arr[l]);
            r++;
        
        }
        for(int m = i; m <= j; m++){
            arr[m] = li.get(m-i);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,5,4,3};
        mergeSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));

    }
}

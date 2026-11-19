import java.util.*;
public class RecurssionPlayListTUF {
    static void pintSumOfN(int i, int cnt){
        if(i < 1){
            System.out.println(cnt);
            return;
        }
        cnt+=i;
        pintSumOfN(i-1,cnt);
    }

    static void print0toNto0 (int i,int cnt){
        if(i == cnt){
            return;
        }
        cnt++;
        System.out.println(cnt);
        print0toNto0(i, cnt);
        System.out.println(cnt);
    }

// print Sum
    static int printSum(int i) {
        if (i == 0) {
            return 0;
        }
        return i + printSum(i - 1);
    }
    
// factorial
static int factorial(int i){
    if(i == 1){
        return 1;
    }
    return i*factorial(i-1);
}

// Reverse Array
    static void reverseArray(int[] arr,int i){
        if(i == arr.length/2){
            return ;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.length-1-i] = temp;
        reverseArray(arr, i+1);

    }

// Check Palindrome String
    static boolean checkPalindrome(String s,int i, int p){
        if(i >= p){
            return true;
        }
        if(s.charAt(i) !=s.charAt(p)){
            return false;
        }
        return checkPalindrome(s, i+1, p-1);
    }

// Fibanocci
    static int fibanocci(int n){
        if(n <= 1){
            return n;
        }
        return fibanocci(n-1)+fibanocci(n-2);
    }


// Generate all Sub Sequence
    static void subSequence(int[] arr, int idx, List<Integer> li){
        if(idx == arr.length){
            System.out.println(li);
            return ;
        }
        li.add(arr[idx]);
        subSequence(arr, idx+1, li);
        li.remove(li.size()-1);
        subSequence(arr, idx+1, li);
    }

// Subsequence Sum equals K
    static void sumEqualsK(int[] arr, int idx, int sum, int reqSum, List<Integer> li){
        if(idx == arr.length){
            if(sum == reqSum){
                System.out.println(li);
            }
            return ;
        }
        li.add(arr[idx]);
        sum+=arr[idx];
        sumEqualsK(arr, idx+1, sum, reqSum, li);
        sum-=li.get(li.size()-1);
        li.remove(li.size()-1);
        sumEqualsK(arr, idx+1, sum, reqSum, li);
    }
//Print one SubSeq with sum K
    static boolean oneSubsequenceSumEqualsK(int[] arr, int idx, int sum, int reqSum, ArrayList<Integer> li){
        if(idx == arr.length){
            if(sum ==reqSum){
                System.out.println(li);
                return true;
            }
            return false;
            
        }
        li.add(arr[idx]);
        if(oneSubsequenceSumEqualsK(arr, idx+1, sum+arr[idx], reqSum, li)){
            return true;
        }
        li.remove(li.size()-1);
        if(oneSubsequenceSumEqualsK(arr, idx+1, sum, reqSum, li)){
            return true;
        }
        return false;
    }
    //Count SubSeq sum Equals K
    static int countSubsequenceSumEqualsK(int[] arr, int idx, int sum, int reqSum){
        if(idx == arr.length){
            if(sum == reqSum) return 1;
            return 0;
        }
        int l = countSubsequenceSumEqualsK(arr, idx+1, sum+arr[idx], reqSum);
        int r = countSubsequenceSumEqualsK(arr, idx+1, sum, reqSum);
        return l+r;
    }


// Merge Sort
    static void mergeSort(int [] arr, int srt, int end){
        if(srt == end){
            return;
        }
        int mid = (srt+end)/2;
        mergeSort(arr, srt, mid);
        mergeSort(arr, mid+1, end);
        merger(arr, srt, mid, end);

    }
    static void merger(int [] arr, int srt, int mid, int end){
        ArrayList<Integer> temp = new ArrayList<>();
        int l = srt;
        int r = mid+1;
        while(l <= mid && r <=end){
            if(arr[l] <= arr[r]){
                temp.add(arr[l]);
                l++;
            }else{
                temp.add(arr[r]);
                r++;
            }
        }
        while (l <= mid) {
            temp.add(arr[l]);
            l++;
        }
        while(r <=end){
            temp.add(arr[r]);
            r++;
        }
        for(int i = srt; i <= end;i++){
            arr[i] = temp.get(i-srt);
        }
    }

// Quick Sort
    static void quickSort(int[] arr,int l,int h){
        if(l < h){
            int pvt = piviotFinder(arr, l,h);
            quickSort(arr, l, pvt-1);
            quickSort(arr, pvt+1, h);
    
        }
    }
    static int piviotFinder(int[] arr, int low, int high){
        int h = high;
        int l = low;
        int pvt = arr[l];
        while(l < h){
            while(arr[l] <= pvt && l <= high){
                l++;
            }
            while(arr[h] > pvt && h >= low){
                h--;
            }
            if(l < h){
                swap(arr,l,h);
            }
        }
        swap(arr, low, h);
        return h;
    }
    static void swap(int [] arr, int h, int l){
        int temp = arr[h];
        arr[h] = arr[l];
        arr[l] = temp;
    }


    // Combination Sum
    static void combinationSum(int[] arr, int idx, int tgt, ArrayList<Integer> li){
        if(idx == arr.length){
            if(tgt==0){
                System.out.println(li);
            }
            return ;
        }
        if(arr[idx] <= tgt){
            li.add(arr[idx]);
            combinationSum(arr, idx, tgt-arr[idx], li);
            li.remove(li.size()-1);
        }
        combinationSum(arr, idx+1, tgt, li);

    }

// Combination Sum 2
// works for only sorted array
    static void combinationSum(int[] arr, int idx, int tgt, List<Integer> li){
       
            if(tgt == 0){
                System.out.println(li);
                return;
            }
        for(int i = idx; i < arr.length; i++){
            if(i > idx && arr[i] == arr[i-1]) continue;
            if(arr[i] > tgt) break;
            li.add(arr[i]);
            combinationSum(arr, i+1, tgt-arr[i], li);
            li.remove(li.size()-1);
        }
    } 


//Subsequence sum in Ascending Order
    static void subsequenceSums(int[] arr, int idx,  int sum, List<Integer> li){
        if(idx == arr.length){
            li.add(sum);
            return;
        }
        subsequenceSums(arr, idx+1, sum+arr[idx],li);
        subsequenceSums(arr, idx+1, sum, li);
        Collections.sort(li);
        System.out.print(li+" "+li.size());
    }


//Generate All Distinct Subsets
//Only works with sorted Arrays
    static void distinctSubsets(int[] arr, int idx, List<List<Integer>> ans, List<Integer> li ){
         
            ans.add(new ArrayList(li));
        for(int i = idx; i < arr.length;i++){
            if(i!=idx && arr[i] == arr[i-1]){
                continue;
            }
            li.add(arr[i]);
            distinctSubsets(arr, i+1, ans, li);
            li.remove(li.size()-1);
        }
    }

//All Permutations
    static void permutations(int [] arr, boolean[] map, List<Integer> li, List<List<Integer>> ans){
        if(arr.length == li.size()){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i = 0; i < arr.length; i++){
            if(!map[i]){
                map[i] = true;
                li.add(arr[i]);
                permutations(arr, map, li, ans);
                li.remove(li.size()-1);
                map[i] = false;
            }
        }
    }

//All Permutations Without Extraspace
    static void permutations(int[] arr, int idx, List<List<Integer>> ans){
        if(idx == arr.length){
            List<Integer> li = new ArrayList<>();
            for(int i = 0; i < arr.length; i++){
                li.add(arr[i]);
            }
            ans.add(li);
            return;
        }
        for(int i = idx; i < arr.length; i++){
            swap(arr, idx,i);
            permutations(arr, idx+1, ans);
            swap(arr, idx, i);
            //Swap function is at line 193
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4};
        List<List<Integer>> li = new ArrayList<>();
    permutations(arr, 0, li);
    for(var l : li){
        System.out.println(l);
    }

    }
}
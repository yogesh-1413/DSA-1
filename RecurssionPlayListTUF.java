import java.util.*;
public class RecurssionPlayListTUF {
// static void syso(int i, int cnt){
//     if(i < 1){
//         System.out.println(cnt);
//         return;
//     }
//     cnt+=i;
//     syso(i-1,cnt);
// }

// static void syso(int i,int cnt){
//     if(i == cnt){
//         return;
//     }
//     cnt++;
//     System.out.println(cnt);
//     syso(i, cnt);
//     System.out.println(cnt);
// }

//print Sum
    // static int syso(int i) {
    //     if (i == 0) {
    //         return 0;
    //     }
    //     return i + syso(i - 1);
    // }
    
//factorial
// static int syso(int i){
//     if(i == 1){
//         return 1;
//     }
//     return i*syso(i-1);
// }

//Reverse Array
// static void reverseArray(int[] arr,int i){
//     if(i == arr.length/2){
//         return ;
//     }
//     int temp = arr[i];
//     arr[i] = arr[arr.length-1-i];
//     arr[arr.length-1-i] = temp;
//     reverseArray(arr, i+1);

// }

//Check Palindrome String
// static boolean checkPalindrome(String s,int i, int p){
//     if(i >= p){
//         return true;
//     }
//     if(s.charAt(i) !=s.charAt(p)){
//         return false;
//     }
//     return checkPalindrome(s, i+1, p-1);
// }

//Fibanocci
// static int fibanocci(int n){
//     if(n <= 1){
//         return n;
//     }
//     return fibanocci(n-1)+fibanocci(n-2);
// }


//Generate all Sub Sequence
// static void subSequence(int[] arr, int idx, List<Integer> li){
//     if(idx == arr.length){
//         System.out.println(li);
//         return ;
//     }
//     li.add(arr[idx]);
//     subSequence(arr, idx+1, li);
//     li.remove(li.size()-1);
//     subSequence(arr, idx+1, li);
// }

//

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4};
        subSequence(arr, 0, new ArrayList<Integer>());
        
    }
}
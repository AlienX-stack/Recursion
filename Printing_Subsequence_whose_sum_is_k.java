
// Printing Subsequence whose sum is k

import java.util.*;

class HelloWorld {
    public static void ksumSubsequence(int index,int arr[],ArrayList<Integer> res,int sum,int calSum){
        if(index==arr.length)
        {
            if(calSum == sum)
            System.out.println(res);
        }
        else{
            // Take
            ksumSubsequence(index+1,arr,res,sum,calSum);
            calSum+=arr[index];
            res.add(arr[index]);
            
            // Not Take
            ksumSubsequence(index+1,arr,res,sum,calSum);
            calSum-=arr[index];
            res.remove(res.size()-1);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 2;
        ksumSubsequence(0,arr,res,sum,0);
    }
}

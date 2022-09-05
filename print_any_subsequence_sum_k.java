
// Printing any Subsequence whose sum is k

import java.util.*;

class HelloWorld {
    public static boolean ksumanySubsequence(int index,int arr[],ArrayList<Integer> res,int sum,int calSum){
        if(index==arr.length)
        {
        // Condition satisfied
            if(calSum == sum)
            {
            System.out.println(res);
                return true;
            }
            return false;
        }
        else{
            // Take
            if(ksumanySubsequence(index+1,arr,res,sum,calSum)==true) return true;
            calSum+=arr[index];
            res.add(arr[index]);
            
            // Not Take
            if(ksumanySubsequence(index+1,arr,res,sum,calSum)==true) return true;
            calSum-=arr[index];
            res.remove(res.size()-1);
            
            return false;
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 2;
        ksumanySubsequence(0,arr,res,sum,0);
    }
}

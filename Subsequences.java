import java.util.ArrayList;

public class Subsequences {
    public static void printSubsequence(int arr[],int index,ArrayList<Integer> res){
        if (index == arr.length){
            if (res.size()>0)
                System.out.println(res);
            if (res.size()==0)
                System.out.println("[]");
        }
        else{
//            Not Taking the current element
            printSubsequence(arr,index+1,res);
            res.add(arr[index]);
//            Taking the current element
            printSubsequence(arr,index+1,res);
//            Backtrack to remove the recently inserted element
            res.remove(res.size()-1);
        }

    }
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        ArrayList<Integer> res = new ArrayList<>();
        printSubsequence(arr,0,res);
    }
}

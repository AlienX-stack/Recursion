import java.util.*;
class HelloWorld {
    static boolean checkPalindrome(char ch[],int l,int r){
        if(l>=r/2)
        {
            return true;
        }
        // System.out.print(ch[l]);
        if(ch[l]!=ch[r-l-1])
        {
            return false;
        }
        return checkPalindrome(ch,l+1,r);
    }
    public static void main(String[] args) {
        String s = "MADAM";
        char ch[] = s.toCharArray();
        System.out.print(checkPalindrome(ch,0,ch.length));
    }
}

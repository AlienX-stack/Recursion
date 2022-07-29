class HelloWorld {
    static void print1toN_backtrack(int i,int n){
        if(i<1)
            return;
        print1toN_backtrack(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n=5;
        print1toN_backtrack(n,n);
    }
}

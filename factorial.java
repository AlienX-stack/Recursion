class HelloWorld {
    static int sum_functionalrecursion(int n){
        if(n==0)
            return 1;
        return n*sum_functionalrecursion(n-1);
    }
    public static void main(String[] args) {
        System.out.print(sum_functionalrecursion(4));
    }
}

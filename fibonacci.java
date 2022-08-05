class HelloWorld {
    static int fibonacci(int n){
        if(n<=1)
            return n;
        return fibonacci(n-2)+fibonacci(n-1);
    }
    public static void main(String[] args) {
        int n=6;
        System.out.print(n+"th fibonacci number is "+ fibonacci(n));
    }
}

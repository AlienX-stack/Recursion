// Parameterised way

class HelloWorld {
    static void sum_parameterised(int n,int sum){
        if(n<1)
        {
             System.out.println(sum);
             return;
        }
        sum_parameterised(n-1,sum+n);
    }
    public static void main(String[] args) {
        sum_parameterised(3,0);
    }
}


// Functional Recursion

class HelloWorld {
    static int sum_functionalrecursion(int n){
        if(n==0)
            return 0;
        return n+sum_functionalrecursion(n-1);
    }
    public static void main(String[] args) {
        System.out.print(sum_functionalrecursion(3));
    }
}

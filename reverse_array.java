class HelloWorld {
    
    static void reverseArr(int arr[],int l,int r){
        if(l>=r/2)
            return;
        int temp=0;
        temp=arr[l];
        arr[l]=arr[r-l-1];
        arr[r-l-1]=temp;
        reverseArr(arr,l+1,r);
    }
    
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5};
        int n = arr.length;
        // System.out.print(n);
        reverseArr(arr,0,n);
        for(int i:arr)
            System.out.print(i+" ");
    }
}

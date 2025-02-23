class Reverse_an_Array {
    public static void reverseArray(int arr[]) {
        // code here
        int l=0;
        int r=(arr.length)-1;
        //int mid=l+(r-l)/2;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
            
        }
    }
    public static void main(String[] args){

        int[] arr = {1, 4, 3, 2, 6, 5};
        reverseArray(arr);
        for(int num:arr){
            System.out.print(num);
        }
    }
}
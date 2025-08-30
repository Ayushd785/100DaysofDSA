public class constantWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  
        int k = 3;
        int ans = brain(arr, k);
        System.out.println(ans);
        
    }

    static int brain(int [] arr, int k){
        // int [] arr is the arrary in which we have perform the operation 
        // K is the window size 
        int l = 0;
        int r = 0;
        int n = arr.length;
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        while(r<=n-1){
            sum+= arr[r];
            if(r-l+1==k){
                ans = Math.max(ans,sum);
                sum-=arr[l];
                l++;
            }
            r++;
            
        }
        return ans;
    }
}

public class Longestsubarraysum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  
        int k = 8;
        int ans = brain(arr, k);
        System.out.println(ans);
    }
    static int brain(int[] arr, int k) {
    int n = arr.length;
    int l = 0, r = 0;
    int sum = 0;
    int ans = 0;

    while(r < n){
        sum += arr[r];  
        while(sum > k && l <= r){
            sum -= arr[l];
            l++;
        }

        ans = Math.max(ans, r - l + 1);
        r++;
    }

    return ans;
}

}

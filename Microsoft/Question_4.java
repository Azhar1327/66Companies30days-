public class Question_4{
    public int maxRotateFunction(int[] nums) {
        int s = 0;
        int f = 0;
        for(int i =0;i<nums.length;i++){
            f += nums[i]*i;
            s += nums[i];
        }
        int n = nums.length;
        int max = f;
        for(int i = n-1;i>=1;i--){
            f = f+s - (n*nums[i]);
            max = Math.max(max,f);
        }
        return max;
    }
}
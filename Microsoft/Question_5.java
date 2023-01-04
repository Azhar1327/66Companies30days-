public class Question_5 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int list[] = new int[nums.length];
        int prev[] = new int[nums.length];
        Arrays.sort(nums);
        Arrays.fill(prev,-1);
        int n = nums.length;
        int maxL = 0;
        for(int i =1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(nums[i]%nums[j] == 0 && list[j]+1 > list[i]){
                    list[i] = list[j]+1;
                    prev[i] = j;
                    if(list[maxL] < list[i]){
                        maxL = i;
                    }
                }
            }
        }
        return construct(nums,prev,maxL);

    }

    static List<Integer> construct(int num[],int list[],int max){
        List<Integer> ans = new ArrayList<>();
        while(max >= 0){
            ans.add(num[max]);
            max = list[max];
        }
        return ans;
    }
}
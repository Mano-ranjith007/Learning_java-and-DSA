public class prblm1 {
    class Solution {
    public int numberOfSteps(int num) {
        int ans = num;
        while(num!=0){
            if(num%2==0){
                ans=num/2;
            }else{
                ans=num-1;
            }
        }
        return ans;
    }
}
}

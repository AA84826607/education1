import java.util.HashMap;
import java.util.Map;

public class test {
    public int[] numrook(int[] nums,int target){
        int[] list=new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    list[0]=i;
                    list[1]=j;
                }
            }
        }
        return list;
    }

 public int[] num(int[] nums,int target){
     Map<Integer, Integer> hash = new HashMap<>();

     for (int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if (hash.containsKey(a)){
             return new int[] {
                     hash.get(a),i
             };
            }
            hash.put(nums[i],i);

        }throw new IllegalArgumentException("没有两个数可以");
 }
    public int reverse(int x) {
        int temp;
         int rs=0;
         while(x!=0){
             temp=x%10;
             x=x/10;
             rs=rs*10+temp;

         }
         if(rs>Integer.MAX_VALUE||rs<Integer.MIN_VALUE){
             return 0;
         }
         return rs;

    }
    
}

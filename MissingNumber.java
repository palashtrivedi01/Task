import java.util.Arrays;

//13. Find the Missing Number
//- Input: `nums = [3, 0, 1]`
//        - Output: `2`
public class MissingNumber {

    public static void main(String[] args) {
        int []nums={3,0,2,4};
        Arrays.sort(nums);
        int []arr=new int[nums.length+1];
        int a= Arrays.stream(nums).sum();
        for(int i=nums[0];i<=nums[nums.length-1];i++){
            arr[i]=i;
        }
        int b=Arrays.stream(arr).sum();
        System.out.println(b-a);
    }
}

import java.util.Arrays;

// This project uses subset sum


class TwoSums {

    public int[] twoSum(int[] nums, int target) {

        int sum = 0, i = 0, k = nums.length - 1;
        int result [] = new int[2];

        while(i < nums.length && k >= 0)
        {
            sum = nums[i] + nums[k];
            
            if(sum == target)
            {
                result[0] = i;
                result[1] = k;
                return result;
            }

            if(sum < target)
                i++;
            else
                k--;
        }

        
        return result;
    }

    public static void main(String[] args) {
        TwoSums twoSums = new TwoSums();

        if(args.length < 2) {
            System.err.println("Missing arguments <Target> <Num1> <Num2>....\n");
            return;
        }

        int target = Integer.parseInt(args[0]);

        int [] nums = new int[args.length - 1];

        for(int i = 1; i < args.length; i++)
        {
            nums[i - 1] = Integer.parseInt(args[i]); // i iterates from 1 cause first number is target
        }

        int []result = twoSums.twoSum(nums, target);

        if(result != null && result.length > 1)
            System.out.println(result[0] + " " + result[1]);
        else
            System.out.println("error");
        
    }
}
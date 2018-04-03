package A001_A050;

public class A001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A001 a001 = new A001();
		int[] nums = {2, 7, 11, 15};
		int[] result = a001.twoSum(nums, 9);
		System.out.println(result[0]+" "+result[1]);

	}
	
	public int[] twoSum(int[] nums, int target)
	{
		int[] result = {0, 0};
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1; j<nums.length; j++)
			{
				if(nums[i]+nums[j]==target)
				{
					result[0]=i;
					result[1]=j;
					return result;
				}
			}
		}
		return result;
	}

}

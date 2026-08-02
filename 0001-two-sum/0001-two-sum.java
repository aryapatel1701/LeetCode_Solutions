class Solution
{
	public static int[] twoSum(int[] nums, int target)
	{
	    for(int i = 0; i < nums.length; i++)
	    {
	        for(int j = i + 1; j < nums.length; j++)
	        {
	            if(nums[i] + nums[j] == target)
	            {
	                return new int[]{i, j};
	            }
	        }
	    }
	    return new int[]{-1, -1};
	}
    public static void main(String[] args)
    {
    		Scanner sc = new Scanner(System.in);
    		
    		int n;
    		
    		System.out.print("Enter size of array : ");
    		n = sc.nextInt();
    		
    		int arr[] = new int[n];
    		
    		System.out.println("Enter array elements : ");
    		for(int i = 0; i < arr.length; i++)
    		{
    		    arr[i] = sc.nextInt();
    		}
    		
    		System.out.println("Enter target : ");
    		int tg = sc.nextInt(); 
    		
    		int res[] = twoSum(arr,tg);
    		
    		for(int x : res)
    		{
    		    System.out.print(x + " ");
    		}
    		
    		sc.close();
	}
}
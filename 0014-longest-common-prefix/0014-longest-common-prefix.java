public class Solution
{
	public String longestCommonPrefix(String[] str)
	{
		StringBuilder ans = new StringBuilder();
		
		Arrays.sort(str);
		
		String first = str[0];
		String last  = str[str.length -1];
		
		for(int i = 0 ; i < Math.min(first.length(), last.length()) ; i++)
		{
			if(first.charAt(i) != last.charAt(i))
			{
				return ans.toString();
			}
			ans.append(first.charAt(i));
		}
		
		return ans.toString();	
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		
		int n;
		
		System.out.println("Enter how many strings you wanna store : ");
		n = sc.nextInt();
		sc.nextLine();
		
		String[] str = new String[n];
		
		System.out.println("Enter string elments : ");
		for(int i = 0 ; i < n ; i++)
		{
			str[i] = sc.nextLine();
		}
		System.out.println(s.longestCommonPrefix(str));
		
		sc.close();
	}
}

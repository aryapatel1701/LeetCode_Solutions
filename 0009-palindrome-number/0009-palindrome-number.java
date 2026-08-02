class Solution
{
    public static boolean isPalindrome(int x)
    {
        if (x < 0)
        {
            return false;
        }else
        {
        int revNo = 0;
        int no = x;

        while(x > 0)
        {
            int digit = x % 10;
            revNo = revNo * 10 + digit;
            x /= 10;
        }
        if(revNo == no)
        {
            return true;
        }
        else
        {
            return false;
        }
        }
    }
    public static void main(String[] args)
    {
    		Scanner sc = new Scanner(System.in);
    		
    		int x = sc.nextInt();
    		boolean result = isPalindrome(x);
    		
    		System.out.println(result);
    		
    		sc.close();
	} 
}
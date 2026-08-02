import java.util.Scanner;

class Solution
{
	 public int romanToInt(String s)
	 {
	        int num = 0;

	        for (int i = 0; i < s.length(); i++)
	        {
	            int current = value(s.charAt(i));

	            if (i < s.length() - 1)
	            {
	                int next = value(s.charAt(i + 1));

	                if (current < next) {
	                    num -= current;
	                } else {
	                    num += current;
	                }

	            } else {
	                num += current;
	            }
	        }

	        return num;
	    }

	    public static int value(char ch)
	    {
	        if (ch == 'I')
	            return 1;
	        else if (ch == 'V')
	            return 5;
	        else if (ch == 'X')
	            return 10;
	        else if (ch == 'L')
	            return 50;
	        else if (ch == 'C')
	            return 100;
	        else if (ch == 'D')
	            return 500;
	        else
	            return 1000;
	    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        System.out.print("Enter number in roman style : ");
        String rm = sc.nextLine();
        
        rm = rm.toUpperCase();

        System.out.println(s.romanToInt(rm));

        sc.close();
    }
}
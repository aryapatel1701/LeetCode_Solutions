import java.util.Scanner;

public class Solution
{
	Scanner sc = new Scanner(System.in);
	
    public boolean isValid(String s)
    {
        int top = -1;
	    char[] stack = new char[s.length()];
	    
    	char[] arr = s.toCharArray();
    	
    	for(int i = 0 ; i < s.length() ; i++)
    	{
    		if(arr[i] == '(' || arr[i] == '{' || arr[i] == '[')
    		{
    			top++;
    			stack[top] = arr[i];
    		}
    		else if(arr[i] == ')')
    		{
    		    if(top == -1)
                {
                    return false;
                }
    			else if(stack[top] == '(')
    			{
    				top--;
    			}
    			else
    			{
    				return false;
    			}
    		}
    		else if(arr[i] == '}')
    		{
    			if(top == -1)
                {
                    return false;
                }
    			else if(stack[top] == '{')
    			{
    				top--;
    			}
    			else
    			{
    				return false;
    			}
    		}
    		else if(arr[i] == ']')
    		{
    			if(top == -1)
                {
                    return false;
                }
    			else if(stack[top] == '[')
    			{
    				top--;
    			}
    			else
    			{
    				return false;
    			}
    		}
    	}
    	if(top == -1)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    	
    }
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	
    	Solution s = new Solution();
    	
    	String s1;
    	
    	System.out.println("Enter string : ");
    	s1 = sc.nextLine();
    	
    	System.out.println(s.isValid(s1));
    	
    	sc.close();
	}
}
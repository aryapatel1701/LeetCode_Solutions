class Solution {
    public static int mySqrt(int x)
    {
        int sqrt = 1;
        
        while(sqrt <= (int)x / sqrt)
        {
            if(sqrt * sqrt == (int)x)
            {
            	return sqrt;
            }
            sqrt++;
        }
        return sqrt-1;
    }
}
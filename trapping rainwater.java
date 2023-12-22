//PRINT trappedrainwater....

import java.util.*;
class trapping_rainwater
{
    public static int trappedrainwater(int height[])
    {
        int n=height.length;
        //CALCULATE LEFT MAX BOUNDARY..
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //CALCULATE RIGHT MAX BOUNDARY..

        int rightmax[]=new int[n];
        rightmax[0]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i],leftmax[i+1]);
        }
        int trappedwater=0;
        //loop
        for(int i=0;i<n;i++)
        {
            int waterlevel=Math.min(leftmax[i],rightmax[i] );

            trappedwater+=waterlevel-height[i];
        }
          return trappedwater;


    }
    public static void main(String args[])
    {
        int numbers[]={4,2,0,6,3,2,5};
         System.out.println(trappedrainwater(numbers));
    }
}
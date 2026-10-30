class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length)
        {
            return findMedianSortedArrays(nums2,nums1);
        }
        int m=nums1.length;
        int n=nums2.length;

        int low=0;
        int high=m;

        int leftsize=(m+n+1)/2;

        while(low<=high)
        {
            int partition1=low+(high-low)/2;
            int partition2=leftsize-partition1;

            int left1,left2,right1,right2;
            
            if(partition1==0)
            {
                left1=Integer.MIN_VALUE;
            }
            else
            {
                left1=nums1[partition1-1];
            }

            if(partition1==m)
            {
                right1=Integer.MAX_VALUE;
            }
            else
            {
                right1=nums1[partition1];
            }

            if(partition2==0)
            {
                left2=Integer.MIN_VALUE;
            }
            else
            {
                left2=nums2[partition2-1];
            }

            if(partition2==n)
            {
                right2=Integer.MAX_VALUE;
            }
            else
            {
                right2=nums2[partition2];
            }

            if(left1<=right2 && left2<=right1)
            {
                if((m+n)%2==1)
                {
                    return Math.max(left1,left2);
                }
                else
                {
                    return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                }
            }

            if(left1>right2)
            {
                high=partition1-1;
            }
            else
            {
                low=partition1+1;
            }

        }
        return 0.0;

    }
}
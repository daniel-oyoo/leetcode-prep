class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //sort arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int sum1=0,sum2=0;
        //find sum
        for(int i=0,j=0;i<nums1.length;i++){
            sum1=sum1+nums1[i];
            if(j<nums2.length)
            sum2=sum2+nums2[j];

            j++;
        }

        int total=sum1+sum2;
        int div=nums1.length+nums2.length;

        return (double)total/div;
    }
}

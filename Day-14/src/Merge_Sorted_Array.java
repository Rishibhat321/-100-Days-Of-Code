public class Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = new int[m+n];

        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                arr[k] = nums1[i];
                i++;
            }

            else if(nums1[i]==nums2[j])
            {
                arr[k] = nums1[i];
                k++;
                arr[k] = nums2[j];
                i++;
                j++;
            }

            else if(nums1[i]>nums2[j])
            {
                arr[k] = nums2[j];
                j++;
            }

            k++;
        }

        while(i<m)
        {
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while(j<n)
        {
            arr[k] = nums2[j];
            j++;
            k++;
        }

        for(int l=0;l<arr.length;l++)
        {
            nums1[l] = arr[l];
        }
    }

    public static void printSorted(int[] nums1, int m, int[] nums2, int n)
    {

        merge(nums1, m, nums2, n);
        System.out.println("Resulting sorted array is: ");

        for(int ele : nums1)
        {
            System.out.print(ele + " ");
        }


    }
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m=3;
        int n=3;

        printSorted(nums1, m, nums2, n);

    }
}

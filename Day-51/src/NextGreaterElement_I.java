
public class NextGreaterElement_I {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length];
        int ele =0;
        int index = -1;
        int j=0;

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = -1;
        }

        for(int i=0;i<nums1.length;i++)
        {
            ele = nums1[i];
            index = -1;

            for(j=0;j<nums2.length;j++)
            {
                if(nums2[j]==ele){
                    index = j;
                    break;
                }
            }

            if(index!=-1){
                for(int k=index;k<nums2.length;k++)
                {
                    if(nums2[k]>ele){
                        arr[i] = nums2[k];
                        break;
                    }
                }
            }

        }

        return arr;

    }

    public static void main(String[] args) {

        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int[] res = nextGreaterElement(nums1, nums2);

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}
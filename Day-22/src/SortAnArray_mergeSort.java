
public class SortAnArray_mergeSort {

    public static void merge(int[] nums,int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i]=nums[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            right[i]=nums[m+i+1];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                nums[k]=left[i];
                i++;
                k++;
            }
            else{
                nums[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1)
        {
            nums[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            nums[k]=right[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] nums,int low,int high){
        if(high>low)
        {
            int mid= low+(high-low)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }
    public static int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public static void main(String[] args) {

        int[] nums = {5,1,1,2,0,0};

        int[] res = sortArray(nums);

        System.out.println("The sorted array is: ");

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}
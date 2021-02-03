import java.util.*;

public class Two_Number_Sum{
    public static void main(String args[]){
        int[] array = {-1,2,-3,-4,5,6,-7,8,9,10};
        int target = 11;
        System.out.println(Arrays.toString(solve(array,target)));

    }

    public static int[] solve(int[] array, int target){
        Arrays.sort(array);
        int low = 0;
        int high = array.length - 1;
        while(low<high){
            int first = array[low];
            int second = array[high];
            int sum = first + second;
            if(sum == target){
                return new int[]{first, second};
            }else if(first + second < target){
                low++;
            } else{
                high -- ;
            }
        }
        return new int[0];
    }
}
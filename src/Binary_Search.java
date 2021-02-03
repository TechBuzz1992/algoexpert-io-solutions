
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
		int target = 33;
		
		System.out.println(binarySearch(array, target));

	}
	
	public static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length-1;
		while(low<=high) {
			int mid = (high+low)/2;
			if(array[mid] == target) {
				return mid;
			} else if(array[mid] > target) {
				high = mid -1;
			} else {
				low = mid+1;
			}
		}
		return -1;
	}

}

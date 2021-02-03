import java.util.*;

public class Product_Sum {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
 public static int productSum(List<Object> array) {
		return helper(array, 1);
	}
	
	public static int helper(List<Object> array, int multiplier) {
		int sum = 0;
		for(Object el : array) {
			if(el instanceof ArrayList){
				@SuppressWarnings("unchecked")
				ArrayList<Object> ls = (ArrayList<Object>) el;
				sum += helper(ls, multiplier+1);
			} else{
				sum+=(int)el;
			}	
		}
		return sum*multiplier;
		
	}
}

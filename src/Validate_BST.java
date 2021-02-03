
public class Validate_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean validateBST(BST root) {
		return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean helper(BST root, int min, int max) {
		if (root.value < min || root.value >= max)
			return false;
		if (root.left != null && !helper(root.left, min, root.value))
			return false;
		if (root.right != null && !helper(root.right, root.value, max))
			return false;
		return true;
	}

}

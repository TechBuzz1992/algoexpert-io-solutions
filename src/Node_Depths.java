
public class Node_Depths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int nodeDepths(BinaryTree root) {
		return helper(root, 0);
	}

	public static int helper(BinaryTree node, int depth) {
		if (node == null) {
			return 0;
		}

		return helper(node.left, depth + 1) + helper(node.right, depth + 1);
	}

}

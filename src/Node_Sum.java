
public class Node_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int solve(BinaryTree root) {
		int sum = 0;
		helper(root, 0, sum);
		return sum;
	}

	public static void helper(BinaryTree node, int running_sum, int sum) {
		if (node == null)
			return;

		running_sum += node.value;

		if (node.left == null && node.right == null) {
			sum += running_sum;
			return;
		}

		helper(node.left, running_sum, sum);
		helper(node.right, running_sum, sum);
	}

}

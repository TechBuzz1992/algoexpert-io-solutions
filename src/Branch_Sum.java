import java.util.ArrayList;
import java.util.List;

class BinaryTree {
	int value;
	BinaryTree right;
	BinaryTree left;

	public BinaryTree(int data) {
		this.left = this.right = null;
		this.value = data;
	}
}

public class Branch_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<Integer> solve(BinaryTree root) {
		List<Integer> sums = new ArrayList<>();
		helper(root, 0, sums);
		return sums;
	}

	public static void helper(BinaryTree tree, int running_sum, List<Integer> sums) {
		if (tree == null) {
			return;
		}

		running_sum += tree.value;
		if (tree.left == null && tree.right == null) {
			sums.add(running_sum);
			return;
		}

		helper(tree.left, running_sum, sums);
		helper(tree.right, running_sum, sums);

	}

}

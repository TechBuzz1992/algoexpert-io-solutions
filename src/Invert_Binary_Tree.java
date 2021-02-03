public class Invert_Binary_Tree {
	public static void invertBinaryTree(BinaryTree tree) {
		helper(tree);
		return;
	}

	public static BinaryTree helper(BinaryTree tree) {
		if (tree == null) {
			return null;
		}
		BinaryTree right = helper(tree.right);
		BinaryTree left = helper(tree.left);
		tree.left = right;
		tree.right = left;
		return tree;
	}

	static class BinaryTree {
		public int value;
		public BinaryTree left;
		public BinaryTree right;

		public BinaryTree(int value) {
			this.value = value;
		}
	}
}

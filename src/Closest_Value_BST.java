
class BST {
	int value;
	BST right;
	BST left;

	BST(int value) {
		this.left = this.right = null;
		this.value = value;
	}
}

public class Closest_Value_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int helper(BST tree, int key) {
		return getClosestValueBST(tree, key, tree.value);
	}

	public static int getClosestValueBST(BST tree, int key, int closest) {
		BST currNode = tree;
		while (currNode != null) {
			if (Math.abs(key - closest) > Math.abs(key - currNode.value)) {
				closest = currNode.value;
			}
			if (key < currNode.value) {
				currNode = currNode.left;
			} else if (key > currNode.value) {
				currNode = currNode.right;
			} else {
				break;
			}
		}
		return closest;
	}

}

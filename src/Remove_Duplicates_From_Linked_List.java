class LinkedList {
	int value;
	LinkedList next;

	LinkedList(int data) {
		this.value = data;
		this.next = null;
	}
}

public class Remove_Duplicates_From_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static LinkedList removeDuplicates(LinkedList head) {
		LinkedList node = head;
		LinkedList prev = node;
		while(node!=null) {
			if(node.value == prev.value) {
				node = node.next;
			} else {
				prev.next = node;
				prev = node;
				node = node.next;
			}
		}
		prev.next = null;
		return head;
	}

}

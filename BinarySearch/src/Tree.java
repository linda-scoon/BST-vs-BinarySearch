
public class Tree {

	private Node root;

	public Tree() {
		this.root = null;
	}

	/**
	 * insert node into tree
	 * 
	 * @param val
	 */
	public void add(int val) {
		Node node = new Node(val);

		// checking if root is set
		if (this.root == null) {
			this.root = node;
		} else {
			this.root.addNode(node);
		}
	}

	/**
	 * visit the nodes in the tree
	 */
	public void traverse() {
		this.root.visit();
	}

	/**
	 * 
	 * @param toFind
	 * @return
	 */
	public int search(int toFind) {
		return root.search(toFind);
	}

	@Override
	public String toString() {
		return "Tree [root=" + root + "]";
	}
}

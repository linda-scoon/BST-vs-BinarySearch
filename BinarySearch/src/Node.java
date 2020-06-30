public class Node {

	private int value;
	private Node left;
	private Node right;
	private int comp;

	/**
	 * @param val
	 */
	public Node(int val) {
		this.value = val;
		this.left = null;
		this.right = null;
	}

	/**
	 * Recursively adds nodes to the tree
	 * 
	 * @param n
	 */
	public void addNode(Node n) {
		if (n.getValue() < this.value) {
			if (left == null) {
				left = n;
			} else {
				left.addNode(n);
			}
		} else if (n.getValue() > this.value) {
			if (right == null) {
				right = n;
			} else {
				right.addNode(n);
			}
		}
	}

	/**
	 * recursively visits each node of the tree
	 */
	public void visit() {
		if (left != null) {
			left.visit();
		}
		System.out.println(value);
		if (right != null) {
			right.visit();
		}
	}

	/**
	 * finds a node and returns the number of comparisons required to find it
	 * 
	 * @param toFind
	 * @return comparisons
	 */
	public int search(int toFind) {

		if (value == toFind) {
			comp = 0;

		} else if (toFind < value && left != null) {
			comp = left.search(toFind);

		} else if (toFind > value && right != null) {
			comp = right.search(toFind);
		}
		comp++;
		return comp;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
}

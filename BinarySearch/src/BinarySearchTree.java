import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Flourish
 *
 */
public class BinarySearchTree {

	private int max;
	private int min;
	private int iterations;
	private ArrayList<Integer> xCords;
	private ArrayList<Double> yCords;
	private HashSet<Integer> unique;
	private Tree t;
	private int searches;

	/**
	 * @param args
	 */
	public BinarySearchTree() {
		max = 10000;
		min = 100;
		iterations = 1000;
		searches = 1000;
		xCords = new ArrayList<>();
		yCords = new ArrayList<>();
		unique = new HashSet<Integer>();
		t = new Tree();
	}

	public void xyGenerator() {

		for (int k = 0; k < iterations; k++) {
			double sum = 0;
			int numOfNodes = (int) ((Math.random() * max) + min + 1);// range 100 to 10,000
			xCords.add(numOfNodes);

			// create tree
			for (int i = 0; i < numOfNodes; i++) {

				int val = (int) (Math.random() * numOfNodes);
				while (!unique.add(val)) {
					val = (int) (Math.random() * numOfNodes);
				}
				t.add(val);
			}

			// compute length of path
			for (int j = 0; j < searches; j++) {

				// pick random node to find
				int toFind = (int) (Math.random() * numOfNodes);

				// find node and sum up length of paths
				sum += t.search(toFind);

				// for debugging
//				System.out.println("comps  :" + t.search(toFind));
			}
			double comparisons = sum / searches;

			yCords.add(comparisons);
			unique.clear();
		}
	}

	/**
	 * @return the xCords
	 */
	public ArrayList<Integer> getxCords() {
		return xCords;
	}

	/**
	 * @return the yCords
	 */
	public ArrayList<Double> getyCords() {
		return yCords;
	}
}

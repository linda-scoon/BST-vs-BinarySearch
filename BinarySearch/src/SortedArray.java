import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SortedArray {

	private int max;
	private int min;
	private int iterations;
	private ArrayList<Integer> xCords;
	private ArrayList<Double> yCords;
	private HashSet<Integer> unique;
	private int searches;

	public SortedArray() {
		max = 10000;
		min = 100;
		iterations = 1000;
		searches = 1000;
		xCords = new ArrayList<>();
		yCords = new ArrayList<>();
		unique = new HashSet<Integer>();
	}

	public void xyGenerator() {
		for (int k = 0; k < iterations; k++) {
			double sum = 0;
			int numOfNodes = (int) ((Math.random() * max) + min + 1);// range 100 to 10,000
			xCords.add(numOfNodes);

			// create array
			int[] toSort = new int[numOfNodes];
			for (int i = 0; i < toSort.length; i++) {

				int val = (int) (Math.random() * numOfNodes);
				while (!unique.add(val)) {
					val = (int) (Math.random() * numOfNodes);
				}
				toSort[i] = val;
			}

			// sort array
			Arrays.sort(toSort);

			// compute length of path
			for (int j = 0; j < searches; j++) {

				// pick random node to find
				int toFind = (int) (Math.random() * numOfNodes);

				// find node and sum up length of paths
				int comp = binarySearch(toFind, toSort, toSort[0], toSort[toSort.length - 1]);
				sum += comp;

				// for debugging
//				System.out.println(sum);
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

	/**
	 * 
	 * @param target
	 * @param a
	 * @param start
	 * @param end
	 * @return
	 */
	public int binarySearch(int target, int[] a, int start, int end) {
		// Find which if any component of a[start...end] contains target
		// (where a is sorted).
		int l = start, r = end, comparisons = 0;
		while (l <= r) {
			comparisons++;
			int m = (l + r) / 2;
			if (target < m)
				r = m - 1;
			else if (target > m)
				l = m + 1;
			else // target == m
				return comparisons;
		}
		return comparisons;
	}
}

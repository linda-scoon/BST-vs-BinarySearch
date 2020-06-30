
public class InsertionSort {

	public static void main(String[] args) {
		int a[] = new int[] { 56, 4, 6, 2, 9, 1, 5, 7, 4, 7, 8, 3, 2, 6, 4, 81, 2 };
		int[] v = sort(a);
		for (int i = 0; i < v.length; i++) {

			System.out.println(sort(a)[i]);
		}

	}

	private static int[] sort(int[] u) {

		for (int j = 1; j < u.length; ++j) {
			int pointer = u[j];
			int i = j - 1;

//			System.out.println(pointer);
			while (i >= 0 && u[i] > pointer) {
				u[j] = u[i];
				i--;

			}
			u[++i] = pointer;
//			System.out.println(u[i]);
		}

		return u;
	}

}

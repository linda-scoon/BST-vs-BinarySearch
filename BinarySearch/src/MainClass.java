
public class MainClass {

	public static void main(String[] args) {

		BinarySearchTree bs = new BinarySearchTree();
		bs.xyGenerator();

		System.out.println("bstX = " + bs.getxCords() + ";");
		System.out.println("bstY = " + bs.getyCords() + ";");

		SortedArray sa = new SortedArray();
		sa.xyGenerator();

		System.out.println("arrayX = " + sa.getxCords() + ";");
		System.out.println("arrayY = " + sa.getyCords() + ";");
	}

}

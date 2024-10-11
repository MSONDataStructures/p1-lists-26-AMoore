public class MyListsTest {

	public static void main(String[] args) {
		MyGenLinkedList<Integer> linky = new MyGenLinkedList<>();
		for (int i = 0; i < 100; i++) {
			linky.add(i, i);
		}
		for (int i = 0; i < linky.size(); i++) {
			System.out.println(i + ": " + linky.get(i));
			if (i % 2 == 0) {
				linky.remove(i);
			}
		}
		System.out.println("-----------------------");
		for (int i = 0; i < 100; i++) {
			System.out.println(i + ": " + linky.get(i));
		}
	}
}

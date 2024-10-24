public class MyListsTest {

	public static void main(String[] args) {
		/*
		MyLinkedList list = new MyLinkedList();

		list.first = new MyLinkedList.Node(100, list.first);
		System.out.println(list.get(0));
		System.out.println(list.first);
		System.out.println(list.first.value);
		System.out.println();

		list.first = new MyLinkedList.Node(101, list.first);
		System.out.println(list.first);
		System.out.println(list.get(0));
		System.out.println(list.first.next);
		System.out.println(list.get(1));
		System.out.println();
		*/
		MyArrayList list = new MyArrayList();
        list.addLast(18);
        list.addLast(45);
        list.addLast(67);
        list.addLast(73);
        list.addLast(88); // 18, 45, 67, 73, 88

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

		System.out.println("d fsaf d f");

		list.add(1, 34);

		System.out.println("1, 34");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
        list.add(1, 22);
		System.out.println("1, 22");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
        list.add(0, 9);
		System.out.println("0, 9");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
        list.add(8, 91);
		System.out.println("8, 91");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
        list.add(5, 56); // 9, 18, 22, 34, 45, 56, 67, 73, 88, 91
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
	}
}

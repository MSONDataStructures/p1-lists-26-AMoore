/**{{{
 * The MyLinkedList class is the implementation of a singly-linked list of
 * integers.
 * <p>
 * The data in the list will be stored in <code>Node</code> objects, with
 * each node storing one integer and a link to the next node in the list.
 * Our <code>MyLinkedList</code> will implement many of the same methods
 * as the <code>MyArrayList</code> class, but here the <code>add</code>
 * method with one parameter becomes the <code>addFirst</code> method;
 * instead of adding to the end of the list, it adds to the front.
 * <p>
 * Students should not, again, use the <code>java.util.LinkedList</code>
 * Java library class. Due to the nature of the Java garbage collector,
 * attention must be paid to the order used for certain operations. You
 * need to "hold on" to anything you do not want to lose with an object
 * reference, and only overwrite a reference if you no longer need the
 * object that it is referencing.
 * <p>
 * You may, of course, wish to add additional instance fields and private
 * methods, but please do not modify public interface. Again, remember to
 * avoid the <code>IndexOutOfBoundsException</code> and throw the
 * <code>NullPointerException</code> where noted.
 }}}*/
public class MyGenLinkedList<T>
{
	/**{{{
	 * The Node class is a private inner class of the <code>MyLinkedList</code>
	 * class. Since none of the methods of <code>MyLinkedList</code> will return
	 * a node, it is safe to make the instance fields here public.
	 * If you prefer, you may replace this with a separate top-level class.
	 * Also, you can build a constructor or use the default constructor.
	 }}}*/
	private static class Node<T>
	{
		// These fields both default to null.
		public T value;
		public Node<T> next;

		public Node(T value, Node<T> next) {
			this.value = value;
			this.next = next;
		}
	}

	private Node<T> first;

	/**{{{
	 * Constructs an empty list.
	 }}}*/
	public MyGenLinkedList() {
		first = null;
	}

	/**{{{
	 * Appends the specified Integer to the beginning of the list.
	 * @param item Integer to be appended to this list
	 * @throws NullPointerException if item is null
	 }}}*/
	public void addFirst(T item) {
		first = new Node<T>(item, first);
	}

	/**{{{
	 * Inserts the specified Integer at the specified position in this list.
	 * Shifts the element currently in that position (if any) and any subsequent
	 * elements to the right (adding one to their indices).
	 * @param index index at which the specified Integer is to be inserted
	 * @param item Integer to be inserted
	 * @throws NullPointerException if item is null
	 }}}*/
	public void add(int index, T item) {
		if (index == 0) {
			this.addFirst(item);
		}
		Node<T> prevNode = null;
		Node<T> currNode = first;
		for (int i = 0; i <= index; i++) {
			prevNode = currNode;
			currNode = currNode.next;
		}
		prevNode.next = new Node<T>(item, currNode);
	}

	/**{{{
	 * Removes the Integer at the specified position in this list. Shifts any
	 * subsequent Integers to the left (subtracts one from their indices).
	 * @param index the index of the Integer to remove
	 * @return the Integer that was removed from the list
	 }}}*/
	public T remove(int index) {
		if (index == 0) {
			first = first.next;
		}
		Node<T> node = first;
		Node<T> prevNode = first;
		for (int i = 0; i < index; i++) {
			prevNode = node;
			node = node.next;
		}
		//Creates memory without a ref to it?
		prevNode.next = node.next;
		T returnVal = node.value;
		//fixes it?
		node = null;
		return returnVal;
	}

	/**{{{
	 * Returns the Integer at the specified position in this list.
	 * @param index index of the element to return
	 * @return the Integer at the specified position in this list
	 }}}*/
	public T get(int index) {
		Node<T> node = first;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node.value;
	}

	/**{{{
	 * Replaces the Integer at the specified position in this list with the
	 * specified Integer.
	 * @param index index of the integer to replace
	 * @param item Integer to be stored at the specified position
	 * @throws NullPointerException if item is null
	 }}}*/
	public void set(int index, T item) {
		Node<T> node = first;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		node.value = item;
	}

	/**{{{
	 * Returns the number of Integers in this list.
	 * @return the number of Integers in this list
	 }}}*/
	public int size() {
		int size = 0;
		Node<T> node = first;
		while (node.next != null) {
			node = node.next;
			size++;
		}
		return size;
	}

	/**{{{
	 * Returns the index of the first occurrence of the specified Integer in this list,
	 * or -1 if this list does not contain the Integer.
	 * @param item Integer to search for
	 * @return the index of the first occurrence of the specified Integer in this list,
	 * or -1 if this list does not contain the Integer
	 * @throws NullPointerException if item is null
	 }}}*/
	public int indexOf(T item) {
		Node<T> node = first;
		int count = 0;
		while (node.next != null) {
			count++;
			if (node.value == item) {
				return count;
			}
		}
		return 0;
	}

	/**{{{
	 * Returns <code>true</code> if this list contains the specified Integer.
	 * @param item Integer whose presence in this list is to be tested
	 * @return true if this list contains the specified Integer
	 * @throws NullPointerException if item is null
	 }}}*/
	public boolean contains(T item) {
		Node<T> node = first;
		while (node.next != null) {
			if (node.value == item) {
				return true;
			}
			node = node.next;
		}
		return false;
	}

	/**{{{
	 * Removes all the elements from this list. The list will be empty after this
	 * call returns.
	 }}}*/
	public void clear() {
		first = null;
		//does this leave a bunch of data that has no refrence?
		//yes
		//will I just have the garbage collector fix it because im tired
		//also yes
	}

	/**{{{
	 * Returns <code>true</code> if this list has no elements.
	 * @return true if this list is empty
	 }}}*/
	public boolean isEmpty() {
		return first == null;
	}
}

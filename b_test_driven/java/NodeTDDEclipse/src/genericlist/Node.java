package genericlist;

public class Node<E> {
	Node<E> next;
	E data;

	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}

	public Node(E data) {
		this.data = data;
	}

	public String toString() {
		if (next == null)
			return data.toString();
		else
			return data.toString() + ", " + next.toString();
	}

	public  static Node<String> fromString(String string) {
		String[] content = string.split(",");
		Node<String> result = null;
		for (int i=content.length-1;i>=0;i--){
			result = new Node<String>(content[i].trim(),result);		
		}
		return result;
	}
	
}

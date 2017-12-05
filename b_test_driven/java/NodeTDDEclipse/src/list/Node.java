package list;

public class Node {
	Node next;
	Object data;

	public Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Node(Object data) {
		this.data = data;
	}

	public String toString() {
		if (next == null)
			return data.toString();
		else
			return data.toString() + ", " + next.toString();
	}

	public static Node fromString(String string) {
		String[] content = string.split(",");
		Node result = null;
		for (int i=content.length-1;i>=0;i--){
			result = new Node(content[i].trim(),result);		
		}
		return result;
	}
	
}

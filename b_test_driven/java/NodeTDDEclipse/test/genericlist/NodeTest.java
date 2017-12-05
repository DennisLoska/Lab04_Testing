package genericlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NodeTest {

	@Test
	public void testToString1() {
		Node<String> n = new Node<String>("a");
		assertEquals("a", n.toString());
	}

	@Test
	public void testToString2() {
		Node<String> n = new Node<String>("a", new Node<String>("b", new Node<String>("c")));
		assertEquals("a, b, c", n.toString());
	}

	@Test
	public void testConvenienceConstructor() {
		Node<String> n = Node.fromString("g,h,i");
		assertEquals("g, h, i", n.toString());
	}
	@Test
	public void testConvenienceConstructorWithSpaces() {
		Node<String> n = Node.fromString("g, h,   i");
		assertEquals("g, h, i", n.toString());
	}
}

package list;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NodeTest {

	@Test
	public void testToString1() {
		Node n = new Node("a");
		assertEquals("a", n.toString());
	}

	@Test
	public void testToString2() {
		Node n = new Node("a", new Node("b", new Node("c")));
		assertEquals("a, b, c", n.toString());
	}

	@Test
	public void testConvenienceConstructor() {
		Node n = Node.fromString("g,h,i");
		assertEquals("g, h, i", n.toString());
	}
	@Test
	public void testConvenienceConstructorWithSpaces() {
		Node n = Node.fromString("g, h,   i");
		assertEquals("g, h, i", n.toString());
	}
}

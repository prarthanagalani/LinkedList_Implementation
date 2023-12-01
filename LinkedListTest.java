import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class LinkedListTest {

    @Test
    public void testSearch() {
        // Create an instance of the class under test
        LLImplementation LL = new LLImplementation();

        // Add nodes to the linked list
        LL.addNode(70);
        LL.addNode(56);
        LL.addNode(30);

        // Perform the search operation
        Node searchedNode = LL.search(30);

        // Perform assertions
        assertNotNull("Node with value 30 should be found", searchedNode);
        assertEquals("Node should have data 30", 30, searchedNode.data);
    }
}

public class task4 {

    public static void main(String[] args) {
        Node[] nodes = new Node[3];

        Node root = new Node(0, null);

        Node n1 = new Node(0, root);
        Node n2 = new Node(1, n1);
        Node n3 = new Node(2, n2);


        // Task 4.1
        nodes[0] = n1;
        nodes[1] = n2;
        nodes[2] = n3;

        nodes[0] = nodes[2];
        nodes[2] = nodes[1];

        for (Node n : nodes) {
            System.out.println("Current Node: " + n.getID() + " - Linked Node: " + n.getLinkedNode().getID());
        }
        System.out.println("\n");

        // Task 4.2
        nodes[0] = n1;
        nodes[1] = n2;
        nodes[2] = n3;

        nodes[0] = nodes[1];
        nodes[1] = nodes[2];
        nodes[0] = nodes[1];

        for (Node n : nodes) {
            System.out.println("Current Node: " + n.getID() + " - Linked Node: " + n.getLinkedNode().getID());
        }
    }
}

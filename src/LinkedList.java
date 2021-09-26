public class LinkedList {
    public Node addNode(Node head, int data){
        Node newNode = new Node(data);

        if(head == null)
            head = newNode;

        else{
            Node temp = head;
            while(temp.next != null){
                temp.next = temp.next.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    public void display(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
    }
}

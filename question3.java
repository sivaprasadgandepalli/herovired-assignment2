class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
class LinkedList{
    Node head;
    int size;
    LinkedList(){
        this.head= null;
        this.size=0;
    }
    boolean isEmpty() {
        if (this.size == 0)
            return true;
        else
            return false;
    }

    Node getHead() {
        return this.head;
    }
    void appendNode(int dataNode) {
        Node currentNode = new Node(dataNode);

        if(isEmpty() == true){
            this.head = currentNode;
        }else{
            Node prev = this.head;
            while( prev.next!= null){
                if(prev.data==currentNode.data)
                {
                    break;
                }
                prev = prev.next;    
            }
            if(prev.data!=currentNode.data) prev.next = currentNode;
        }
        this.size++;
    }
    void printData() {
        if (this.isEmpty()) {
            System.out.println("list is empty");
        } else {
            Node currentNode = this.head;
            while (currentNode != null) {
                System.out.print(currentNode.data+" ");
                currentNode = currentNode.next;
            }

        }
    }
}
public class question3 {
    public static void main(String[] args) {
        LinkedList studentIDLinkedList = new LinkedList();

        studentIDLinkedList.appendNode(2);
        studentIDLinkedList.appendNode(5);
        studentIDLinkedList.appendNode(12);
        studentIDLinkedList.appendNode(2);
        studentIDLinkedList.appendNode(3);
        studentIDLinkedList.appendNode(5);
        studentIDLinkedList.appendNode(1);
        studentIDLinkedList.appendNode(2);
        studentIDLinkedList.appendNode(5);
        studentIDLinkedList.appendNode(5);
        studentIDLinkedList.printData();
    }
}

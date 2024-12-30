public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void AddFirst(int data){

        // Step-1 create new node
        Node newNode = new Node(data);

        if (head==null){
            head=tail= newNode;
            return;
        }
        //step-2 newNode->next= start(head)
        newNode.next= head;

        //step-3 head = newNode
        head = newNode;
    }
    public void AddLast(int data){
        // Step-1 create a new Node
        Node newNode = new Node(data);

        if (head==null){
            head=tail= newNode;
            return;
        }
        // step-2 tail->next = new Node
        tail.next = newNode;

        //step-3 tail = new Node
        tail = newNode;

    }
    public void print(){
        if (head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void add(int idx , int data){
        if(idx==0){
            AddFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.add(2,9);
        ll.print();
    }
}

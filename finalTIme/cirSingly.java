public class cirSingly{

    Node head;
    Node tail;

    class Node{
        Node next;
        int data;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
        public Node(int data){
            this.data = data;
        }
    }

    public void insert(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail = node;
            return;
        }
        node.next = head;
        head = node;
    }
    public void insertLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        tail.next = head; 
    }

    public void deleteAtPosition(int index){
        if(head == null){
            System.out.println("No elements to delete.");
            return;
        }

        if(index== 0){
            head = head.next;
            return;
        }

        Node temp = head;
        for(int i= 1; temp != tail; i++){
            if(i == index -1 ){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }

    }

    public void display(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        do{
            System.out.print(" "+temp.data+"-->");
            temp = temp.next;
        }while(temp != head);
        System.out.print("Beginning");
    
    }

    public static void main(String[] args) {
        cirSingly ss = new cirSingly();
        ss.insert(1);
        ss.insert(2);
        ss.insert(3);
        ss.insert(4);
        ss.insert(5);
        ss.insertLast(6);
        ss.deleteAtPosition(3);
        ss.display();
    }


}
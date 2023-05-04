public class singlylist {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
        Node(int data){
            this.data = data;
        }
    }

    public void insertFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void insertLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void display(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(" "+temp.data+"-->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        singlylist si = new singlylist();
        si.insertFirst(1);
        si.insertFirst(2);
        si.insertFirst(3);
        si.insertFirst(4);
        si.insertLast(5);
        si.display();
    }

}

public class linearQueue {
    int rear;
    int front;
    int[] arr;
    int size;

    public linearQueue(int size){
        this.size = size;
        this.rear = -1;
        this.front = -1;
        this.arr = new int[size];
    }

    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return rear == size -1;
    }

    public void insert(int data){
        if(isFull()){
            System.out.println("The queue is full.");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    public void remove(){
        if(isEmpty()){
            System.out.println("The queue is Empty.");
            return;
        }
        System.out.println("The removed item is "+arr[0]);
        for(int i = 1; i<rear; i++){
            arr[i-1] = arr[i];
        }
        rear--;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("The dequeue order is: ");
        for(int i = 0; i<=rear; i++){
            System.out.println(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        linearQueue lq = new linearQueue(7);
        lq.insert(1);
        lq.insert(2);
        lq.insert(3);
        lq.insert(4);
        lq.insert(5);
        lq.display();
    }
}

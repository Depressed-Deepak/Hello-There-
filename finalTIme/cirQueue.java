public class cirQueue {
    int rear;
    int front;
    int[] arr;
    int size;

    public cirQueue(int size){
        this.size = size;
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty(){
        return rear == -1 && front == -1;
    }
    public boolean isFull(){
        return (rear + 1 )% size == front;
    }

    public void insert(int data){

        if(isFull()){
            System.out.println("The queue is full.");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public void remove(){

        if(isEmpty()){
            System.out.println("The queue is empty.");
            return;
        }
        System.out.println("The deleted item is "+arr[front]);
        front = (front + 1) % size;
    }

    public void display(){
        if(isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        }
            do{
                System.out.print(arr[front]+" " );
                front = (front + 1)% size;
            }while(front != (rear + 1)%size);
        }
    public static void main(String[] args) {
        cirQueue cc = new cirQueue(5);
        cc.insert(1);
        cc.insert(2);
        cc.insert(3);
        cc.insert(4);
        cc.insert(5);
        cc.remove();
        cc.insert(6);
    }
}

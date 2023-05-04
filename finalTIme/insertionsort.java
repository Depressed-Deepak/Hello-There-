public class insertionsort {
    
    public void sorting(int[] arr){
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int key = arr[i];
            int j= i-1;

            while(j>= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        
    }

    public void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        insertionsort sc = new insertionsort();
        int[] ary = {2,44,6,12,21,86,8};
        sc.sorting(ary);
        sc.print(ary);
    }
}

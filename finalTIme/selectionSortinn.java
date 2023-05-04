public class selectionSortinn {
    
    public void sort(int[] arr){
        int n = arr.length;

        for(int i =0; i<n; i++){
            int min = i;

            for(int j = i+1; j<n ; j++){
                if(arr[j] < arr[min]){
                    j = min;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        selectionSortinn si = new selectionSortinn();
        int[] ary = {2,44,6,12,21,86,8};
        si.sort(ary);
        si.print(ary);
    }
}

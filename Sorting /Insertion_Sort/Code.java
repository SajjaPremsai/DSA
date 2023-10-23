public class Code {
    public static void main(String[] args) {
       int arr[] = {8,9,3,2,1,3,11};
       for(int i = 0 ; i < arr.length-1;i++){
        for(int j = i+1 ; j>0;j--){
            if(arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
            else  break;
        }
       }
       for(int k = 0 ; k < arr.length ; k ++)
            System.out.print(arr[k] + " ");
    }
}

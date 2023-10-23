public class Code {
    public static void main(String[] args) {
        int arr[] = {9,324,24213,5,3,2,5,65,22};
        for(int i = 0 ; i< arr.length ;i++){
            int last = arr.length-1-i;
            int max_index = maxElement(arr,0,last);
            int temp = arr[max_index];
            arr[max_index] = arr[last];
            arr[last] = temp;
        } 
        for(int k = 0 ; k < arr.length ; k ++)
            System.out.print(arr[k] + " ");       
    }
    static int maxElement(int arr[],int start,int last){
        int max = start;
        for(int i = 1 ; i < last ; i++){
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }
}

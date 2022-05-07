public class MinimumAndMaximumOfArray {
    public int[] ComputeMinMax(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i =0; i< arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return new  int[] {min, max};
    }
}

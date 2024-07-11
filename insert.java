package DSA_Assignment;
public class insert {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,5,6,7,8,9};
        int[] res = insertelement(arr,4,4);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static int[] insertelement(int[] arr, int index, int key){
        int[] res = new int[arr.length+1];
        for (int i = 0; i < res.length; i++) {
            if (i<index) {
                res[i] = arr[i];
            }
            else if (i==index) {
                res[i] = key;
            }
            else{
                res[i] = arr[i-1];
            }
        }
        return res;
    }
}
package DSA_Assignment;
public class delete {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int[] res = deleteElement(arr, 5);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] deleteElement(int[] arr, int index){
        int[] res = new int[arr.length-1];
        for (int i =0; i < res.length; i++) {
            if (i<index) {
                res[i] = arr[i];
            }
            else if (i>=index) {
                res[i] = arr[i+1];
            }
        }
        return res;
    }
}

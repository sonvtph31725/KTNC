public class CheckArraySum {
    public static int checkArray(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
}

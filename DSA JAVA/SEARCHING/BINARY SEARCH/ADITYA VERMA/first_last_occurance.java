public class first_last_occurance {
    public static void main(String[] args) {
  
        int arr[] = {2, 4, 10, 10, 10, 18, 20};
        int target = 10;

        int fo = searchfo(arr, target);
        int lo = searchlo(arr, target);

        System.out.println(fo + " " + lo);
        
    }

    public static int searchfo(int arr[], int target) {
        int fo = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                fo = mid;
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return fo;
    }

    public static int searchlo(int arr[], int target) {
        int lo = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                lo = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lo;
    }
}

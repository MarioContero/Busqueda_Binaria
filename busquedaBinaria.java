import java.util.Arrays;

public class busquedaBinaria {
  public static int binarySearch(int[] arr, int target) {
    Arrays.sort(arr);
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {2, 4, 6, 8, 10};
    int target = 8;
    int result = binarySearch(arr, target);
    if (result == -1) {
      System.out.println("El número no se encuentra en el arreglo.");
    } else {
      System.out.println("El número se encuentra en el índice " + result + " del arreglo.");
    }
  }
}

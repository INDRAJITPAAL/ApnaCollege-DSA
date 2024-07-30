public class array_method {
    public static void a_method(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 66, 77, 31 };
        for (int a : arr) {
            System.out.println(a);

        }
        a_method(arr);
        for (int a : arr) {
            System.out.println(a);

        }
    }
}

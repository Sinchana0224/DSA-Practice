public class InsertAtEnd {
    // Function to insert element at end of array
    static int insertAtEnd(int arr[], int n, int x, int capacity) {
        if (n >= capacity)
            return n;

        arr[n] = x;
        return (n + 1);
    }

    public static void main(String[] args) {
        int capacity = 100;
        int arr[] = new int[capacity];

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 20;
        int n = 3;

        int x = 15;

        System.out.println("Before insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        n = insertAtEnd(arr, n, x, capacity);

        System.out.println("\nAfter insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

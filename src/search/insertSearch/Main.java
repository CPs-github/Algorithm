package search.insertSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++){
            arr[i] = i*i;
        }
        System.out.println(new InsertSearch(arr,169).search());
    }
}

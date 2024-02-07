public class MainApp {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addToEnd(10);
        list.addToEnd(20);
        list.addToFront(5);
        list.addToFront(1);

        System.out.println("Size of the list: " + list.size()); // Output: 4
        System.out.println("Element at index 2: " + list.get(2)); // Output: 5
    }
}
